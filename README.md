# Scolarité-mono
Dans ce projet nous assurons la gestion scolaire grâce spring mvc et au moteur de template thymeleaf 
Vous aurez besoin des dépendances de maven en cliquant [ici(https://mvnrepository.com/)] 
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
Pour lancer le projet 
``````
http://localhost:8080/index
``````
