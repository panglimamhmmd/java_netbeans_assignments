<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contoh Cookies dan Session</title>
</head>
<body>

<%
    String loginTime = ""; // Untuk menyimpan waktu login

    // Ambil nilai dari form jika dikirimkan
    String userID = request.getParameter("userID");
    String password = request.getParameter("password");

    // Cek apakah ada data yang dikirimkan dari form
    if(userID != null && password != null) {
        // Jika ada, atur session
        session.setAttribute("userID", userID);

        // Atur cookie
        Cookie userCookie = new Cookie("userID", userID);
        userCookie.setMaxAge(60 * 60 * 24); // Cookie akan berlaku selama 1 hari (dalam detik)
        response.addCookie(userCookie);

        // Ambil waktu login saat ini
        loginTime = new java.util.Date().toString();
%>
        <p>Anda sudah login dengan User ID: <%= userID %> dan Password: <%= password %></p>
        <p>Login pada waktu <%= loginTime %> Tanggal <%= new java.util.Date() %></p>
<%
    }
%>

<form method="post" action="">
    <label for="userID">uSERNAME: </label>
    <input type="text" id="userID" name="userID"><br><br>
    <label for="password">PASSWORD: </label>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="Submit">
</form>

<%
    // Tampilkan nilai dari session jika ada
    String sessionUserID = (String) session.getAttribute("userID");
    if(sessionUserID != null) {
%>
        <p>Nilai dari session (userID): <%= sessionUserID %></p>
<%
    }

    // Tampilkan nilai dari cookie jika ada
    Cookie[] cookies = request.getCookies();
    if(cookies != null) {
        for(Cookie cookie : cookies) {
            if(cookie.getName().equals("userID")) {
%>
                <p>Nilai dari cookie (userID): <%= cookie.getValue() %></p>
<%
                break;
            }
        }
    }
%>

</body>
</html>
