# Exercicios SPRING BOOT

## Criar um Projeto Spring Boot:
1. Utilize o Spring Initializr para criar um novo projeto Spring Boot com as seguintes dependências:
- Spring Web
- Spring Data JPA
- H2 Database

## Configurar o application.properties:
2. No arquivo src/main/resources/application.properties, adicione a configuração para o banco de dados H2:
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```
3. Criar a Entidade Pessoa:
Crie um pacote model.
Dentro desse pacote, crie uma classe Pessoa com o seguinte atributos;
Nome, cpf, login, senha, idade;



## Exercício 2: Criação do Repositório e Serviço
Objetivo
Criar o repositório JPA e o serviço para gerenciar operações com a entidade Pessoa.
Tarefas
Criar o Repositório:
Crie um pacote repository.
Dentro desse pacote, crie uma interface PessoaRepository que estende JpaRepository:
```
package com.example.demo.repository;

import com.example.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
```
Criar o Serviço:
Crie um pacote service.
Dentro desse pacote, crie uma classe PessoaService com o seguintes métodos:
save, findAll, findById, deleteById:






## Exercício 3: Criação dos Endpoints REST para CRUD 
### Objetivo:
- Criar os endpoints REST para realizar operações CRUD na entidade Pessoa.
### Tarefas:
- Criar o Controller:
- Crie um pacote controller.
- #### Dentro desse pacote, crie uma classe PessoaController ccom o seguintes endpoints:
- save, findAll, findById, deleteById:

# Testes no Postman
![Post-save.png](testes-Postman%2FPost-save.png)

![deleteById.png](testes-Postman%2FdeleteById.png)

![Get-findAll.png](testes-Postman%2FGet-findAll.png)

![Get-findById.png](testes-Postman%2FGet-findById.png)


