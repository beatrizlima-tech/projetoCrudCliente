# 👥 Projeto CRUD de Clientes

Aplicação desenvolvida em Java para gerenciamento de clientes utilizando JDBC e PostgreSQL.

O sistema permite realizar operações completas de CRUD (Create, Read, Update e Delete) através de um menu interativo executado no terminal.

## 🚀 Tecnologias Utilizadas

* Java
* JDBC
* PostgreSQL
* SQL
* Programação Orientada a Objetos (POO)

## 📋 Funcionalidades

* Cadastrar clientes
* Atualizar clientes
* Excluir clientes
* Consultar clientes cadastrados
* Persistência de dados em banco PostgreSQL
* Conexão com banco utilizando JDBC

## 🏗️ Estrutura do Projeto

```text
src
│
├── controllers
│   └── ClienteController
│
├── entities
│   └── Cliente
│
├── repositories
│   └── ClienteRepository
│
└── factories
    └── ConnectionFactory
```

## 📊 Modelo de Dados

```sql
CREATE TABLE clientes(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(30) NOT NULL,
    data_criacao TIMESTAMP NOT NULL DEFAULT NOW()
);
```

## 🖥️ Operações Disponíveis

Ao executar a aplicação, o usuário pode escolher entre:

```text
(1) Cadastrar Cliente
(2) Atualizar Cliente
(3) Excluir Cliente
(4) Consultar Clientes
```

### Cadastro

Permite registrar um novo cliente informando:

* Nome
* Email
* Telefone

### Atualização

Permite alterar os dados de um cliente existente através do ID.

### Exclusão

Remove um cliente cadastrado utilizando seu ID.

### Consulta

Lista todos os clientes cadastrados no banco de dados.

## ⚙️ Configuração do Banco

Crie um banco PostgreSQL chamado:

```text
bdprojetocliente
```

Configure as credenciais na classe:

```java
ConnectionFactory
```

## ▶️ Executando o Projeto

1. Clone o repositório

```bash
git clone https://github.com/beatrizlima-tech/projetoCrudCliente.git
```

2. Configure o banco PostgreSQL

3. Execute a aplicação Java

4. Utilize o menu para gerenciar os clientes

## 🎯 Objetivo do Projeto

Projeto desenvolvido para praticar:

* Operações CRUD
* JDBC
* Integração Java com PostgreSQL
* Estruturação em camadas
* Programação Orientada a Objetos
* Manipulação de banco de dados relacional

## 👩‍💻 Desenvolvedora

Beatriz Lima

GitHub:
https://github.com/beatrizlima-tech
