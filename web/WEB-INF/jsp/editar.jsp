<%-- 
    Document   : editar
    Created on : May 21, 2020, 6:21:22 PM
    Author     : Thomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Registro</title>
    </head>
    <body>
          <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <h4>Actualizar Registro</h4>
            </div>
            <div class="card-body">
                <form method="POST">
                    <label>DNI</label>
                    <input type="text" name="idDNI" class="form-control" value="${lista[0].idDNI}">
                    <label>Nombre</label>
                    <input type="text" name="nombre" class="form-control" value="${lista[0].nombre}">
                    <label>Apellido</label>
                    <input type="text" name="apellido" class="form-control" value="${lista[0].apellido}">
                    <label>Edad</label>
                    <input type="text" name="edad" class="form-control" value="${lista[0].edad}">
                    <label>Foto</label>
                    <input type="file" name="filefoto" class="form-control" value="${lista[0].foto}">
                    <input type="submit" value="Actualizar" class="btn btn-success">
                    <a href="index.htm">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
