package ua.net.itlabs.firstlesson.beans;

public class ResultMessage {

    public ResultMessage(String messageType, String messageText) {
        _messageType = messageType;
        _messageText = messageText;
    }

    private String _messageType;
    private String _messageText;

    public String getType() {
        return _messageType;
    }

    public String getText() {
        return _messageText;
    }
}
