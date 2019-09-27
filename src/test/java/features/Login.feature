#language: pt
#author: Rafael Costa
#encoding: UTF-8
#version 1.0
#date: 27/09/2019

  Funcionalidade: Login no sistema

    @Login
    Cenario: Realizar login com sucesso

      Dado que acesso o sistema
      Quando realizo login com usuario "ADM"
      Entao visualizo mensagem de boas vindas