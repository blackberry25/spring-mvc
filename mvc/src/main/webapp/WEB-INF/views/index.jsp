

<html>
<body>
<h2>Hello World!</h2>
<% String s=(String)request.getAttribute("name");
    Integer id=(Integer) request.getAttribute("flist");

 %>

 <h1> my name is <%=s%>
        id is <%=id%>


 </h1>





</body>
</html>
