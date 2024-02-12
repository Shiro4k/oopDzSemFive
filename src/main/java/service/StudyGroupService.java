package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    List<Student> studentList1 = new ArrayList<>();

    public StudyGroup craeteStudyGroup(Integer groupId,Teacher teacher, List<Student> studentList) {
        Integer studetGroupId = groupId;
        for (Student student : studentList) {
            if (student.getStudentGroupId().equals(studetGroupId)) {
                studentList1.add(student);
            }
        }
        return new StudyGroup(teacher, studentList1);
    }



}
