<%-- 
    Document   : agrega
    Created on : 21-jul-2016, 22:21:15
    Author     : robertoayala
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>
  
<!DOCTYPE html>
<html>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
      crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" 
      integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" 
      crossorigin="anonymous">
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Registro</title>
    </head>
    <body>
        
         <!-- NAV -->
        <nav class="navbar navbar-inverse">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="agrega.jsp">Registro Personal</a></li>
                    <li class="active"><a href="agregajugador.jsp">Registro Jugadores</a></li>
                    <li><a href="agregaingreso.jsp">Registro Ingresos</a></li>
                </ul>
            </div>
        </nav>
        
        <!--HORA-->
        <%
            Date dNow = new Date();
            SimpleDateFormat ft = 
            new SimpleDateFormat ("dd-MM-yyyy HH:mm:ss");
            String currentDate = ft.format(dNow);
        %>
        
    <center> <h1>Registrar Jugadores!</h1> </center>

    <div class="container">
        <form action="AgregaJugadorServlet" method="post">
            <div class="form-group">
                <label>Nombre de Equipo:</label>
                <input type="text" name="Nombres" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Cantidad de Jugadores:</label>
                <input type="text" name="Cantidad" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Fecha y Hora:</label>
                <input type="datetime" name="Hora" value="<%=currentDate%>" readonly="readonly">
            </div>
            
            <button type="submit" class="btn btn-default">Submit</button>
        
        </form>
    </div>
    
    <br><br><hr size="10" /><br>
    
    <div class="container">
        <p><a class="btn btn-success btn-md" href="ConsultaJugador" role="button">Mostrar Registros</a></p>
    </div>
    
    </body>
</html>