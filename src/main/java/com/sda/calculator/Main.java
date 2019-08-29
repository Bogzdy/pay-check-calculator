package com.sda.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static ArrayList<Entity> entities = new ArrayList<Entity>();

    public static void main(String[] args) {
        ArrayList<Entity> e = createList();
        sortListByOccupation(e);
        System.out.println(totalAmountPerCity(e, "Cluj"));

    }

    public static ArrayList<Entity> createList() {
        Entity mihai = new Student("Cluj", 3000);
        Entity criti = new Student("Oradea", 3500);

        Entity popescu = new Professor("Cluj", 5000);
        Entity marinescu = new Professor("Arad", 6000);

        entities.add(mihai);
        entities.add(criti);
        entities.add(popescu);
        entities.add(marinescu);
        return entities;
    }

    public static void sortListByOccupation(List<Entity> list) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Professor> professors = new ArrayList<>();

        for (Entity entity : list) {
            if (entity instanceof Student) {
                students.add((Student) entity);
            } else if (entity instanceof Professor) {
                professors.add((Professor) entity);
            }
        }
        Collections.sort(students, new ReceivedAmountComparator());
        Collections.sort(professors, new ReceivedAmountComparator());
        list.clear();
        list.addAll(professors);
        list.addAll(students);
    }

    public static double totalAmountPerCity(ArrayList<Entity> list, String city){
        double total = 0;
        for (Entity entity: list){
            if (entity.getCity().equals(city)){
                total += entity.amountReceived();
            }
        }
        return total;
    }


}
