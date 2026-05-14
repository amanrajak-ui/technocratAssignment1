# 🚀 Employee Management REST API

<div align="center">

<img src="https://img.shields.io/badge/SpringBoot-3.x-brightgreen?style=for-the-badge&logo=springboot"/>
<img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk"/>
<img src="https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql"/>
<img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven"/>
<img src="https://img.shields.io/badge/Postman-API_Testing-orange?style=for-the-badge&logo=postman"/>

<br>

# 📌 Employee Management System

A REST API project built using Spring Boot & PostgreSQL.

</div>

---

# ✨ Features

✅ Add Employee  
✅ Get Employee Details  
✅ Update Employee  
✅ Delete Employee  
✅ REST API Architecture  
✅ PostgreSQL Integration  
✅ Unit Testing  
✅ Integration Testing  

---

# 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Postman
- JUnit & Mockito

---

# ⚙️ API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/employees` | Add Employee |
| GET | `/employees` | Get All Employees |
| GET | `/employees/{id}` | Get Employee By ID |
| PUT | `/employees/{id}` | Update Employee |
| DELETE | `/employees/{id}` | Delete Employee |

---

# 📮 Sample JSON

```json
{
  "name": "Aman Rajak",
  "email": "aman@gmail.com",
  "department": "IT",
  "salary": 50000
}
```

---

# 🗄️ PostgreSQL Configuration

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Run Project

## Clone Repository

```bash
git clone https://github.com/amanrajak-ui/Assignment.git
```

## Run Application

```bash
AssignmentApplication.java
```

Server runs on:

```bash
http://localhost:8080
```

---

# 📸 Screenshots

## 🗄️ Database

```md
![Database](images/database.png)
```

## ➕ POST API

```md
![POST API](images/post-api.png)
```

## 📋 GET API

```md
![GET API](images/get-api.png)
```

## ✏️ PUT API

```md
![PUT API](images/put-api.png)
```

## ❌ DELETE API

```md
![DELETE API](images/delete-api.png)
```

---

# 🧪 Testing

### Unit Testing
- JUnit 5
- Mockito

### Integration Testing

```java
@SpringBootTest
```

---

# 👨‍💻 Author

## Aman Kumar Rajak

🔗 GitHub: https://github.com/amanrajak-ui  
🔗 LinkedIn: www.linkedin.com/in/aman-kumar-rajak-69051326a

---

<div align="center">

⭐ Star this repository if you like it ⭐

</div>
