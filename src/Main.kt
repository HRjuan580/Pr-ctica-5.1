fun main() {
    val curso1 = Curso("Matemáticas", "MAT101")
    val estudiante1 = Estudiante("Juan Pérez", "12345678")
    val estudiante2 = Estudiante("Ana Gómez", "87654321")

    estudiante1.inscribirse(curso1)
    estudiante2.inscribirse(curso1)

    curso1.mostrarEstudiantes()
}