package com.gonza.chatbot.service;


import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderManagementAIAssistant {

    private ChatModel chatClient;

    public OrderManagementAIAssistant(ChatModel chatClient) {
        this.chatClient = chatClient;
    }

    public ChatResponse callChatClient(Set<String> functionNames, String promptString) {
        Prompt prompt  = new Prompt(promptString, OpenAiChatOptions
                .builder()
                .withFunctions(functionNames)
                .build()
        );
        return chatClient.call(prompt);
    }
}
