create table pessoa (id bigint auto_increment not null, nome varchar(100) not null, data_nascimento date not null, primary key (id));

insert into pessoa(nome, data_nascimento) values ('Felix Gilioli', '1999-11-07');

insert into pessoa(nome, data_nascimento) values ('Daiane Bellon', '1998-12-31');