package applicationno2;

import java.util.ArrayList;

public class BLclass {
    private static ArrayList<Student> data=new ArrayList<>();
    Student s=new Student();
    public  void adddata(Student s){
        data.add(s);

    }
    public  void displayData(){

        for(Student s: data) {
            System.out.println(s.getRollno());
            System.out.println(s.getName());
            System.out.println(s.getMarks());
            System.out.println(s.getSubject().getSid());
            System.out.println(s.getSubject().getSname());
            System.out.println(s.getSubject().getStudentfees());
        }

    }
    public Subject addsubject(int sid, String sname, double studentfees){
        Subject sub=new Subject(sid,sname,studentfees);
        sub.setSid(sid);
        sub.setSname(sname);
        sub.setStudentfees(studentfees);
        return sub;
    }

    public void searchBySubject(String name) {
        for(Student s:data){
            if(s.getSubject().getSname().equals(name)){
                System.out.println(s.getName());
                System.out.println(s.getMarks());
            }
        }
    }

    public void removeStudentsbyId(int id) {
        int count=0;
        for(int i=0;i<data.size();i++){
            if(data.get(i).getRollno()==id){
                data.remove(i);
                count++;
                System.out.println(count+":Data removed");
            }
        }
        if(count==0){
            System.out.println("Invalid match");
        }
    }

    public void updatedbysubwithnewupdate(String subname, String stuname, int updatedmarks) {
        int count=0;
        Student s=new Student();
        for(int i=0;i<data.size();i++){
            if(data.get(i).getSubject().getSname().equals(subname)){
                s.setName(stuname);
                s.setMarks(updatedmarks);
                count++;
                System.out.println(count+":Updated successefuly");
            }
        }
        if(count==0){
            System.out.println("not match");
        }
    }

    public void searchbyidonly(int id) {
        int count=0;
        for(int i=0;i<data.size();i++){
            if(data.get(i).getSubject().getSid()==id){
                System.out.println(data.get(i).getName());
                System.out.println(data.get(i).getMarks());
                System.out.println(data.get(i).getRollno());
                System.out.println(data.get(i).getSubject().getSname());
                System.out.println(data.get(i).getSubject().getStudentfees());

            }

        }
    }
}
