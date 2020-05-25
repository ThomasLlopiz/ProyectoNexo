/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 *
 * @author Thomas
 */
public class Conexion {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    public DriverManagerDataSource Conectar(){
        try{
            
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/registrodedatos");
    dataSource.setUsername("root");
    dataSource.setPassword("");
        }catch(Exception e){ 
            
        }
        return dataSource;
}
}
