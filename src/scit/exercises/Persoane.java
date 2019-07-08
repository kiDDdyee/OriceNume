package scit.exercises;

import java.util.Objects;

public class Persoane implements Comparable<Persoane>{
    private String name;
    private int age;
    private String cnp;

    public Persoane(String name, int age, String cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoane persoane = (Persoane) o;
        return cnp.equals(persoane.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cnp='" + cnp + '\'' +
                '}';
    }


    @Override
    public int compareTo(Persoane o) {
        return name.compareTo(o.getName());
    }
}
