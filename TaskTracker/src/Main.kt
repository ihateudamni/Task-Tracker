package com.figueroadaniel.tasktracker

fun main() {
    println("Lista de tareas:\n")

    // Categorías de ejemplo
    val catEstudio = Categoria(1, "Estudio")
    val catTrabajo = Categoria(2, "Trabajo")

    // Test 1: Crear tareas
    val tarea1 = Tarea(
        id = Tarea.generarId(),
        titulo = "Test",
        descripcion = "Descripción",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = FechaHelper.fechaActual(),
        prioridad = Prioridad.MEDIA,
        categoria = catEstudio
    )

    val tarea2 = Tarea(
        id = Tarea.generarId(),
        titulo = "Aprender Fundamentos en Kotlin",
        descripcion = "Descripción",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = FechaHelper.fechaActual(),
        prioridad = Prioridad.ALTA,
        categoria = catEstudio
    )

    val tarea3 = Tarea(
        id = Tarea.generarId(),
        titulo = "Proyecto Final",
        descripcion = "Descripción",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = FechaHelper.fechaActual(),
        prioridad = Prioridad.ALTA,
        categoria = catTrabajo
    )

    val tarea4 = Tarea(
        id = Tarea.generarId(),
        titulo = "Preparar Examen",
        descripcion = "Descripción",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = FechaHelper.fechaActual(),
        prioridad = Prioridad.BAJA,
        categoria = catEstudio
    )

    // Cambiar de tarea 2 a 4
    tarea2.cambiarEstado(EstadoTarea.COMPLETADA)
    tarea3.cambiarEstado(EstadoTarea.EN_PROGRESO)
    tarea4.cambiarEstado(EstadoTarea.COMPLETADA)

    // Imprimir
    val listaTareas = listOf(tarea1, tarea2, tarea3, tarea4)
    listaTareas.forEach { it.imprimirInfo() }

    // Muestra historial
    println("\n--- Historial de Tarea 2 ---")
    tarea2.historial.mostrarHistorial()
}
