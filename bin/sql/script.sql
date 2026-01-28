-- Script para criar uma tabela de clientes em linguagem SQL
-- Nome de tabelas podem ser definidos no plural

CREATE TABLE clientes(
	id 				SERIAL 		 		PRIMARY KEY,
	nome        	VARCHAR(100) 		NOT NULL,
	email       	VARCHAR(100) 		NOT NULL,
	telefone        VARCHAR(30) 		NOT NULL,
	data_criacao 	TIMESTAMP 			NOT NULL DEFAULT NOW()
	
);
