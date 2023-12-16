<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="style.css" rel="stylesheet" type="text/css"/>
    <title>Menambah, Mengubah, dan Menghapus Data Mahasiswa</title>
</head>
<body>
<center>
    <table>
        <tr>
            <td colspan="4" align="center">
                <br>
                <h2 colspan="4" align="center">Menambah, Mengubah dan Menghapus Data Mahasiswa</h2>
                <h1 colspan="4" align="center">UNIVERSITAS PAMULANG</h1>
                <h4 colspan="4" align="center">Jl. Surya Kencana No. 1 Pamulang, Tangerang Selatan, Banten</h4>
                <nav>
                    <ul>
                        <li> 
                            <a href=index.jsp>Home</a>
                        </li>
                        <li>
                            <a href="tambah.jsp">Menambah Data Mahasiswa</a>
                        </li>
                        <li>
                            <a href="ubah.jsp">Mengubah Data Mahasiswa</a>
                        </li>
                        <li>
                            <a href="hapus.jsp">Menghapus Data Mahasiswa</a>
                        </li>
                    </ul>
                </nav>
                <br>
                <form colspan="4" align="center" action"" method="POST">
                    <label>NIM  :</label>
                    <input type="text" name="nim"/> <br/>
                    
                    <label>Nama Mahasiswa   :</label>
                    <input type="text" name="nama"/> <br/>
                    
                    <label>Alamat   :</label>
                    <input type="text" name="alamat"/> <br/>
                    
                    <label>Program Studi    :</label>
                    <select id="prodi" name="prodi">
                        <option value="Teknik Informatika">Teknik Informatika</option>
                        <option value="Sistem Informasi">Sistem Informasi</option>
                    </select> <br/> <br>
                    
                    <input type="submit" name="submit" value="Simpan"/>
                    <button href="index.jsp">Kembali</button> <br><br>
                </form>
            </td>
        </tr>
        
        <tr>
            <td colspan="2" align="center" bgcolor="#eeeeff">
                <small>
                    Copyright &copy; 2016 Universitas Pamulang<br>
                    Jl. Surya Kencana No. 1 Pamulang, Tangerang Selatan, Banten<br>
                </small>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
