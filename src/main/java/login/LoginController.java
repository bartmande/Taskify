package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.SessionFactory;
import model.User;
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
            User user = new User();
            user.setUsername("aaa");
            session.save(user);
            tx.commit();

        } finally {
            session.close();
        }
    }
}
