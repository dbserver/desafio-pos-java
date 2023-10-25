![Logo](logo.png)

# Desafio - Sistema Ponto de Venda (PoS - Point of Sale)

O Sistema Ponto de Venda (PoS - Point of Sale) simula um módulo de frente de caixa de supermercado integrado com o respectivo cadastro de produtos, controlando também seus estoques, em que baixas são dadas sempre que uma venda é concluída.

## Visão geral

![Classes](classes.drawio.png)

## Getting started

### Pré-requisitos

- [Java SE Development Kit 11](https://www.oracle.com/br/java/technologies/downloads/#java11) ou superior

### Workspace

O workspace contém três diretórios padrão, sendo eles:

- `src` - Local dos arquivos de código fonte da codebase
- `lib` - Local das dependências de projeto 
- `bin` - Local da *saída* da compilação 

> [!NOTE]
> - `lib` não existirá se o projeto não tiver dependências
> - `bin` não é versionado, logo só existirá *localmente*, conforme especificado abaixo

### Executando o projeto

#### 1. Via terminal de comandos

Cria o diretório "bin" se ele já não existir
```bash
mkdir bin
```
> [!NOTE]
> O comando de criação de diretório pode variar dependendo do SO

Compila os arquivos de código fonte no diretório "bin"
```bash
javac src/* -d "bin"
```
Executa a classe App (main) compilada dentro do diretório "bin"
```bash
java -cp "bin" App
```

## Enunciado do desafio
