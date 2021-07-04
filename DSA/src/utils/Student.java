package utils;
public class Student implements Comparable<Student>{
    String name;
    Integer marks;
    Integer roll;
    Boolean isPass;

    public Student(String name, Integer marks, Integer roll) {
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }
    public static Student getRandomStudent(){
        return new Student(Random.getStringValue(),Random.getIntValue(),Random.getIntValue(1000)+1000);
    }
    public Boolean isPass(){
        isPass = marks>33;
        return isPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", roll=" + roll +
                ", isPass=" + isPass +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return this.marks.compareTo(that.marks);
    }
}