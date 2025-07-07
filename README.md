# 🏡 API de Cadastro de Usuários

## 📌 Descrição
Esta API REST permite gerenciar usuários, oferecendo operações de **CRUD (Create, Read, Update, Delete)** de forma eficiente. Desenvolvida com **Java 17** e **Spring Boot 3**, possui suporte a documentação via **Swagger/OpenAPI** e está pronta para **deploy na Railway**.

## 🛠️ Tecnologias Utilizadas
- 🖥️ **Java 17**
- 🚀 **Spring Boot 3**
- 🗄️ **Spring Data JPA**
- 📂 **Banco de Dados H2**
- 📜 **Swagger/OpenAPI**
- 🌍 **Railway (Deploy na Nuvem)**

## 🎯 Funcionalidades
✅ **Cadastro de usuários**  
✅ **Listagem de usuários**  
✅ **Busca de usuários por ID**  
✅ **Atualização de informações**  
✅ **Exclusão de usuários**  
✅ **Documentação automática com Swagger**

## 🚀 Como Executar o Projeto
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seuusuario/api-usuarios.git
   cd api-usuarios
   ```
   
2. Compile e execute o projeto via Maven:

    ```bash
    mvn spring-boot:run
    ```

3. Acesse o banco de dados H2 via navegador:

- URL: http://localhost:8080/h2-console

- Driver: org.h2.Driver

- JDBC URL: jdbc:h2:mem:usuarios_db

- Usuário: sa

- Senha: (deixe em branco)

## 🚀 Gerenciamento de Usuários

| Método   | Endpoint                                         | Descrição                   |
|----------|-------------------------------------------------|-----------------------------|
| **POST** | `/users?nome=John&email=john@email.com`         | Cria um novo usuário.       |
| **GET**  | `/users`                                        | Lista todos os usuários.    |
| **GET**  | `/users/{id}`                                   | Busca um usuário pelo ID.   |
| **PUT**  | `/users/{id}?nome=John&email=john@email.com`    | Atualiza um usuário.        |
| **DELETE** | `/users/{id}`                                 | Deleta um usuário.         |

## 📜 Documentação Swagger
Após iniciar a API, acesse o Swagger UI para testar os endpoints: 🔗 URL: http://localhost:8080/swagger-ui.html

## 🌍 Deploy na Railway
Para realizar o deploy, siga os passos:

- Crie um repositório no GitHub e envie o código.

- Crie um novo projeto na Railway e conecte ao repositório.

- Configure variáveis de ambiente se necessário.

- Realize o deploy! 🚀

## 🏆 Autor
Desenvolvido por **Geovanni Marques** 🚀
