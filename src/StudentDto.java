import java.util.List;

public record StudentDto(String name,String lastName,String birthday, List<String> hobbies) {
}
