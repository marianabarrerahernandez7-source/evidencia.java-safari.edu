<?php
$conn = new mysqli("localhost", "root", "", "safariedu");
$result = $conn->query("SELECT * FROM usuarios");
?>
<html><body style="text-align:center;">
<h1>📋 Registros de SafariEdu</h1>
<table border="1" align="center" cellpadding="10">
<tr><th>ID</th><th>Nombre</th><th>Edad</th><th>Animal</th></tr>
<?php while($row = $result->fetch_assoc()) { ?>
<tr>
  <td><?php echo $row['id']; ?></td>
  <td><?php echo $row['nombre']; ?></td>
  <td><?php echo $row['edad']; ?></td>
  <td><?php echo $row['animal_favorito']; ?></td>
</tr>
<?php } ?>
</table>
<br><a href='index.html'>Volver al inicio</a>
</body></html>