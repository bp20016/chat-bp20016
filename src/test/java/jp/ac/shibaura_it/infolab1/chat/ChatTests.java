package jp.ac.shibaura_it.infolab1.chat;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class ChatTests {
    @Test
    public void addText() {
        Chat chat = new Chat("general");
        assertThat(chat.text).isEqualTo("general");
        System.out.println(chat.text);
    }
}
