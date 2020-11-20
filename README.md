# rest-api-clientes
Rest API em Java Spring Boot e MySQL, com cliente em HTML, CSS e JS. Desenvolvido para a disciplina de Sistemas Distribuídos do curso de ADS da FATEC Ferraz de Vasconcelos

## MÉTODOS E ENDPOINTS ##

MÉTODO | CAMINHO | DESCRIÇÃO 
------------|-----|------------
GET | /clientes | Lista todos os clientes cadastrados
POST | /clientes| Cadastra um novo cliente 
POST | /clientes| Atualiza um novo cliente se passado um id existente no corpo da requisição 
DELETE | /clientes | Exclui um cliente baseado no id passado no corpo da requisição
