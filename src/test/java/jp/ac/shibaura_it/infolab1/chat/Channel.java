package jp.ac.shibaura_it.infolab1.chat;

public class Channel {
    String message;

    public Channel(String general) {

    }

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
