package controllers;

import models.Empleado;
import java.util.Map;
import java.util.TreeMap;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    

    public EmpleadoDAOTreeMap() {
        this.empleados  = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
        System.out.println("Empleado añadido (TreeMap): " + emp);
    }

    @Override
    public void list() {
        System.out.println("Lista de empleados ordenados por ID (TreeMap):");
        for (Empleado emp : empleados.values()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        Empleado temporal = new Empleado(id);
        empleados.remove(temporal);
    }
}
