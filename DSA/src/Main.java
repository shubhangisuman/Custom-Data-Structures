import sort.Insertion;
import sort.Order;
import sort.Selection;
import utils.Student;

import java.util.Arrays;

public class Main {
    private static void testSelectionSort(){
        Selection<Student> selection = new Selection<Student>();
        Student[] students = new Student[10];
        for(int i=0;i<students.length;i++){
            students[i]=Student.getRandomStudent();
        }
//        System.out.println(Arrays.toString(students));
        selection.sort(students);
        selection.sort(students, Order.Descending);
//        System.out.println(Arrays.toString(students));
    }
    private static void testInsertionSort(){
        Insertion<Student> insertion = new Insertion<>();
        Student[] students = new Student[10];
        for(int i=0;i<students.length;i++){
            students[i]=Student.getRandomStudent();
        }
        System.out.println(Arrays.toString(students));
        insertion.sort(students);
//        insertion.sort(students,Order.Descending);
        System.out.println(Arrays.toString(students));
    }
    public static void main(String[] args) {
//        testSelectionSort();
        testInsertionSort();
    }
}