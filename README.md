# Design e Arquitetura de Software 1 - 2025/2 Turma A

## Repositório dos alunos
- [Repos](#)

## Configuração do GIT
```
git config --global user.name "NOME DO USUARIO NO GITHUB"
git config --global user.email "EMAIL DA CONTA DO GITHUB"
```

## Bibliografia

[Livro Eng Soft Moderna - Cap 7](https://engsoftmoderna.info)

[Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2%5B%3Bvnd.vst.idref%3Dcover%5D!/4/2/2%4051:1)


## Configuração ao ambiente

- Instalação do Maven

```bash
sudo su
apt-get update -y
apt-get upgrade -y
apt-get install maven -y
exit
```


## Arquitetura de Código

[5 Princípios de Projeto](https://engsoftmoderna.info/cap5.html)

## Aula 04/08

- Princípios de projeto de código
- Padronização de código
- Ocultamento de Informação
- Coesão
- Acoplamento

## Aula 05/08

- SOLID
  - Single Responsibility Principle
  - Interface Segregation Principle

```java
package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janelinha extends JFrame{

    private JButton botaozinho;
    private Controlador controlador;

    public Janelinha() {
        setTitle("Eu nao acredito");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaozinho = new JButton("ME CLICA");
        controlador = new Controlador();
        botaozinho.addActionListener(controlador);

        /*botaozinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oi");
            }
        });*/
        
        add(botaozinho);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha();
    }
}
```


```java
package br.univille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        meClica();
    }

    private void meClica(){
        JOptionPane.showMessageDialog(null, "NAO ACREDITO");
    }
    
    
}
```


## Aula 11/08

- SOLID
  - Princípio da inversão de dependências
  - Prefira composição a herança
  - Princípio de Demeter (menor conhecimento)
  - Princípio Aberto/Fechado

## Aula 12/08
- SOLID
  - Princípio Liskov

[Livro Padrões de Projeto](https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0)

[Livro Engenharia de Software - Padrões de Projeto](https://engsoftmoderna.info/cap6.html)

[Padrões de Projeto Guru](https://refactoring.guru/design-patterns)


## Aula 25/08

[Padrões de Projeto Guru - Implementação Observer](https://refactoring.guru/design-patterns/observer)

## Aula 26/08

[Fundamentos da Arquitetura de Software - Introdução](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/18[%3Bvnd.vst.idref%3Dcap1.xhtml]!/4)

- Definir Introdução a arquitetura (características, princípios e decisões)

## Aula 01/09

[Fundamentos da Arquitetura de Software - Introdução](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/18[%3Bvnd.vst.idref%3Dcap1.xhtml]!/4)

- Expectativas de um arquiteto
- Decisões de arquitetura
- Analisar continuamento a arquitetura
- Manter-se atualizado
- Domínio do negócio
- DevOps
  
[Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops)

