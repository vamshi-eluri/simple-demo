<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Breeds
</h1>
<%
List result= (List) request.getAttribute("breeds");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>