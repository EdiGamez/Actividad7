public class Alumno {
    private String nombre;
    private int[] calificaciones;

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return suma / calificaciones.length;
    }
    public char obtenerCalificacionFinal(double promedio) {
        char calificacion;
        if (promedio <= 50) {
            calificacion = 'F';
        } else if (promedio <= 60) {
            calificacion = 'E';
        } else if (promedio <= 70) {
            calificacion = 'D';
        } else if (promedio <= 80) {
            calificacion = 'C';
        } else if (promedio <= 90) {
            calificacion = 'B';
        } else {
            calificacion = 'A';
        }
        return calificacion;
    }

    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacion = obtenerCalificacionFinal(promedio);
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}



