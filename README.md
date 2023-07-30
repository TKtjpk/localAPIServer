# localAPI server Part 2: Data API

Welcome to Part 2 of MyApp, the Data API component. This part is a Java application built using the Spring framework, and it serves as an API for the collected data stored in the MySQL database. The Data API provides endpoints to access and manipulate the data collected by the Data Collector component (Part 1). This component is containerized using Docker for easy deployment and scalability.

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Prerequisites](#prerequisites)
4. [Installation](#installation)
5. [Configuration](#configuration)
6. [Dockerization](#dockerization)
7. [API Endpoints](#api-endpoints)
8. [Contributing](#contributing)
9. [License](#license)

## Introduction

Part 2 of MyApp, the Data API, is a Java application developed with the Spring framework. It provides a RESTful API that allows users to access and manage the data collected by the Data Collector (Part 1). By using this API, users can perform various operations on the data, such as retrieving specific records, filtering data, and more.

## Features

- RESTful API endpoints to interact with the collected data.
- Utilizes Spring framework for efficient and scalable development.
- Secure and configurable data access.
- Containerized with Docker for easy deployment.

## Prerequisites

Before setting up and running the Data API, ensure you have the following prerequisites installed:

- Java Development Kit (JDK) 8 or later
- Maven
- Docker

## Installation

1. Clone this repository to your local machine:

```
git clone https://github.com/your_username/myapp-data-api.git
cd myapp-data-api
```

2. Build the project using Maven:

```
mvn clean package
```

This command will compile the Java code, run tests, and package the application into a JAR file.

## Configuration

Before running the Data API, make sure to configure the database connection settings in the `application.properties` file. Provide the appropriate details such as database URL, username, and password to connect to the MySQL database containing the collected data.

## Dockerization

To containerize the Data API component with Docker, follow these steps:

1. Build the Docker image:

```
docker build -t myapp-data-api .
```

2. Run the container:

```
docker run --name data-api-container --network myapp-network -p 8080:8080 -d myapp-data-api
```

Replace `myapp-network` with the name of your Docker local network, which should also connect to the MySQL container.

## API Endpoints

The Data API exposes the following endpoints to interact with the collected data:

- `GET /demo/all`: Retrieve all collected data.
- `GET /demo/temp/lessThan?temp=50`: Retrieve data by certain condition.
- `GET /demo/temp/greaterThan?temp=50`: Retrieve data by certain condition.
- `GET /demo/temp/between?temp1=50&temp2=60`: Retrieve data by certain condition.
- `GET /demo/date/before?date=2023-07-23+12:00:00`: Retrieve data by certain condition.
- `GET /demo/date/after?date=2023-07-23+12:00:00`: Retrieve data by certain condition.
- `GET /demo/date/between?temp1=2023-07-23+12:00:00&temp2=2023-07-23+13:00:00`: Retrieve data by certain condition.

## Contributing

We appreciate contributions to enhance the Data API or fix any issues. Please feel free to create a pull request with your changes.

## License

MyApp is released under the [MIT License](LICENSE). You are free to modify and distribute this codebase according to the terms specified in the license.

For the documentation of other parts of the MyApp, please refer to their respective README files.
