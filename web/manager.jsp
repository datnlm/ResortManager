<%-- 
    Document   : manager
    Created on : Nov 6, 2020, 4:01:50 PM
    Author     : macbook
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>Manager Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <c:if test="${sessionScope.USER.roleID != 'admin'}">
            <c:url var="lF" value="MainController">
                <c:param name="btnAction" value="LoginFirst"></c:param>
            </c:url>
            <c:redirect url="${lF}"></c:redirect>
        </c:if>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">Resort Dat</a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li><a><span class="glyphicon glyphicon-user"></span> ${sessionScope.USER.roleID}</a></li>
                                <c:url var="logout" value="MainController">
                                    <c:param name="btnAction" value="Logout"></c:param>
                                </c:url>
                    <li><a href="${logout}"><span class="fa fa-sign-out"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Resort Manager</h1>
            </div>
        </section>
        <c:set var="list" value="${requestScope.LIST}"></c:set>
        <c:if test="${list != null && not empty list}">
            <div class="container mb-4">
                <div class="row">
                    <div class="col-12">
                        <div class="table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col"> </th>
                                        <th scope="col">Product</th>
                                        <th scope="col">Available</th>
                                        <th scope="col" class="text-center">Description</th>
                                        <th scope="col" class="text-right">Price</th>
                                        <th> </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="dto" items="${list}">
                                    <form action="MainController" method="POST">
                                        <tr>
                                            <td><img src="http://villadelangelhotel.com/wp-content/uploads/2018/12/%c3%81rea-Desayuno-50x50.png" /> </td>
                                            <td>${dto.roomID}</td>
                                            <td>
                                                <input class="form-control" type="checkbox" name="chkStatus" ${dto.status == true ? "checked" : ""}>
                                            </td>
                                            <td>
                                                <input class="form-control" type="text" name="txtDescription" value="${dto.description}">
                                            </td>
                                            <td class="text-right">
                                                <input class="text-right" type="number" name="txtPrice" value="${dto.price}">
                                            </td>
                                            <td class="text-right">
                                                <button class="btn btn-sm btn-success" type="submit" name="btnAction" value="UpdateRoom">
                                                    <i class="fa fa-wrench" aria-hidden="true"></i> 
                                                </button>
                                                <input type="hidden" name="txtRoomID" value="${dto.roomID}">
                                            </td>
                                    </form>
                                    <td class="text-right">
                                        <c:url var="delete" value="MainController">
                                            <c:param name="btnAction" value="DeleteRoom"></c:param>
                                            <c:param name="txtRoomID" value="${dto.roomID}"></c:param>
                                        </c:url>
                                        <a href="${delete}">
                                            <button class="btn btn-sm btn-danger">
                                                <i class="fa fa-trash"></i> 
                                            </button>
                                        </a>
                                    </td>
                                    </tr>
                                </c:forEach>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <form action="MainController" method="POST">
                                    <tr>
                                        <td><img src="http://villadelangelhotel.com/wp-content/uploads/2018/12/%c3%81rea-Desayuno-50x50.png" /> </td>
                                        <td>
                                            <input class="form-control" type="text" name="txtRoomID" value="${param.txtRoomID}">
                                        </td>
                                        <td>
                                            <input class="form-control" type="checkbox" name="chkStatus" ${param.chkStatus == true ? "checked" : ""}>
                                        </td>
                                        <td>
                                            <input class="form-control" type="text" name="txtDescription" value="${param.txtDescription}">
                                        </td>
                                        <td class="text-right">
                                            <input class="text-right" type="number" name="txtPrice" value="${param.txtPrice}">
                                        </td>
                                        <td class="text-right">
                                            <button class="btn btn-sm btn-success" type="submit" name="btnAction" value="AddRoom">
                                                <i class="fa fa-plus" aria-hidden="true"></i> 
                                            </button>
                                        </td>
                                </form>
                                </tbody>
                            </table>
                            <h1 class="text-center">   
                                <font color="green">${requestScope.MESSAGE}</font>
                                <font color="red">${requestScope.ERROR}</font>
                            </h1>
                        </div>
                    </div>
                </div>
            </div>
        </c:if>    
    </body>
</html>
