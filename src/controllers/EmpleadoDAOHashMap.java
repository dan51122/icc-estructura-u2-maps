package controllers;

import models.Empleado;
import java.util.HashMap;
import java.util.Map;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Integer, Empleado> empleados = new HashMap<>();

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
        System.out.println("Empleado añadido (HashMap): " + emp);
    }

    @Override
    public void list() {
        System.out.println("Lista de empleados (HashMap):");
        for (Empleado emp : empleados.values()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("Empleado eliminado (HashMap), ID: " + id);
        } else {
            System.out.println("Empleado no encontrado (HashMap), ID: " + id);
        }
    }
}
