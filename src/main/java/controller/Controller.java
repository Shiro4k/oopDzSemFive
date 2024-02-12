package controller;

import model.Student;
import model.Teacher;
import service.StudyGroupService;
import service.UserService;
import view.StudentView;

public class Controller {
    public Controller() {
        service = new UserService();
        view = new StudentView();
        group = new StudyGroupService();
    }

    private UserService service;
    private StudentView view;
    private StudyGroupService group;



    public void run(){
        Student student1 = new Student("15.05.2000", "Ivanov Ivan Ivanovich", 1, 10);
        Student student2 = new Student("12.01.2003", "Vanov Van Vanovich", 2, 20);
        Student student3 = new Student("19.02.2005", "Abramov Abram Abramovich", 3, 10);
        Student student4 = new Student("25.03.2001", "Nikolaev Nikolae Nikolaevich", 4, 10);
        Student student5 = new Student("30.04.1999", "Masha Masha Mashovich", 5, 20);
        Student student6 = new Student("01.05.1998", "Dmitriyev Dmitriy Dmitriyevich", 6, 10);
        Teacher teacher1 = new Teacher("12.02.1985", "Samoilov Mihail Andreivich", 1);
        Teacher teacher2 = new Teacher("12.02.1990", "Krivov Ramzes Rasinovih", 2);
        service.userCreate(student1);
        service.userCreate(student2);
        service.userCreate(student3);
        service.userCreate(student4);
        service.userCreate(student5);
        service.userCreate(student6);
        service.userCreate(teacher1);
        service.userCreate(teacher2);
        Student Result = (Student) service.userRead(1);
        view.print(Result);
        System.out.println(group.craeteStudyGroup(10, teacher1, service.getStudentsList()));
    }
}
