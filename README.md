# Scolarité-mono
Dans ce projet nous assurons la gestion scolaire grâce spring mvc et au moteur de template thymeleaf 
Vous aurez besoin des dépendances de maven en cliquant suivant
``````
https://mvnrepository.com
`````` 
# Usage
### Configuration du fichier application.properties dans le  repertoire resources
Vous pouvez copier le code suivant pour la configuration d'une base de donnée mysql
````````
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/scolarite-mono
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database=mysql
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
````````
Vous pouvez copier le code suivant pour la configuration d'une base de donnée postgres
````````
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/scolarite-mono
spring.datasource.username=postgres
spring.datasource.password= "keurmassar"
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database=postgresql
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
````````

Vous pouvez copier le code suivant pour la configuration d'une base de donnée h2 qui integré à spring mvc

````````
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database=h2
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
````````

Pour lancer le projet 
``````
http://localhost:8080/index
``````
