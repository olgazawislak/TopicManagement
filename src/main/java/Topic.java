import java.util.List;
import lombok.Data;

@Data
public class Topic {
    private String name;
    private List<Message> messages;

    public Topic(String name) {
        this.name = name;
    }
}
