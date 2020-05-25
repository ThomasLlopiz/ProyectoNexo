/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entidad.registro;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {
  Conexion con = new Conexion();
  JdbcTemplate jdcbTemplate = new JdbcTemplate (con.Conectar());
  ModelAndView mav = new ModelAndView();
  List datos;
  int IdDNI;

  
  @RequestMapping("index.htm")
  public ModelAndView Listar(){
      String sql = "select * from registros ";
      datos = this.jdcbTemplate.queryForList(sql);
      mav.addObject("lista",datos);
      mav.setViewName("index");
      return mav;
  }
  @RequestMapping (value = "agregar.htm", method = RequestMethod.GET)
  public ModelAndView Agregar(){
  mav.addObject(new registro());
  mav.setViewName("agregar");
  return mav;
  }  
  @RequestMapping (value = "agregar.htm", method = RequestMethod.POST)
  public ModelAndView Agregar(registro r){
  String sql = "insert into registros (idDNI, nombre, apellido, edad, foto)values (?,?,?,?,?)";
  this.jdcbTemplate.update(sql,r.getidDNI(),r.getnombre(),r.getapellido(),r.getedad(),r.getfoto());
  return new ModelAndView("redirect:/index.htm");
  } 
  @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
  public ModelAndView Editar (HttpServletRequest request){
  IdDNI=Integer.parseInt(request.getParameter("IdDNI"));
  String sql="select * from registros where idDNI="+IdDNI;
  datos = this.jdcbTemplate.queryForList(sql);
  mav.addObject("lista",datos);
  mav.setViewName("editar");
  return mav;
  }
  @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
  public ModelAndView Editar (registro r){
      String sql = "update registros set idDNI=?,nombre=?,apellido=?,edad=?,foto=? where idDNI="+IdDNI;
      this.jdcbTemplate.update(sql,r.getidDNI(),r.getnombre(),r.getapellido(),r.getedad(),r.getfoto());
      return new ModelAndView("redirect:/index.htm");
  }
  
  @RequestMapping("delete.htm")
  public ModelAndView Delete(HttpServletRequest request){
      IdDNI=Integer.parseInt(request.getParameter("IdDNI"));
      String sql="delete from registros where idDNI="+IdDNI;
      this.jdcbTemplate.update(sql);
      return new ModelAndView("redirect:/index.htm");
  }
    
}
