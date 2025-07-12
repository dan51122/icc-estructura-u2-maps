import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Daniel Uyaguari"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();

        
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContollerHash = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContollerTree = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(4,"Pedro","DEV");
        Empleado emp2 = new Empleado(2,"Pedro","DEV");
        Empleado emp3 = new Empleado(5,"Juan","DEV");
        Empleado emp4 = new Empleado(3,"Maria","DEV");
        Empleado emp5 = new Empleado(1,"Juan","DEV");

        empleadoContollerHash.agregarEmpleado(emp1);
        empleadoContollerHash.agregarEmpleado(emp2);
        empleadoContollerHash.agregarEmpleado(emp3);
        empleadoContollerHash.agregarEmpleado(emp4);
        empleadoContollerHash.agregarEmpleado(emp5);
        empleadoContollerTree.agregarEmpleado(emp1);
        empleadoContollerTree.agregarEmpleado(emp2);
        empleadoContollerTree.agregarEmpleado(emp3);
        empleadoContollerTree.agregarEmpleado(emp4);
        empleadoContollerTree.agregarEmpleado(emp5);

        empleadoContollerHash.list();
        empleadoContollerTree.list();

        runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        System.out.println("");
        mapa.runTreeMapObj();

    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        System.out.println("\n--- Ejercicios ---");
        Ejercicios ej = new Ejercicios();

        System.out.println("Ejercicio 1: Anagramas");
        System.out.println("listen & silent son anagramas? " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("hello & bello son anagramas? " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("triangle & integral son anagramas? " + Ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\nEjercicio 2: Sumatoria de dos");
        System.out.println("[ 9, 2, 3, 6 ] objetivo 5");
        int[] resultado = ej.sumatoriaDeDos(new int[] { 9, 2, 3, 6 }, 5);
        if (resultado != null) {
            System.out.println("Índices: [" + resultado[0] + "," + resultado[1] + "]");
        } else {
            System.out.println("No se encontró solución.");
        }

        System.out.println("[ 9, 2, 3, 6 ] objetivo 10");
        resultado = ej.sumatoriaDeDos(new int[] { 9, 2, 3, 6 }, 10);
        if (resultado != null) {
            System.out.println("Índices: [" + resultado[0] + "," + resultado[1] + "]");
        } else {
            System.out.println(resultado);
        }

        System.out.println("\nEjercicio 3: Contar caracteres");
        System.out.println("palabra: hola");
        ej.contarCaracteres("hola");

        System.out.println("\nEjercicio 4: Son anagramas");
        System.out.println("roma & amor son anagramas? " + ej.sonAnagramas("roma", "amor"));
    }   
}
