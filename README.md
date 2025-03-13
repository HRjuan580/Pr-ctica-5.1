# Practica-5.1

Preguntas:

a) Relación entre las clases. Significado, tipo, multiplicidad. 

b) Elementos de las clases. Tipos y propósito. 
Curso: almacena nombre, codigo y listas de estudiante
Estudiante: Almacena nombre y dni del alumno

c)Significado del método agregarAlumno(). Funcionamiento. 
Es un metodo que añade un estudiante a la lista de estudiantes del curso
Funcionamiento: Rebibe un objeto Estudiante como parametro y lo agrega a la coleccion interna

d) Significado del método inscribirse()
Permite a un estudiante inscribirse en un curso específico. Recibe un objeto Curso como parámetro y establece la relación entre ambos

2. Generación de código a partir del diagrama. 

a) Crear clases
Implementar la clase Curso con sus atributos (nombre, código, lista de estudiantes) y métodos (agregarAlumno, mostrarEstudiantes). Implementar la clase Estudiante con sus atributos (nombre, dni) y método (inscribirse).

b) Crear relaciones
La relación se implementa mediante la lista de estudiantes en Curso y los métodos agregarAlumno() e inscribirse() que conectan ambas clases.

c) Crear main (para probar el sistema)
