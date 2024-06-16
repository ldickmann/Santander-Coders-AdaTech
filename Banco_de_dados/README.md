## Resumo de comandos SQL (PostgreSQL)
### Aluno/Autor: Lucas E. Dickmann

#### Criação das tabelas

```sql
--Cria uma tabela
CREATE TABLE 'nome da table' (
	'id de identificação' ('tipo do dado'),
	'coluna tal' 'tipo do dado'('quantidade de caracter[se necessario]'),
	PRIMARY KEY ('id de identificação'),
	
--Seleciona a tabela.
SELECT * FROM 'table'

--Inseri dados na tabela
INSERT INTO 'table' ('coluna', 'coluna')
VALUE (coluna, 'coluna se letras')

--Exemplo de dado inserido na tabela matriculas
INSERT INTO matriculas (id_matricula, id_aluno, preco_da_mensalidade, validade, cpf_do_responsavel)
VALUES (1, 1, 1000, 13062024, '256.656.987-21'),
	(2, 2, 1050, '09-06-2024', '256.785.658-95');

--Atualiza o dado da tabela
UPDATE 'table' SET 'campo a ser editado' = 'valor do campo a ser editado'
WHERE 'localiza na tabela' = 'id do item a ser editado'

--Deleta o dado da tabela no id indicado
DELETE FROM 'table' 
WHERE 'localiza na tabela' = 'id do item a ser deletado'

--Cria uma view da tabela com os campos 'id_matricula', 'id_aluno', 'validade'
CREATE VIEW 'matricula_com_sigilo' AS
(
	SELECT 
	id_matricula,
	id_aluno,
	validade
	FROM matriculas
)
