package de.ricardo;

public record StudentRecord(String id, String firstName, String lastName, int age) {

    public void sayHello(){
        System.out.println("Hello, " + firstName + " " + lastName);
    }

    //Wither
    public StudentRecord withFirstName(String newName){
        return new StudentRecord(id, newName, lastName, age);
    }
}
