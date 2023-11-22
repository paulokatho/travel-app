# travel-app-monolito

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

### MySQL

This application requires MySQL (standalone or in a Docker container).

It's recommended to setup MySQL as a Docker container for local development purposes. You can do this with the following command:

```
docker run --name app-travel-monolito-mysql -p 3306:3306 -e MYSQL_DATABASE=`travel-app-mono` -e MYSQL_USER=travel-app-mono -e MYSQL_PASSWORD=travel-app-mono -e MYSQL_ROOT_PASSWORD=admin -d mysql:latest
```
> **_NOTE:_** If you specified a different username and/or password, remember to update in ```application.properties```.

### PostgreSQL
This application requires PostgreSQL (standalone or in a Docker container).

It's recommended to setup PostgreSQL as a Docker container for local development purposes. You can do this with the following command:

```
sudo docker run --name app-travel-postgres -p 5432:5432 -e POSTGRES_DB=`travel-app-postgres` -e POSTGRES_USER=travel-app-postgres -e POSTGRES_PASSWORD=travel-app-postgres -e MYSQL_ROOT_PASSWORD=admin -d postgres:latesT
```
> **_NOTE:_** If you specified a different username and/or password, remember to update in ```application.properties```.


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/travel-app-monolito-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- JDBC Driver - H2 ([guide](https://quarkus.io/guides/datasource)): Connect to the H2 database via JDBC
- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern
- JDBC Driver - MySQL ([guide](https://quarkus.io/guides/datasource)): Connect to the MySQL database via JDBC

## Provided Code

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)

[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
=======
# travel-app
Aplicativo de viagens para implementar quarkus, monolito, docker e kubernetes

