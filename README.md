# Livro Algaworks - Estudo do fabiogm6
Java EE 7 com JSF, PrimeFaces e CDI
por Thiago Faria
Edição de 24/12/2013

feito os exercicios do livro
funcionando ! Thanks para Algaworks ! Muito bom !

este P06 é o mesmo do P05, só que isola alguns exercicios do livro da Algaworks, como: Livros.xhtml, CalculadoraData.xhtml

para rodar:
http://localhost:8080/P06/Ola.xhtml

http://localhost:8080/P06/Nomes.xhtml

http://localhost:8080/P06/NomesBinding.xhtml <-- tá com pau mas parece simples resolver. Na pratica precisa ponderar se usamos javascript com consistências no client ou este que faz consistencias no servidor

http://localhost:8080/P06/Livros.xhtml
http://localhost:8080/P06/LivrosInputUser.xhtml

http://localhost:8080/P06/CalculadoraData.xhtml


para ajudar peguei c[odigo do GitHub no:
https://github.com/algaworks/ebook-jsf-financeiro
e fui comparando com minha evolução. Depois deichei a minha evolução igual.
A maior diferenciação é que não usa 'library' algaworks no código e sim 'fgm'.

para manipular no Git:
1) para Clonar local: http://www.gujavasc.org/2013/08/03/clonar-um-projeto-do-github-com-o-plugin-egit-para-o-eclipse/
2) para Exportar para GitHub: http://blog.camilolopes.com.br/usando-o-git-no-eclipse/
3) url local de acesso:
mudei o contexto para P05
http://localhost:8080/P05/Login.xhtml

Login: admin
pw: 123

para funcionar:

1) ir no persistente.xml e mudar o acesso para o MySQL (user e pw);

2) criar 2 tabelas no MySQL

    a) lancamento
    
    CREATE TABLE `lancamento` (
      `id` bigint(20) NOT NULL AUTO_INCREMENT,
      `pessoa_id` bigint(20) NOT NULL,
      `descricao` varchar(80) NOT NULL,
      `tipo` varchar(255) NOT NULL,
      `valor` decimal(10,2) DEFAULT NULL,
      `data_pagamento` date DEFAULT NULL,
      `data_vencimento` date DEFAULT NULL,
      PRIMARY KEY (`id`)


    b) pessoa
    
    CREATE TABLE `pessoa` (
      `id` bigint(20) NOT NULL AUTO_INCREMENT,
      `nome` varchar(60) NOT NULL,
      PRIMARY KEY (`id`)


