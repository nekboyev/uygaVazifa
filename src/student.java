import java.util.List;

public class student {
    private  String name;
    private  String lastName;
    private  String birthday;
    private List<String> hobbies;

    public student(String name, String lastName, String birthday, List<String> hobbies) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
