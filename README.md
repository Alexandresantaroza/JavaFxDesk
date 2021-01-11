# Projeto: Validação de Senha
-----------------------------

Exemplo de validação de senha em uma tela de login seguindo as especificações (requisitos diretos).

O projeto foi criado em JavaFx utilizando a IDE Eclipse para execução desktop.


Conteúdo do repositório "JavaFxDesk":
-------------------------------------

Pasta "AmostrasTela":                 Possui vários prints de execução da aplicação direto no Eclipse.


Pasta "LoginITI_Proj":                Projeto JavaFx. Assista pelo link abaixo um pequeno video de exemplo de execução: 
                                      <h4>https://user-images.githubusercontent.com/76496007/104141577-3f789900-5396-11eb-9d29-a9037ff36ea1.mp4</h4>


                                      **[Nota (BUG)]: Há o arquivo "LoginITI.jar" dentro desta pasta que é o executável. Houve problemas na execução, a aplicação não está 
                                      carregando o arquivo CSS quando é executada por este jar ficando sem a imagem de background e sem a cor de fundo. A funcionalidade porém 
                                      não foi afetada. Ver telas na pasta "AmostrasTela" ou baixar o projeto e carregar no Eclipse para executar sem esse problema ou
                                      clique no link acima para assistir a um exempo de execução.
                                                     
                                                     
Pasta "RelatóriosHTML_JUnitTests":    Contém um arquivo "rar" (compactado) contendo páginas HTML do relatório de testes. Para vizualizar, baixe e descompacte em uma pasta
                                      qualquer; depois, clique sobre o arquivo "index.html".


Motivação do uso do JavaFx:
---------------------------

O JavaFx é uma solução RIA (Rich Internet Applications) versátil e que pode ser desenvolvido com relativa rapidez.

Possui diversas formas de deploy como aplicações desktop e web, além disso é possível desenvolver a applicação inteiramente na linguagem Java ou utilizar os arquivos FXML e CSS para o layout e estilo em conjunto.

Com o uso de Java, FXML e CSS há separação entre interface de usuário (Telas) da lógica de programação (Back), como é feito em Java Web (padrão MVC).


Construção do Projeto:
----------------------

O programa principal contém 3 classes Java (inicialização e controle), 1 arquivo FXML (tela), 1 arquivo CSS (estilo) e 1 arquivo de imagem (background).

- LoginITI.java :             Inicia a aplicação (Stage), define o título da janela, dimensiona sua largura e altura, define qual arquivo FXML será utilizado.
                         
- LoginITIController.java :   Define a ação dos tratadores de evento que por sua vez, chamam a classe que faz a validação da senha.
                              Existem 2 eventos: quando o usuário clica no botão "Sign In" ou quando digita "Enter" na caixa de password.
                       
- ValidaSenha.java:           Faz a validação da senha digitada de acordo a especificação (requisitos) do projeto.                          
                          

Há 2 classes de teste, uma para verificar se o JUnit foi bem instalado: "TesteConfiguracaoJUnit" e a principal: "ValidaSenhaTest.java" que testa a lógica da validação da senha digitada.



Explicação da Lógica Principal:
-------------------------------

A variável "pass" recebe a senha digitada pelo usuário e o texto com haspas é a expressão regular que verifica se a senha contém ou não o padrão buscado.

Em Java, a instrução: Pattern.matches(".*[a-z]+.*",pass) retorna true se o conteúdo de "pass" contiver o padrão buscado na expressão ".*[a-z]+.*" ou false, em caso contrário.

Importante: pode haver o símbolo de exclamação antes da instrução acima, como no caso: !Pattern.matches(".*\\s+.*",pass). Se o resultado da instrução for true, 
            se tornará false e se for false, se tornará true; ou seja, nega o resultado.
            
 
![logicaPrincipal](https://user-images.githubusercontent.com/76496007/104141132-ed367880-5393-11eb-8272-1c0ecdf5b16b.png)
