package com.figueroadaniel.tasktracker

data class Tarea(
    val id: Int,
    var titulo: String,
    var descripcion: String,
    var estado: EstadoTarea,
    val fechaCreacion: String,
    var prioridad: Prioridad,
    var categoria: Categoria
) {

    // Clase Interna
    inner class Historial(private val cambios: MutableList<String> = mutableListOf()) {
        fun agregarCambio(mensaje: String) {
            cambios.add(mensaje)
        }

        fun mostrarHistorial() {
            println("Historial de cambios para la tarea $id:")
            cambios.forEach { println(" - $it") }
        }
    }

    val historial = Historial()

    fun cambiarEstado(nuevoEstado: EstadoTarea) {
        historial.agregarCambio("Estado cambiado de ${estado.descripcion} a ${nuevoEstado.descripcion}")
        estado = nuevoEstado
    }

    fun imprimirInfo() {
        println(
            """
            ID: $id
            Título: $titulo
            Descripción: $descripcion
            Estado: ${estado.descripcion}
            Fecha de creación: $fechaCreacion
            Prioridad: ${prioridad.descripcion}
            Categoría: ${categoria.nombre}
            ----------------------------------------------------
            """.trimIndent()
        )
    }

    companion object {
        private var contadorId = 0

        fun generarId(): Int {
            contadorId++
            return contadorId
        }
    }
}
