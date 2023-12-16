<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hitung Luas</title>
</head>
<body>
    <h2>Hitung Luas Persegi Panjang</h2>
    <form method="post" action="index.jsp">
        Masukkan Lebar: <input type="number" name="lebar"><br>
        Masukkan Tinggi: <input type="number" name="tinggi"><br>
        <input type="submit" value="Hitung">
    </form>

    <%-- Mengambil data dari form --%>
    <% 
        if (request.getMethod().equals("POST")) {
            double lebar = Double.parseDouble(request.getParameter("lebar"));
            double tinggi = Double.parseDouble(request.getParameter("tinggi"));
            double luas = lebar * tinggi;
    %>

    <hr>
    <h3>Hasil Perhitungan</h3>
    <p>Lebar: <%= lebar %></p>
    <p>Tinggi: <%= tinggi %></p>
    <p>Luas: <%= luas %></p>

    <% } %>
</body>
</html>
