# Design e Arquitetura de Software 1 - 2025/2 Turma A

## Repositório dos alunos
- [Repos](https://gist.github.com/waltercoan/48a25156a505f44097c9efbfbced7e35)

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

## Aula 02/09

[Fundamentos da Arquitetura de Software - Pensamento Arquitetônico](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4)

- Resuma a diferençca entre: Arquitetura e Design
- Como é a formação do conhecimento de um arquiteto modelo T?

## Aula 08/09

[Fundamentos da Arquitetura de Software - Análise de Trade-offs](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4/2/58%5Bsigil_toc_id_24%5D/1:22%5B-of%2Cfs%5D)


# 2 Bimestre

## Aula 29/09

- [circuit-breaker](https://learn.microsoft.com/en-us/azure/architecture/patterns/circuit-breaker)
- Implementação Filas: Producer / Consumer

## Aula 30/09

- Implementação Filas: Producer / Consumer

## Aula 06/10

- [Definições das características arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4)

## Aula 07/10

- [CQRS](https://learn.microsoft.com/en-us/azure/architecture/patterns/cqrs)
- [Definições das características arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4)

## Aula 13/10

- [Retry Pattern](https://learn.microsoft.com/en-us/azure/architecture/patterns/retry)
- [Fundamentos dos Padrões de Arquiteturas](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4)

## Aula 14/10

- [Fundamentos dos Padrões de Arquiteturas](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4)

## Aula 20/10 e 21/10

- [Estilo de Arquitetura em Camadas](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/40%5B%3Bvnd.vst.idref%3Dcap10.xhtml%5D!/4)

## Aula 27/10 e 28/10

- [Estilo de Arquitetura Pipeline](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/42%5B%3Bvnd.vst.idref%3Dcap11.xhtml%5D!/4)

## Aula 03/11 e 04/11

- [Estilo de Arquitetura Microkernel](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/44%5B%3Bvnd.vst.idref%3Dcap12.xhtml%5D!/4)

## Aula 10/11 e 11/11

- [Estilo de Arquitetura Microsserviços](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/54%5B%3Bvnd.vst.idref%3Dcap17.xhtml%5D!/4)

## Dapr

- Compilar o projeto 
```bash
mvn --projects app-a,app-b  package -DskipTests
```

- Rodar o projeto
```bash
dapr run -f dapr.yaml
```

## Configuração do ambiente

- [Instalar o Docker] (https://docs.docker.com/engine/install/)
- [Instalar o Dapr CLI](https://docs.dapr.io/getting-started/install-dapr-cli/)
- [Opcional: VSCode Dapr Extension](https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-dapr)
- Configuração do ambiente de desenvolvimento
- Criar um arquivo .gitignore
- Instalar o Maven no codespace

```bash
sudo su
apt-get update -y
apt-get upgrade -y
apt-get install maven -y
exit
```

## Configuração dos projetos
- Criar na raiz um arquivo chamado pom.xml
```bash
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>br.univille</groupId>
    <artifactId>devtec-cncf-dapr</artifactId>
    <version>1.0</version>
    <packaging>pom</packaging>
    <name>Multi Project: DEVTEC CNCF DAPR</name>

    <modules>
        <module></module>
    </modules>
</project>
```
### Criação do projeto app-a
- Teclar F1 e digitar spring initializr: create a maven project
    - Versão do spring: última estável (ex: 3.4.5)
    - Linguagem: Java lindo ❤️
    - Group Id: br.univille
    - Artifact Id: app-a
    - Packaging: JAR
    - Java version: 21
    - Dependencies: Spring Web
    - Selecione a pasta sugerida pelo VSCode

- Modificar o arquivo pom.xml na raiz do repositório para identificar o projeto

```bash
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>br.univille</groupId>
    <artifactId>das1b</artifactId>
    <version>1.0</version>
    <packaging>pom</packaging>
    <name>Multi Project</name>

    <modules>
        <module>app-a</module>
    </modules>
</project>
```
- Teclar F1 e digitar java:clean java language server workspace
- Iniciar o ambiente do Dapr Runtime

```bash
dapr init
docker ps
```
- Modificar o arquivo pom.xml do projeto app-a para incluir as dependencias do Dapr
```xml
    <dependency>
        <groupId>io.dapr</groupId>
        <artifactId>dapr-sdk</artifactId>
        <version>1.16.0</version>
    </dependency>
    <dependency>
        <groupId>io.dapr</groupId>
        <artifactId>dapr-sdk-springboot</artifactId>
        <version>1.16.0</version>
    </dependency>
```

## Construindo o padrão Service Invocation

- [Documentação](https://docs.dapr.io/developing-applications/building-blocks/service-invocation/service-invocation-overview/)
- [Dapr SDK Java](https://docs.dapr.io/developing-applications/sdks/java/java-client/)

- Criar na raiz do projeto um arquivo dapr.yaml

```bash
version: 1
common:
  resourcesPath: ./components/
apps:
  - appID: app-a
    appDirPath: ./app-a/target/
    appPort: 8080
    command: ["java", "-jar", "app-a-0.0.1-SNAPSHOT.jar"]
```
- Criar no projeto a pasta components

- No projeto app-a dentro do pacote java.br.univille.app_a um pacote controller e a classe HomeController.java

```java
package br.univille.app_a.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    //  ******** APPLICAÇÃO A  ************

    @GetMapping()
    public ResponseEntity index() {
        return ResponseEntity.ok().body("Hello from App A");
    }
}
```

- Executar o Maven para fazer o build da aplicação e em seguida o Dapr para executar a aplicação com o side car

```bash
mvn --projects app-a,app-b  package -DskipTests
dapr run -f dapr.yaml
```
- Criar na raiz do projeto um arquivo teste.rest com a chamada para o método

```bash
### App A GET
GET http://localhost:8080/api/v1
```

- Abra um novo bash para testar a invocação pelo Dapr

```bash
dapr invoke -a app-a --method api --verb GET
```

- Utilize o comando Control + C para interromper a execução do Dapr

### Criação do projeto app-b
- Teclar F1 e digitar spring initializr: create a maven project
    - Versão do spring: última estável (ex: 3.4.5)
    - Linguagem: Java lindo ❤️
    - Group Id: br.univille
    - Artifact Id: app-b
    - Packaging: JAR
    - Java version: 21
    - Dependencies: Spring Web
    - Selecione a pasta sugerida pelo VSCode

- Modificar o arquivo pom.xml na raiz do repositório para identificar o projeto

```bash
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>br.univille</groupId>
    <artifactId>devtec-cncf-dapr</artifactId>
    <version>1.0</version>
    <packaging>pom</packaging>
    <name>Multi Project: DEVTEC CNCF DAPR</name>

    <modules>
        <module>app-a</module>
        <module>app-b</module>
    </modules>
</project>
```
- Teclar F1 e digitar java:clean java language server workspace
- Iniciar o ambiente do Dapr Runtime

- Modificar o arquivo pom.xml do projeto app-a para incluir as dependencias do Dapr
```xml
    <dependency>
        <groupId>io.dapr</groupId>
        <artifactId>dapr-sdk</artifactId>
        <version>1.16.0</version>
    </dependency>
    <dependency>
        <groupId>io.dapr</groupId>
        <artifactId>dapr-sdk-springboot</artifactId>
        <version>1.16.0</version>
    </dependency>
```

- Modifique o arquivo do projeto app-b no pacote src/main/resources/application.properties para modificar a porta que a API será servida
```bash
spring.application.name=app-b
server.port=8081
```

- Modifique na raiz do projeto o arquivo dapr.yaml

```bash
version: 1
common:
  resourcesPath: ./components/
apps:
  - appID: app-a
    appDirPath: ./app-a/target/
    appPort: 8080
    command: ["java", "-jar", "app-a-0.0.1-SNAPSHOT.jar"]
  - appID: app-b
    appDirPath: ./app-b/target/
    appPort: 8081
    command: ["java", "-jar", "app-b-0.0.1-SNAPSHOT.jar"]        
```

- No projeto app-b dentro do pacote java.br.univille.app_b um pacote controller e a classe HomeController.java

```java
package br.univille.app_b.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    
    //  ******** APPLICAÇÃO B  ************

    @GetMapping()
    public ResponseEntity index() {
        return ResponseEntity.ok().body("Hello from App B");
    }
}
```

- Executar o Maven para fazer o build da aplicação e em seguida o Dapr para executar a aplicação com o side car

```bash
mvn --projects app-a,app-b  package -DskipTests
dapr run -f dapr.yaml
```

- Modifique o arquivo teste.rest com a chamada para o método

```bash
### App B GET
GET http://localhost:8081/api/v1
```

- Abra um novo bash para testar a invocação pelo Dapr

```bash
dapr invoke -a app-b --method api --verb GET
```

### Invocação Síncrona

- Altere a classe HomeController.java do projeto app-a para fazer uma chamada síncrona para a app-b
```java
private static final String SERVICE_APP_B = "app-b";

@PostMapping("/startsync")
public ResponseEntity startASync() {
    System.out.println("App A started");
    try(DaprClient daprClient = new DaprClientBuilder().build()){
        var message = "Hello from App A";
        daprClient.invokeMethod(SERVICE_APP_B, "/api/startsync", message, HttpExtension.POST).block();

        
    }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return ResponseEntity.status(500).body("Error starting App A");
    }
    return ResponseEntity.ok().body("App A started");
}
```

- Altere a classe HomeController.java do projeto app-b para possuir um método que será chamado pela app-a
```java
@PostMapping("/startsync")
public ResponseEntity startBSync(@RequestBody String message) {
    System.out.println("App B started");
    System.out.println("Message received: " + message);
    return ResponseEntity.ok().body("App B started");
}
```

- Executar o Maven para fazer o build da aplicação e em seguida o Dapr para executar a aplicação com o side car

```bash
mvn --projects app-a,app-b  package -DskipTests
dapr run -f dapr.yaml
```

- Modifique o arquivo teste.rest com a chamada para o método

```bash
### App A POST /startsync
POST http://localhost:8080/api/startsync
```

### Invocação Assíncrona

- [Publisher/Subscriber](https://docs.dapr.io/developing-applications/building-blocks/pubsub/pubsub-overview/)
- [Dapr SDK Java](https://docs.dapr.io/developing-applications/sdks/java/java-client/)

- Crie dentro da pasta components, um arquivo chamado pubsub.yaml

```yaml
apiVersion: dapr.io/v1alpha1
kind: Component
metadata:
  name: pubsub-dapr
spec:
  type: pubsub.redis
  version: v1
  metadata:
  - name: redisHost
    value: localhost:6379
  - name: redisPassword
    value: ""
scopes:
  - app-a
  - app-b
```

- Altere a classe HomeController.java do projeto app-a para fazer uma chamada assíncrona para a app-b publicando um evento
```java
private static final String PUBSUBNAME = "pubsub-dapr";
private static final String TOPICNAME = "topicodapr";

@PostMapping("/pub")
public ResponseEntity startAASync() {
    System.out.println("App A started");
    try(DaprClient daprClient = new DaprClientBuilder().build()){
        var message = "Hello from App A";
        daprClient.publishEvent(PUBSUBNAME, TOPICNAME, message).block();

    }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return ResponseEntity.status(500).body("Error starting App A");
    }
    return ResponseEntity.ok().body("App A started");
}
```

- Altere a classe HomeController.java do projeto app-b para possuir um método que irá consumir os eventos publicados por app-a
```java
@Topic(pubsubName = "pubsub-dapr", name = "topicodapr")
@PostMapping(path="/sub", consumes = MediaType.ALL_VALUE)
public ResponseEntity startBASync(@RequestBody(required = false) CloudEvent<String> cloudEvent) {
    System.out.println("App B started");
    var idMessage = cloudEvent.getId();
    var message = cloudEvent.getData();
    System.out.println("Message " + idMessage +  " received: " + message);
    return ResponseEntity.ok().body("App B started");
}
```

- Executar o Maven para fazer o build da aplicação e em seguida o Dapr para executar a aplicação com o side car

```bash
mvn --projects app-a,app-b  package -DskipTests
dapr run -f dapr.yaml
```

- Modifique o arquivo teste.rest com a chamada para o método

```bash
### App A POST /startasync
POST http://localhost:8080/api/v1/pub
```

