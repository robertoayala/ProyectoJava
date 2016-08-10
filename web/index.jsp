<%-- 
    Document   : index.jsp
    Created on : 21-jul-2016, 22:18:11
    Author     : robertoayala
--%>
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
        <title>Principal</title>
    </head>
    <body>
        
        <!-- NAV -->
        <nav class="navbar navbar-inverse">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">HOME</a></li>
                    <li><a href="agrega.jsp">Registro Personal</a></li>
                    <li><a href="agregajugador.jsp">Registro Jugadores</a></li>
                    <li><a href="agregaingreso.jsp">Registro Ingresos</a></li>
                </ul>
            </div>
        </nav>
        
        <div class="jumbotron">
		<center>
                    <h1>Software</h1>
		</center>
            <br>
			<div class="container">
				<p>
                                El presente software está desarrollado con el fin de 
                                aguilizar los registros en la PYME con nombre de <strong>"Campo 93"</strong>, fue
                                desarrollado para la materia <strong>"Taller de Productividad Basada en Herramientas
                                Tecnologicas"</strong> por el alumno <strong>Roberto Ayala Molina</strong> estudiante de 
                                <strong>Ing. en Computación Administrativa</strong> con matricula <strong>02720612</strong> 
                                de la <strong>Universidad Tec Milenio</strong>. 
				</p>
			</div>
	</div>
        
        <div class="container">   
            <center>
            <h2>REGISTROS</h2>    
                <a class="btn btn-default btn-lg" href="Consulta" role="button">Personal</a>&emsp;
                <a class="btn btn-default btn-lg" href="ConsultaJugador" role="button">Judadores</a>&emsp;
                <a class="btn btn-default btn-lg" href="ConsultaIngreso" role="button">Ingresos</a>
            </center>
            <br>
            <hr>
        </div>
        
    </body>
</html>
