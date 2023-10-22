# dio-java-avancado-desafios

Repositório para armazenar os desafios do curso de Java Avançado da DIO.

[Desafio API REST Usando Spring Boot 3, Java 17] - Projeto desenvolvido como parte do desafio API REST na Nuvem Usando Spring Boot 3, Java 17, Railway, Spring Data JPA, H2 Database e OpenAPI.

[Observações] - Projeto para fins de aprendizado.

Deu algum B.O (Tenho que descobrir oque) -> Provisionando o PostgreSQL (Railway) e Criando o Perfil de PRD.

Deploy da API na Nuvem (Railway)(Não tive tempo de chegar nesta parte).


##Diagrama de Classes

```mermaid
classDiagram
    class User {
        -name String
        -account Account
        -features[] features
        -card Card
        -news[] news
    }
    class Account {
        -number String
        -agency String
        -balance Double
        -limit Double
    }
    class Feature {
        -icon String
        -description String
    }
    class Card {
        -number String
        -limit Double
    }
    class News {
        -icon String
        -description String
    }

    User "1" * -- "1" Account
    User "1" * -- "N" Feature
    User "1" * -- "1" Card
    User "1" * -- "N" News
```

