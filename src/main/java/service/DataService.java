package service;

import model.User;

public interface DataService {
    void userCreate(User user);
    User userRead(Integer studentId);

}
