<%-- 
    Document   : index
    Created on : Dec 11, 2023, 10:06:34 PM
    Author     : MrToms
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="login" action="sales.jsp" method="post">
            <table width="200" border="1">
                <tr>
                    <td width="56">Nama</td>
                    <td width="128">
                        <input type="text" name="namaUser">
                    </td>
                </tr>
                <tr>
                    <td>ID</td>
                    <td>
                        <input type="text" name="idUser">
                    </td>
                </tr>
                <tr>
                    <td>Umur</td>
                    <td>
                        <input type="text" name="umur">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="Submit" value="Submit">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
