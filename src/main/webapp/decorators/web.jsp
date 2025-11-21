<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %> 
<%@ taglib prefix="sitemesh" uri="/WEB-INF/sitemesh.tld" %><!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><sitemesh:write property="title"/></title> <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <sitemesh:write property="head"/> </head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-4">
      <div class="container">
        <a class="navbar-brand" href="#">LTWEB BT04</a>
        <div class="collapse navbar-collapse">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link active" href="#">Trang chủ</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Danh mục</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Video</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container">
        <sitemesh:write property="body"/>
    </div>

    <footer class="bg-light text-center text-lg-start mt-4">
      <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2025 Copyright: Nguyen Van A - MSSV
      </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>