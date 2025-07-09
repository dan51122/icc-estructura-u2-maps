package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Empleado other = (Empleado) obj;
        return id == other.id &&
               Objects.equals(name, other.name) &&
               Objects.equals(position, other.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position);
    }

    @Override
    public int compareTo(Empleado o) {
        // Por ejemplo, ordena por id ascendente
        return Integer.compare(this.id, o.id);
    }
}
