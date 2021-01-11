# Projeto: Validação de Senha
-----------------------------

Exemplo de validação de senha em uma tela de login seguindo as especificações (requisitos).

O projeto foi criado em JavaFx para desktop na IDE Eclipse.


Motivação do uso do JavaFx:
---------------------------

O JavaFx é uma solução RIA (Rich Internet Applications) versátil e que pode ser desenvolvido com relativa rapidez.

Possui diversas formas de deploy como aplicações desktop e web, além disso é possível desenvolver a applicação inteiramente na linguagem Java ou utilizar os arquivos FXML e CSS para o layout e estilo conjuntamente.

Com o uso de Java, FXML e CSS há separação entre interface de usuário (Telas) da lógica de programação (Back), como é feito em Java Web (padrão MVC).


Construção do Projeto:
----------------------

O programa principal contém 3 classes Java (Inicialização e Controle), 1 arquivo FXML (Tela), 1 arquivo CSS e 1 arquivo de imagem.

- LoginITI.java :             Inicia a aplicação (Stage), define o título da janela, dimensiona sua largura e altura, define qual arquivo FXML será utilizado.
                         
- LoginITIController.java :   Define a ação dos tratadores de evento que por sua vez, chamam a classe que faz a validação da senha.
                              Existem 2 eventos: Quando o user clica no botão "Sign In" ou quanto digita "Enter" na caixa de password.
                       
- ValidaSenha.java:           Faz a validação da senha digitada de acordo a especificação (requisitos) do projeto.                          
                          

Há 2 classes de teste:
