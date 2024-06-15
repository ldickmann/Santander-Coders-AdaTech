13/06/2024

PostgreSQL - Professor Tiago Marto


Comandos aprendidos:
	
create table 'nome da table' (
	'id de identificação' *tipo do dado*,
	'coluna tal' *tipo do dado*(quantidade de caracter[se necessario]),
	primary key ('id de identificação'),
	

select * from 'table' (seleciona a tabela)

insert into 'table' ('coluna', 'coluna')
values (coluna, 'coluna se letras')

update 'table' set *campo a ser editado* = *valor do campo a ser editado*
where *localiza na tabela* = *id do item a ser editado*

delete from 'table' 
where *localiza na tabela* = *id do item a ser deletado*



Permissionamento -- comandos Views - Table Matriculas


create view *matricula_com_sigilo* as 
(
	select 
	id_matricula,
	id_aluno,
	validade
	from matriculas
)


insert into matriculas (id_matricula, id_aluno, preco_da_mensalidade, validade, cpf_do_responsavel)
values (1, 1, 1000, 13062024, '256.656.987-21')

Autor/Aluno Lucas E. Dickmann - Developer
