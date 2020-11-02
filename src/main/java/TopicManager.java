import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TopicManager {

    private TopicRepository topicRepository;

    public void addTopic(Topic topic) {
        topicRepository.insert(topic);
    }

    public void addMessageIntoTopic(Topic topic,Message message) {
        topicRepository.findById(topic.getName());
        topic.setMessages(Collections.singletonList(message));
    }

    public void addMultipleMessagesIntoTopic(Topic topic, List<Message> messages) {
        topicRepository.findById(topic.getName());
        topic.setMessages(messages);
    }

}
