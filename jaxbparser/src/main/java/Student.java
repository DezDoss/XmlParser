import javax.xml.bind.annotation.*;
import java.time.LocalDate;


@XmlRootElement(name = "Student")
@XmlType(propOrder = { "firstName",  "lastName", "dob", "section"})
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String section;

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLasName(String lasName) {
        this.lastName = lasName;
    }



    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @XmlElement(name = "birthDate")
//    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", dob=" + dob + ", section=" + section + "]";
    }
}
