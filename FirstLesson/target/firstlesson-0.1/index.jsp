<%--
  User: Dmitry Antonenko
  Date: 7/23/14
  Time: 8:22 PM

  Description:
    1. Send from HTML-page POST-request with username and password to Servlet.
    2. Servlet should return greetings with username.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Send request example</title>
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <div class="container">

        <form role="form" action="auth" method="post">

            <div id="login-box" class="modal show">
                <div class="modal-dialog">
                    <div class="modal-content">

                        <div class="modal-header">
                            <h4 class="modal-title">Submit data to servlet</h4>
                        </div>
                        <div class="modal-body">

                            <c:if test="${message != null}">
                                <div class="alert alert-${message.getType()}" role="alert">${message.getText()}</div>
                            </c:if>

                            <div class="form-horizontal">
                                <div class="form-group">
                                    <label for="username" class="col-sm-2 control-label">Username:</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="username" name="username" placeholder="Username">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">Password:</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>

    </div>
</body>

</html>
