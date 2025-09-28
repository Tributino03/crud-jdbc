
<h1 align="center">CRUD com JDBC - Cadastro de Produtores</h1>

<p align="center">
  Sistema back-end desenvolvido em <strong>Java</strong> com <strong>JDBC puro</strong> para manipulação direta de banco de dados <strong>MySQL</strong>, aplicando o padrão de projeto <strong>DAO</strong> e testes unitários com <strong>JUnit</strong>.
</p>

<hr/>

<h2>Sobre o Projeto</h2>

<p>
Este projeto tem como objetivo demonstrar a implementação de um CRUD (Create, Read, Update, Delete) completo utilizando <strong>JDBC puro</strong>, sem frameworks ORM, para o gerenciamento de produtores. 
O sistema permite cadastrar, buscar, atualizar e excluir produtores diretamente no banco de dados <strong>MySQL</strong>.
</p>

<h3>Destaques do Projeto</h3>

<ul>
  <li><strong>CRUD Completo:</strong> Implementação de todas as operações de banco de dados (inserção, leitura, atualização e exclusão).</li>
  <li><strong>Padrão DAO:</strong> Separação da lógica de negócio e da lógica de persistência, facilitando manutenção e escalabilidade.</li>
  <li><strong>Testes Unitários:</strong> Cobertura de todas as operações com <strong>JUnit</strong> para garantir o correto funcionamento do sistema.</li>
  <li><strong>Boas Práticas:</strong> Estrutura organizada, uso de Prepared Statements e tratamento de exceções.</li>
</ul>

<hr/>

<h2>🛠️ Tecnologias Utilizadas</h2>

<ul>
  <li><strong>Java</strong> - Linguagem principal do projeto</li>
  <li><strong>JDBC</strong> - Conexão e manipulação direta do banco de dados</li>
  <li><strong>JUnit</strong> - Testes unitários</li>
  <li><strong>MySQL</strong> - Banco de dados relacional</li>
  <li><strong>Docker</strong> - Containerização do banco de dados</li>
</ul>

<hr/>

<h2>Como Executar o Projeto Localmente</h2>

<h3>Pré-requisitos</h3>

<ul>
  <li>Java 17+ (JDK)</li>
  <li>Maven 3.8+</li>
  <li>MySQL ou Docker</li>
  <li>Git</li>
</ul>

<h3>Clonar o repositório</h3>

<pre>
$ git clone https://github.com/Tributino03/crud-jdbc.git
</pre>

<h3>Subir o banco de dados</h3>

<p>Você pode escolher entre criar o banco manualmente ou rodar via <strong>Docker Compose</strong>:</p>

<h4>Opção A - Criar manualmente no MySQL</h4>

<pre>
CREATE DATABASE produtores_db;
</pre>

<h4>Opção B - Subir com Docker</h4>

<p>Na raiz do projeto, execute:</p>

<pre>
$ docker-compose up -d
</pre>

<p>O serviço criará automaticamente um banco <code>anime_store</code> na porta <code>3306</code>.</p>

<h3>Configurar a conexão com o banco</h3>

<p>Atualize as credenciais no arquivo <code>src/main/resources/db.properties</code> conforme sua escolha:</p>

<pre>
# Exemplo usando banco criado manualmente
db.url=jdbc:mysql://localhost:3306/produtores_db
db.user=root
db.password=sua-senha

# Exemplo usando Docker (anime_store)
db.url=jdbc:mysql://localhost:3306/anime_store
db.user=root
db.password=root
</pre>

<h3>Executar o projeto</h3>

<pre>
$ mvn compile
$ mvn exec:java -Dexec.mainClass="br.com.tributino.Main"
</pre>

<p>O sistema será executado e pronto para realizar operações CRUD diretamente no banco de dados.</p>

<hr/>

<h2>Rodando os Testes</h2>

<p>Para executar os testes unitários com <strong>JUnit</strong>:</p>

<pre>
$ mvn test
</pre>

<hr/>

<h2>Estrutura do Projeto</h2>

<pre>
crud-jdbc/
├── docker-compose.yml          # Configuração do banco MySQL em container
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/tributino/
│   │   │       ├── dao/          # Classes DAO (acesso ao banco)
│   │   │       ├── model/        # Entidades do sistema
│   │   │       └── Main.java     # Classe principal
│   │   └── resources/
│   │       └── db.properties     # Configurações de conexão com o banco
│   └── test/
│       └── java/
│           └── br/com/tributino/ # Testes unitários com JUnit
└── pom.xml
</pre>

<hr/>

<h2>Operações Disponíveis</h2>

<p>O sistema permite executar as seguintes operações:</p>

<ul>
  <li><strong>Create:</strong> Inserção de novos produtores no banco.</li>
  <li><strong>Read:</strong> Consulta de produtores cadastrados.</li>
  <li><strong>Update:</strong> Atualização de informações de produtores existentes.</li>
  <li><strong>Delete:</strong> Exclusão de produtores do sistema.</li>
</ul>

<hr/>

<h2>Padrão de Projeto DAO</h2>

<p>
A arquitetura do projeto segue o padrão <strong>DAO (Data Access Object)</strong>, que tem como objetivo isolar as regras de persistência do restante da aplicação. 
Dessa forma, a lógica de negócio permanece desacoplada da camada de acesso a dados, tornando o código mais limpo, modular e fácil de manter.
</p>

<hr/>

<h2>Conclusão</h2>

<p>
Este projeto é um exemplo prático de como construir um CRUD em Java utilizando JDBC puro e boas práticas de arquitetura. 
Ele pode servir como base para aplicações maiores, facilitando a compreensão do funcionamento interno da camada de persistência sem o uso de frameworks ORM.
</p>
