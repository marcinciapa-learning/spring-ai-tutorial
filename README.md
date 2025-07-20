Codebase for [YouTube course]() for Spring Boot AI

# Running instructions

Run SpringAiTutorial class, providing an environment variable OPENAI_AI_KEY

# What I learned

- Using Chat via Spring AI requires injecting `org.springframework.ai.chat.client.ChatClient.Builder`.
- SpringAI delivers DefaultChatClient class implementing an Observer Pattern. Observer is delivered from
  `spring-ai-starter-model-openai`.