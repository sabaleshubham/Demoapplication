package applicationno2;

public class Subject {
    private  int sid;
    private  String sname;
    private  double studentfees;
    public  Subject(){


    }

    public Subject(int sid, String sname, double studentfees) {
        this.sid = sid;
        this.sname = sname;
        this.studentfees = studentfees;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getStudentfees() {
        return studentfees;
    }

    public void setStudentfees(double studentfees) {
        this.studentfees = studentfees;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", studentfees=" + studentfees +
                '}';
    }
}

