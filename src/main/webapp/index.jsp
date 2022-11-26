<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/product" method="post">
    <label>Product description</label>
    <input type="text" name="description" placeholder="Product" />
    <label>List price</label>
    <input type="number" name="price" placeholder="Price"/>
    <label>Discount percent</label>
    <input type="number" name="percent" placeholder="%"/>
    <input type="submit" name="submit" value="Discount">
</form>

</body>
</html>