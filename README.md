# DSList

[![Build Status](https://travis-ci.org/eduardoh03/dslist.svg?branch=main)](https://travis-ci.org/eduardoh03/dslist)

DSList é um projeto que oferece uma solução para a organização de games em listas pertencentes a um usuário. Ele utiliza o H2 como banco de dados de teste e o Postman em produção. O projeto é desenvolvido usando Spring Boot 3.1.1, Java 17 e Maven.

## Funcionalidades

- Criação de listas de jogos por usuário
- Adição e remoção de jogos em listas
- Gerenciamento de jogos, incluindo título, gênero, plataforma, etc.
- Pesquisa e filtragem de jogos por várias categorias

## Requisitos do Sistema

- Java Development Kit (JDK) 17
- Maven

## Configuração

1.Clone o repositório do DSList:

```bash
git clone https://github.com/eduardoh03/dslist.git
```

1.1Navegue até o diretório do projeto:
```bash
cd dslist
```
1.2 Execute o comando Maven para compilar e empacotar o projeto:
```bash
mvn package
```

2.Executando o Projeto:

2.1 Após a conclusão da etapa de compilação, execute o comando Maven para iniciar o servidor embutido do Spring Boot:
```bash
mvn spring-boot:run
```
2.2 O DSList estará disponível em http://localhost:8080.

3.Testando a API
Você pode usar o Postman ou qualquer outra ferramenta de teste de API para interagir com o DSList. Abaixo estão algumas rotas básicas:
- GET **/games/** - Retorna todas os jogos.

Consulte a documentação completa da API para obter detalhes sobre todas as rotas disponíveis.

4.Contribuindo:
Se você quiser contribuir para o DSList, fique à vontade para abrir um pull request. Certifique-se de seguir as diretrizes de contribuição.

5.Licença:
Este projeto está licenciado sob a MIT License.
