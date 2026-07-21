<?php
$conn = new mysqli("localhost", "root", "", "safariedu");

$nombre = $_POST['nombre'];
$edad = $_POST['edad'];
$animal = $_POST['animal'];

$sql = "INSERT INTO usuarios (nombre, edad, animal_favorito) VALUES ('$nombre', $edad, '$animal')";

if ($conn->query($sql) === TRUE) {
  echo "<h2>✅ Guardado correctamente!</h2><a href='index.html'>Volver</a>";
} else {
  echo "Error: " . $conn->error;
}
$conn->close();
?>