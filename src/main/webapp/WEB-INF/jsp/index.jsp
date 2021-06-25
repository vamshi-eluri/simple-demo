<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pet Store</title>
</head>
<body>
<center>
    <h1>
        Select the type of Pet
    </h1>
    <form:form modelAttribute="pet" method="post" action="SelectPet">
        <br>
        <form:select path="type" size="1">
            <form:option value="Dog" label="Dog"/>
            <form:option value="Cat" label="Cat"/>
            <form:option value="Fish" label="Fish"/>

        </form:select>
        <br><br>
        <input type="submit" value="Add Registration">
    </form:form>
</center>


</body>
</html>