package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.SessionFactory;
import model.TaskifyUser;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginController {
    @FXML
    public Button loginButton;

    @FXML
    protected void login(ActionEvent event) {
        final Session session = SessionFactory.getSession();
        try {
            Transaction tx;
            tx = session.beginTransaction();
            TaskifyUser taskifyUser = new TaskifyUser();
            taskifyUser.setUsername("aaa");
            session.save(taskifyUser);
            tx.commit();

        } finally {
            session.close();
        }
    }
}
