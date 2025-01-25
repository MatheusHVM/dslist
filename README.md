# Dslist

Lista de jogos para realizar consultas e reorganizar conforme sua preferência.

## Requisitos

- [Java 21](https://www.oracle.com/br/java/technologies/downloads/#java21)

## Clone o projeto
```bash
git@github.com:MatheusHVM/dslist.git
```
## Rotas postman

- GET Games: Busca a lista de jogos
- GET Games by ID: Busca um jogo por meio do ID
- GET Lists: Busca a categoria das listas de jogos
- GET Lists by ID from Games: Busca a lista categorizado pelo gênero (ID) do jogos
- POST Lists Replacement: Permite o usuário organizar em base da sua opinião

# Modelo de domínio DSList

![image](https://github.com/user-attachments/assets/cb2d9cba-6763-4f20-97e2-d120fa2104f5)

# Tecnologias Utilizadas

- Java 
- SpringBoot
- JPA / Hibernate
- Maven
