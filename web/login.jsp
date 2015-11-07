<%-- 
    Document   : index
    Created on : Nov 6, 2015, 11:08:28 PM
    Author     : Jeyson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Analisis2</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div id="header">
            <div>
                <div class="logo">
                    <a href="index.jsp">TAAp</a>
                </div>
                <ul id="navigation">
                    <li >
                        <a href="index.jsp">Home</a>
                    </li>
                    <li class="active">
                        <a href="login.jsp">Login</a>
                    </li>
                </ul>
            </div>
        </div>
        <div id="adbox">
            <div class="clearfix">
                <img src="images/box.png" alt="Img" height="342" width="368">
                <div>
                    <h1>TAAP</h1>
                    <h2>Grupo2</h2>
                    <p>
                        Bienvenido al Sistema TAAp
                    </p>
                </div>
            </div>
        </div>
        <div id="contents">
            <div id="tagline" class="clearfix">
                <h1>Login</h1>
                <div>
                    <form action="Handler" method="post">
                        <p >User Name: &nbsp;<input name="usuario" type="text" size="19" /></p>
                        <p>Password: &nbsp;&nbsp;<input name="contrasenia" type="password" size="19" /></p>										
                        <input type ="hidden"  name="accion" value="ingreso">
                        <button type="submit" class="btn btn-primary btn-md">Login</button>
                        <p style="color:red">${mensaje}</p>
                    </form>

                </div>

            </div>
        </div>
        <div id="footer">
            <div class="clearfix">
                <div id="connect">
                    <a href="http://freewebsitetemplates.com/go/facebook/" target="_blank" class="facebook"></a><a href="http://freewebsitetemplates.com/go/googleplus/" target="_blank" class="googleplus"></a><a href="http://freewebsitetemplates.com/go/twitter/" target="_blank" class="twitter"></a><a href="http://www.freewebsitetemplates.com/misc/contact/" target="_blank" class="tumbler"></a>
                </div>
                <p>
                    Analisis 2 2015
                </p>
            </div>
        </div>
    </body>
</html>