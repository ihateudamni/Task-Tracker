# Task-Tracker

## Explicación de Archivos

### 1. `EstadoTarea.kt`
Enum que define los estados de una tarea:  
- `PENDIENTE (⏳ Por hacer)`  
- `EN_PROGRESO (🔨 En progreso)`  
- `COMPLETADA (✅ Completada)`  

### 2. `Prioridad.kt`
Enum que define la prioridad de las tareas:  
- `BAJA`  
- `MEDIA`  
- `ALTA`  

### 3. `Categoria.kt`
Clase simple que contiene una categoría 

### 4. `FechaHelper.kt`
Objeto **singleton** que centraliza la generación de fechas actuales con formato `dd/MM/yyyy`.

### 5. `Tarea.kt`
Data class que representa una tarea. Contiene:  
- Propiedades: `id`, `titulo`, `descripcion`, `estado`, `fechaCreacion`, `prioridad`, `categoria`.  
- Método `cambiarEstado`.  
- **Clase interna (`inner class Historial`)** Guarda la fecha y descripción de los cambio.  
- Método `mostrarInfo`Imprime los detalles.
  
### 6. `Main.kt`
Archivo principal que ejecuta los **casos de prueba**:  
1. Crear 4 tareas.  
3. Mostrar toda la información en consola.  
