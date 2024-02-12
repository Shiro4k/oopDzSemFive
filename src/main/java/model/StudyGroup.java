package model;

import java.util.List;
import java.util.stream.Collectors;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;


    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "------GroupCreated------\n" +
                teacher + "\n" +
                students.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }
}
