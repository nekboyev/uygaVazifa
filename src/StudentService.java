import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentService {
    private List<student> students=new ArrayList<>();
    public void add(student student){
        students.add(student);
    }
    public void changeDetailsOfStudent(StudentDto dto){
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getName(),dto.name())&&
            Objects.equals(students.get(i).getLastName(),dto.lastName())){
                students.get(i).setBirthday(dto.birthday());
                students.get(i).setHobbies(dto.hobbies());
              //  return true;
            }
        }
       // return false;
    }
    public boolean deleteStudent(StudentDto dto){
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getName(),dto.name())&&
                    Objects.equals(students.get(i).getLastName(),dto.lastName())){
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    public student findByName(String name){
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getName(),name)){
               return students.get(i);

            }
        }
        return null;
    }
    public student findByLastName(String lastName){
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getName(),lastName)){
                return students.get(i);

            }
        }
        return null;
    } public student findByName(List<String> hobbies){
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getHobbies(),hobbies)){
                return students.get(i);

            }
        }
        return null;
    }

}
