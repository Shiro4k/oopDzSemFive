package model;

public class Student extends User {
    private Integer studentId;
    private Integer studentGroupId;

    public Student(String birthday, String fullname, Integer studentId, Integer groupId) {
        super(birthday, fullname);
        this.studentId = studentId;
        this.studentGroupId = groupId;
    }


    public Integer getStudentGroupId() {
        return studentGroupId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentGroupId=" + studentGroupId +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

}
