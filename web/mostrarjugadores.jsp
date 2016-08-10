<%-- 
    Document   : mostrar
    Created on : 21-jul-2016, 22:26:40
    Author     : robertoayala
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Mostrar Jugadores</title>
    </head>
    <body>
        
        <!-- NAV -->
        <nav class="navbar navbar-inverse">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="agrega.jsp">Registro Personal</a></li>
                    <li><a href="agregajugador.jsp">Registro Jugadores</a></li>
                    <li><a href="agregaingreso.jsp">Registro Ingresos</a></li>
                </ul>
            </div>
        </nav>
        
    <center>
    <h1>Muestra datos de jugadores</h1>
        
<table data-toggle="table" border="1" bordercolor="#E6E6E6" align="center">
    <thead>
    <tr>
        <th>Nombre &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</th>     
        <th>Cantidad &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</th>   
        <th>Hora &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</th>       
    </tr>
    </thead>
    
	<c:forEach var="registros" items="${datos}">
		<tr>
			<c:forEach var="variables" items="${registros}">
				<td>
                                    ${variables}
				</td>
			</c:forEach>
		</tr>
	</c:forEach>
</table>
        
    <div class="container">   
            <center>
                <br><br>
                <hr>
                <br>
            <h2>REGISTROS</h2>    
                <a class="btn btn-default btn-lg" href="Consulta" role="button">Personal</a>&emsp;
                <a class="btn btn-default btn-lg" href="ConsultaJugador" role="button">Judadores</a>&emsp;
                <a class="btn btn-default btn-lg" href="ConsultaIngreso" role="button">Ingresos</a>
            </center>
            <br>
        </div>
        
    </center>
    </body>
</html>

