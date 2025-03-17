# Kotlin Spring Learn

Este projeto é um exemplo de aplicação Spring Boot usando Kotlin.

## Tecnologias Utilizadas

- Kotlin
- Spring Boot
- Spring Data JDBC
- Gradle

## Requisitos

- JDK 21
- Gradle

## Configuração do Projeto

1. Clone o repositório:
    ```sh
    git clone https://github.com/joaopedrodevl/kotlin-spring-learn.git
    cd kotlin-spring-learn
    ```

2. Compile o projeto:
    ```sh
    ./gradlew build
    ```

3. Execute a aplicação:
    ```sh
    ./gradlew bootRun
    ```

## Endpoints

### Listar Mensagens

- **URL:** `/`
- **Método:** `GET`
- **Resposta:** Lista de mensagens

### Criar Mensagem

- **URL:** `/`
- **Método:** `POST`
- **Corpo da Requisição:** JSON representando a mensagem
- **Resposta:** Mensagem criada

### Obter Mensagem por ID

- **URL:** `/{id}`
- **Método:** `GET`
- **Resposta:** Mensagem correspondente ao ID ou `404 Not Found`

## Estrutura do Projeto

- `src/main/kotlin/com/example/kotlinspringlearn/controllers/MessageController.kt`: Controlador REST para gerenciar mensagens.
- `src/main/kotlin/com/example/kotlinspringlearn/services/MessageService.kt`: Serviço para lógica de negócios relacionada a mensagens.
- `src/main/kotlin/com/example/kotlinspringlearn/models/Message.kt`: Modelo de dados para mensagens.
- `src/main/kotlin/com/example/kotlinspringlearn/repositories/MessageRepository.kt`: Repositório para acesso ao banco de dados.

## Documentação Adicional

Para mais informações, consulte a documentação oficial:

- [Documentação do Gradle](https://docs.gradle.org)
- [Guia de Referência do Spring Boot Gradle Plugin](https://docs.spring.io/spring-boot/3.4.3/gradle-plugin)
- [Spring Data JDBC](https://docs.spring.io/spring-boot/3.4.3/reference/data/sql.html#data.sql.jdbc)
- [Spring Web](https://docs.spring.io/spring-boot/3.4.3/reference/web/servlet.html)

## Guias

- [Usando Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
- [Construindo um Serviço Web RESTful](https://spring.io/guides/gs/rest-service/)
- [Servindo Conteúdo Web com Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Construindo serviços REST com Spring](https://spring.io/guides/tutorials/rest/)

## Links Adicionais

- [Gradle Build Scans – insights para o build do seu projeto](https://scans.gradle.com#gradle)