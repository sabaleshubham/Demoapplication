package applicationno2;

public class Student {

    private int rollno;
    private String name;
    private int marks;
    private Subject subject;
    public  Student(){

    }

    public Student(int rollno, String name, int marks, Subject subject) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", subject=" + subject +
                '}';
    }
}
