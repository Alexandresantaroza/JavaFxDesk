# Projeto: Validação de Senha
-----------------------------

Exemplo de validação de senha em uma tela de login seguindo as especificações (requisitos diretos).

O projeto foi criado em JavaFx utilizando a IDE Eclipse para execução desktop.


Conteúdo do repositório "JavaFxDesk":
-------------------------------------

Pasta "AmostrasTela":                 Possui vários prints de execução da aplicação direto no Eclipse.

Pasta "LoginITI_Proj":                Projeto JavaFx.

                                      **[Nota (BUG)]: Há o arquivo "LoginITI.jar" dentro desta pasta que é o executável. Houve problemas na execução, a aplicação não está 
                                      carregando o arquivo CSS quando é executada por este jar ficando sem a imagem de background e sem a cor de fundo. A funcionalidade, porém 
                                      não foi afetada. Ver telas na pasta "AmostrasTela" ou baixar o projeto e carregar no Eclipse para executar sem esse problema.
                                      

Pasta "RelatóriosHTML_JUnitTests":    Contém um arquivo "rar" (compactado) contendo páginas HTML do relatório de testes. Para vizualizar, baixe e descompacte em uma pasta
                                      qualquer.


Motivação do uso do JavaFx:
---------------------------

O JavaFx é uma solução RIA (Rich Internet Applications) versátil e que pode ser desenvolvido com relativa rapidez.

Possui diversas formas de deploy como aplicações desktop e web, além disso é possível desenvolver a applicação inteiramente na linguagem Java ou utilizar os arquivos FXML e CSS para o layout e estilo conjuntamente.

Com o uso de Java, FXML e CSS há separação entre interface de usuário (Telas) da lógica de programação (Back), como é feito em Java Web (padrão MVC).


Construção do Projeto:
----------------------

O programa principal contém 3 classes Java (inicialização e controle), 1 arquivo FXML (tela), 1 arquivo CSS (estilo) e 1 arquivo de imagem (background).

- LoginITI.java :             Inicia a aplicação (Stage), define o título da janela, dimensiona sua largura e altura, define qual arquivo FXML será utilizado.
                         
- LoginITIController.java :   Define a ação dos tratadores de evento que por sua vez, chamam a classe que faz a validação da senha.
                              Existem 2 eventos: quando o usuário clica no botão "Sign In" ou quando digita "Enter" na caixa de password.
                       
- ValidaSenha.java:           Faz a validação da senha digitada de acordo a especificação (requisitos) do projeto.                          
                          

Há 2 classes de teste, uma para verificar se o JUnit foi bem instalado: "TesteConfiguracaoJUnit" e a principal: "ValidaSenhaTest.java" que testa a lógica da validação da senha digitada.
