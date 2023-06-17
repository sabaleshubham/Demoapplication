package applicationno2;

import java.util.Scanner;

public class mainapp2 {
    static  BLclass bl=new BLclass();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean status=true;

        while(status){
            System.out.println("Add your choice");
            System.out.println("1.Add student");
            System.out.println("2.Display student");
            System.out.println("3.Remove students");
            System.out.println("4.Update student subject");
            System.out.println("5.search student by id");
            System.out.println("6.Diplay student by subject");
            System.out.println("7.Exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:addstudents();
                    break;
                case 2:displayStudents();
                    break;
                case 3:removeStudents();
                    break;
                case 4:updateStudentsBySubject();
                break;
                case 5:
                    searchStudentById();
                    break;
                case 6:
                    displayStudentsbySubject();
                case 7:
                default:
                    System.out.println("Invalid output");
            }

        }

    }
    private static void addstudents() {
        System.out.println("Enter your rollno");
        int rollno=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        Subject s=addsubjects();
        Student s1=new Student(rollno,name,marks,s);
        bl.adddata(s1);


    }
    public static Subject addsubjects(){
        System.out.println("Enter your subject id");
        int id= sc.nextInt();
        System.out.println("Enter your subject name");
        String name=sc.next();
        System.out.println("Enter your subject fees");
        double fees=sc.nextDouble();

        Subject sub=new Subject(id,name,fees);
        return sub;
    }
    private static void displayStudents() {
        bl.displayData();

    }
    private static void removeStudents() {
        System.out.println("Enter the student id");
        int id= sc.nextInt();
        bl.removeStudentsbyId(id);
    }
    private static void updateStudentsBySubject() {
        //remaining
        System.out.println("Enter your subject name");
        String subname=sc.next();
        System.out.println("Enter your name");
        String stuname=sc.next();
        System.out.println("Enter your marks");
        int updatedmarks=sc.nextInt();
        bl.updatedbysubwithnewupdate(subname,stuname,updatedmarks);

    }
    private static void searchStudentById() {
        System.out.println("Enter your id");
        int id= sc.nextInt();
        bl.searchbyidonly(id);
    }
    private static void displayStudentsbySubject() {
        System.out.println("Enter your subject");
        String name=sc.next();
        bl.searchBySubject(name);
    }
}
