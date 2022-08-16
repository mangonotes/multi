# Build and run multi module.
### Build  controller and service module.
```
mvnw clean install
```
### Run the controller applications 
```
mvnw clean  spring-boot:run -pl=controller
```
###### test applications 
```
htto://localhost:8080
```
### Run the controller applications with prod profile
```
mvnw clean -Dspring-boot.run.profiles=prod spring-boot:run -pl=controller
```