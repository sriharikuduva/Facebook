public class Message {
    private Integer messageId;
    private Member[] sentTo;
    private String messageBody;
    private byte[] media;

    public Integer getMessageId() {
        return messageId;
    }
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Member[] getSentTo() {
        return sentTo;
    }
    public void setSentTo(Member[] sentTo) {
        this.sentTo = sentTo;
    }

    public String getMessageBody() {
        return messageBody;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public byte[] getMedia() {
        return media;
    }
    public void setMedia(byte[] media) {
        this.media = media;
    }
}