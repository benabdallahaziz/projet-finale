package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;

public class MonController {

    @FXML
    private AnchorPane chatbotContainer;

    @FXML
    public void initialize() {
        WebView chatbot = ChatBotComponent.getChatBotWebView();
        AnchorPane.setTopAnchor(chatbot, 0.0);
        AnchorPane.setBottomAnchor(chatbot, 0.0);
        AnchorPane.setLeftAnchor(chatbot, 0.0);
        AnchorPane.setRightAnchor(chatbot, 0.0);
        chatbotContainer.getChildren().add(chatbot);
    }
}
