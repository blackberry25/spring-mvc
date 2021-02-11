<%@page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Hello World in help page!</h2>
${name}
${friends}

<c:forEach var="item" item="${friends}">
    <h1> ${item} </h1>
</c:forEach>




</body>
</html>
