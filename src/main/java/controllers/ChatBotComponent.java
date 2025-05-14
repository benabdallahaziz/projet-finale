package controllers;

import javafx.scene.web.WebView;

public class ChatBotComponent {

    public static WebView getChatBotWebView() {
        WebView webView = new WebView();

        String htmlContent = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <title>ChatBot</title>
            </head>
            <body>
                <h2>ChatBot Demo</h2>
                <p>Le chatbot devrait apparaître ici...</p>
                <script>
                  window.__ow = window.__ow || {};
                  window.__ow.organizationId = "da6de964-7398-425f-98c6-0dc4374e1bab";
                  window.__ow.template_id = "ef5f1e53-3b32-41cc-8bbb-9cb20ba48449";
                  window.__ow.integration_name = "manual_settings";
                  window.__ow.product_name = "chatbot";   
                  ;(function(n,t,c){function i(n){return e._h?e._h.apply(null,n):e._q.push(n)}var e={_q:[],_h:null,_v:"2.0",on:function(){i(["on",c.call(arguments)])},once:function(){i(["once",c.call(arguments)])},off:function(){i(["off",c.call(arguments)])},get:function(){if(!e._h)throw new Error("[OpenWidget] You can't use getters before load.");return i(["get",c.call(arguments)])},call:function(){i(["call",c.call(arguments)])},init:function(){var n=t.createElement("script");n.async=!0,n.type="text/javascript",n.src="https://cdn.openwidget.com/openwidget.js",t.head.appendChild(n)}};!n.__ow.asyncInit&&e.init(),n.OpenWidget=n.OpenWidget||e}(window,document,[].slice))
                </script>
            </body>
            </html>
            """;

        webView.getEngine().loadContent(htmlContent);
        return webView;
    }
}
