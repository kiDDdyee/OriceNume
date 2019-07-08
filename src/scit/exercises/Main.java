package scit.exercises;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        arrayExample();
        arrayListExample();
        linkedListExample();
        setExample();
        mapExample();
        treeSetExample();
    }

    private static void arrayExample() {
        Persoane[] persoana = new Persoane[3];
        persoana[0] = new Somer("Tudor", 45, "1832458124637");
        persoana[1] = new Angajat("Vasile", 36, "1865789362516");
        persoana[2] = new Student("Bianca", 21, "1967327583942");

        System.out.println("-------Lista-------");
        for(int i=0; i<persoana.length; i++) {
            System.out.println(persoana[i].getName());
        }

    }

    private static void arrayListExample() {
        Persoane ppersoana0 = new Somer("Tudor", 45, "3");
        Persoane ppersoana1 = new Angajat("Vasile", 36, "7");
        Persoane ppersoana2 = new Student("Bianca", 21, "2");

        List<Persoane> ppersoane = new ArrayList();
        ppersoane.add(ppersoana0);
        ppersoane.add(ppersoana1);
        ppersoane.add(ppersoana2);

        System.out.println("-------ArrayList-------");
        for ( int i=0; i<ppersoane.size(); i++){
            System.out.println(ppersoane.get(i).getName());
        }


        //ORDONARE IN LISTA PRIN COLLECTIONS

        Collections.sort(ppersoane, new Comparator<Persoane>() {
            @Override
            public int compare(Persoane p1, Persoane p2) {
                return p1.getCnp().compareTo(p2.getCnp());
            }
        });

        System.out.println("-------After sort-------");
        System.out.println(ppersoane);



    }

    private static void linkedListExample() {

        Persoane ppersoana0 = new Somer("Tudor", 45, "1832458124637");
        Persoane ppersoana1 = new Angajat("Vasile", 36, "1865789362516");
        Persoane ppersoana2 = new Student("Bianca", 21, "1967327583942");

        LinkedList<Persoane> persoana = new LinkedList<>();
        persoana.add(ppersoana0);
        persoana.add(ppersoana1);
        persoana.add(ppersoana2);

        System.out.println("-------LinkedList-------");
        for(int i=0; i<persoana.size(); i++){
            System.out.println(persoana.get(i).getName());
        }
    }


    private static void setExample() {

        Persoane persoana0 = new Somer("Tudor", 45, "1832458124637");
        Persoane persoana1 = new Angajat("Vasile", 36, "1865789362516");
        Persoane persoana2 = new Student("Bianca", 21, "1967327583942");
        Persoane persoana3 = new Student("Larisa", 25, "1967327583942");

        Set<Persoane> setlist = new HashSet<>();
        setlist.add(persoana0);
        setlist.add(persoana1);
        setlist.add(persoana2);
        setlist.add(persoana3);

        System.out.println("-------SET-------");
        for(Persoane persoane: setlist){
            System.out.println(persoane.getName());
        }

        System.out.println("-------2 cnp uri egale-------");
        for(Persoane persoane: setlist){
            if(persoane.equals(persoana3)) {
                System.out.println(persoane.getName());
            }
        }
    }

    public static void mapExample() {

        Persoane persoana0 = new Somer("Tudor", 45, "1832458124637");
        Persoane persoana1 = new Angajat("Vasile", 36, "1865789362516");
        Persoane persoana2 = new Student("Bianca", 21, "1967327583942");
        Persoane persoana3 = new Student("Larisa", 25, "1967327583942");

        Map<String, Persoane> myPeople = new HashMap<>();
        myPeople.put("Tudorel", persoana0);
        myPeople.put("Bia", persoana2);
        myPeople.put("Lara", persoana3);
        myPeople.put("Vasilica", persoana1);


    //    System.out.println(myPeople.get("Bia"));

        System.out.println("-------Map-------");
        for(String key : myPeople.keySet()){
            System.out.println(myPeople.get(key));
        }



    }

    public static void treeSetExample() {
        Persoane persoana0 = new Somer("Tudor", 45, "1832458124637");
        Persoane persoana1 = new Angajat("Vasile", 36, "1865789362516");
        Persoane persoana2 = new Student("Bianca", 21, "1967327583942");
        Persoane persoana3 = new Student("Larisa", 25, "1967327583942");

        TreeSet<Persoane> treeperson = new TreeSet<Persoane>();
        treeperson.add(persoana1);
        treeperson.add(persoana2);
        treeperson.add(persoana0);
        treeperson.add(persoana3);

        System.out.println("-------TreeSet-------");
        System.out.println(treeperson);




    }

}
