#Author: your.email@your.domain.com


Feature: Cadastro cliente
 Eu como usuaria quero utilizar o buscape para cadastro
 
 Background: Acessar site buscape
 Given que esteja no "https://www.buscape.com.br/"
 

  @executa
  Scenario: Validar sugestão no campo de busca
    When pesquisar o primeiro produto
    Then valido se ha sugestoes 
    
    @executa
    Scenario: Validar campo de busca somente com números
    When  pesquisar com numeros
    Then Validar se ha sugestao no campo de busca
    
    @executa
    Scenario: Validar se resultado da busca condiz com categoria selecionada
    When  pesquisar o terceiro produto
    And Selecionar categoria
    Then Valida se resultado condiz com categoria
    
    @executa
    Scenario: Validar se categorias condiz com produto pesquisado
    When  pesquisar o quarto produto
    Then Validar se categorias condizem com produto
