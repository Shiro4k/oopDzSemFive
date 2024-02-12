package service;

import model.Student;
import model.Teacher;
import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    List<User> userList = new ArrayList<>();
    List<Student> studentsList = new ArrayList<>();
    @Override
    public void userCreate(User user) {
        int countStudent = 0;
        int countTeacher = 0;
        for (User elem : userList) {
            if (elem instanceof Student){
                 countStudent++;
            }else {
                countTeacher++;
            }
        }
        if (user instanceof Student){
            studentsList.add((Student) user);
            ((Student) user).setStudentId(countStudent + 1);
        }
        if (user instanceof Teacher){
             ((Teacher) user).setTeacherId(countTeacher + 1);
        }
        userList.add(user);

    }
     public List<Student>  getStudentsList() {
         return studentsList;
     }
    @Override
    public User userRead(Integer studentId) {
        for (User user : userList) {
            if (user  instanceof Student && ((Student) user).getStudentId().equals(studentId)) {
                return  user;
            }
        }
        return null;
    }


}
