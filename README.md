# 👥 Projeto CRUD de Clientes

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![JDBC](https://img.shields.io/badge/JDBC-Database-orange?style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge\&logo=postgresql)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **Projeto CRUD de Clientes** é uma aplicação Java desenvolvida para gerenciamento de clientes utilizando **JDBC** e **PostgreSQL**.

A aplicação executa operações completas de CRUD (Create, Read, Update e Delete) através de um menu interativo no terminal, aplicando conceitos fundamentais de persistência de dados, SQL e Programação Orientada a Objetos.

Este projeto foi desenvolvido com foco no aprendizado da integração entre aplicações Java e bancos de dados relacionais utilizando SQL puro.

---

# 🚀 Funcionalidades

* Cadastro de clientes
* Consulta de clientes
* Atualização de clientes
* Exclusão de clientes
* Persistência de dados em PostgreSQL
* Integração com JDBC
* Menu interativo no terminal

---

# 🧱 Tecnologias Utilizadas

* Java 21
* JDBC
* PostgreSQL
* SQL
* Maven
* Programação Orientada a Objetos (POO)

---

# 🏗️ Estrutura do Projeto

```text
src/

├── controllers
├── entities
├── factories
└── repositories
```

---

# 📊 Arquitetura

```text
Usuário
    │
    ▼
Controller
    │
    ▼
Repository
    │
    ▼
JDBC
    │
    ▼
PostgreSQL
```

---

# 🗄️ Banco de Dados

Banco utilizado:

```text
PostgreSQL
```

Criação da tabela:

```sql
CREATE TABLE clientes(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(30) NOT NULL,
    data_criacao TIMESTAMP NOT NULL DEFAULT NOW()
);
```

---

# ⚙️ Operações Disponíveis

Ao iniciar a aplicação, o usuário poderá escolher uma das opções:

```text
(1) Cadastrar Cliente
(2) Atualizar Cliente
(3) Excluir Cliente
(4) Consultar Clientes
```

---

# ⚙️ Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/beatrizlima-tech/projetoCrudCliente.git
```

---

## 2. Criar o banco de dados

```sql
CREATE DATABASE bdprojetocliente;
```

Execute também o script de criação da tabela disponível no projeto.

---

## 3. Configurar a conexão

Atualize as credenciais na classe **ConnectionFactory**.

---

## 4. Executar a aplicação

Abra o projeto em uma IDE Java (IntelliJ IDEA, Eclipse ou VS Code) e execute a classe principal.

---

# 📚 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* CRUD
* JDBC
* SQL
* PostgreSQL
* Repository Pattern
* Organização em camadas
* Manipulação de banco de dados relacional
* Tratamento de exceções

---

# 📌 Melhorias Futuras

* Migrar JDBC para Spring Data JPA
* Adicionar validações dos dados
* Implementar interface gráfica
* Criar testes automatizados
* Adicionar documentação da aplicação

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
