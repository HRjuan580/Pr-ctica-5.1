class Curso(val nombre: String, val codigo: String) {
    val estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes() {
        estudiantes.forEach { println(it.nombre) }
    }
}

class Estudiante(val nombre: String, val dni: String) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }
}