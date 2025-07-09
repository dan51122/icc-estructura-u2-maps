package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;


public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        Map<String, String> mapa = new HashMap();

        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for(String codigo: mapa.keySet()){
            System.out.println(mapa.get(codigo));
        }
    }

    public void runLinkedHashMap(){
        LinkedHashMap<Integer, String> personas = new LinkedHashMap<>();

        personas.put(1, "Juan");
        personas.put(2, "Ana");
        personas.put(3, "Luis");
        personas.put(4, "María");
        personas.put(5, "Daniel");

        for (String nombre : personas.values()) {
            System.out.println(nombre);
        }
    }

    public void runTreeMap(){
        Map<Integer, String> items = new TreeMap<>();

        items.put(3, "carro");
        items.put(3, "bicicleta");
        items.put(3, "moto");

        for (String nombre : items.values()) {
            System.out.println(nombre);
        }
    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Juan", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);  
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
        System.out.println(entry.getKey() + ", Salario: " + entry.getValue());
    } 
    }

    public void runTreeMapObj(){
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1500);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
        System.out.println(entry.getKey() + ", Salario: " + entry.getValue());
    }  
    }
}
