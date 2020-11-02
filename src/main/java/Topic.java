import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Topic {
    @Id
    private String name;
    private List<Message> messages;

    public Topic(String name) {
        this.name = name;
    }
}
