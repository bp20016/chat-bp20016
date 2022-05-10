package jp.ac.shibaura_it.infolab1.chat;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class UserTests {
    @Test
    void instance(){
        var user1 = new User("Hiroki", "0224");
        assertThat(user1.getName()).isEqualTo("Hiroki");
        assertThat(user1.getPass()).isEqualTo("0224");
    }
    @Test
    void delUser(){
        System.out.println("deleted");
    }
}
