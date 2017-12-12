package tn.insat.fix.finance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String userName;
    private String password;
    private String email;
    private boolean intermidiaire;

    public User(String userName, String password,
                String email, boolean intermidiaire) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.intermidiaire = intermidiaire;
    }

    public User() {
    }

    public User(long id, String userName, String password, String email, boolean intermidiaire) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.intermidiaire = intermidiaire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIntermidiaire(boolean intermidiaire) {
        this.intermidiaire = intermidiaire;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isIntermidiaire() {
        return intermidiaire;
    }
}
