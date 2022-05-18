package jp.ac.shibaura_it.infolab1.chat;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
public class Channel {
    String message;
    public void Message(String messages) {
        this.message = messages;
    }
    public String getMessage() {
        return this.message;
    }

    public void printMessage(){
        System.out.println("message:"+this.message);
    }
}
