# rest-api-clientes
Rest API em Java Spring Boot e MySQL, com cliente em HTML, CSS e JS. Desenvolvido para a disciplina de Sistemas Distribuídos do curso de ADS da FATEC Ferraz de Vasconcelos

### Requisitos

- Java 11 ou superior instalado.
- Maven ou Gradle para gerenciamento de dependências (Maven é recomendado).

### Passos

1. Clone o repositório:

    ```bash
    git clone https://github.com/gustavoalvesdev/spring-rest-api.git
    cd spring-rest-api
    ```

2. Compile o projeto:

    Se estiver usando Maven:

    ```bash
    mvn clean install
    ```

    Se estiver usando Gradle:

    ```bash
    ./gradlew build
    ```

3. Execute a aplicação:

    Para Maven:

    ```bash
    mvn spring-boot:run
    ```

    Para Gradle:

    ```bash
    ./gradlew bootRun
    ```

4. A API estará rodando em `http://localhost:8080`

## MÉTODOS E ENDPOINTS ##

MÉTODO | CAMINHO | DESCRIÇÃO 
------------|-----|------------
GET | /clientes | Lista todos os clientes cadastrados
POST | /clientes| Cadastra um novo cliente 
POST | /clientes| Atualiza um novo cliente se passado um id existente no corpo da requisição 
DELETE | /clientes | Exclui um cliente baseado no id passado no corpo da requisição
