package entity;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }
    private String passwd;
    public void setPassword(String password) {
        this.passwd = password;
    }
    @Basic
    @Column(name = "passwd")
    public String getPassword() {
        return passwd;
    }
}
