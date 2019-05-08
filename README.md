Spring Boot Book´s Repository With REST
==============

Spring Boot application that implements a book's repository using 
CRUD (Create, Read, Update, Delete) operations to create and recover
objects (books) stored in a MongoDB data base using Spring Data MongoDB.
The CRUD operations are made via RESTful.

Modules:
========
- Spring Boot
- Spring Boot - HATEOAS for RESTful Services
- Spring Boot Web 
- Spring Data MongoDB
- MongoDB https://www.mongodb.com

Build the jar:
-------------------------
./gradlew build

Run the jar:
-------------------------
java -jar build/libs/mongodb-with-rest-0.0.1-SNAPSHOT.jar

Test the application:
-------------------------
1. Download and install MongoDB data base
2. Connect to the server via http://localhost:8080/books using
for example a Restful API tester, like Postman, to check the 
CRUD operations and check the sended logs to the other server
http://localhost:8090

Note: the json input for PUT or POST should be like:

{
	"author" : "book´s author",
	"title" : "book´s title"
}

