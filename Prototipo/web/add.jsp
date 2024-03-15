<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Libro</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h1 class="text-center">Agregar Libro</h1>
        <form action="Controlador">
            <div class="mb-3">
                <label for="Titulo" class="form-label">Título:</label>
                <input type="text" class="form-control" id="Titulo" name="Titulo" required>
            </div>
            <div class="mb-3">
                <label for="Autor" class="form-label">Autor:</label>
                <input type="text" class="form-control" id="Autor" name="Autor" required>
            </div>
            <div class="mb-3">
                <label for="Año" class="form-label">Año:</label>
                <input type="text" class="form-control" id="Año" name="Año" required>
            </div>
            <div class="mb-3">
                <label for="Genero" class="form-label">Género:</label>
                <input type="text" class="form-control" id="Genero" name="Genero" required>
            </div>
            <button type="submit" class="btn btn-success" name="accion" value="Agregar">Agregar Libro</button>
        </form>
    </div>
</body>
</html>
