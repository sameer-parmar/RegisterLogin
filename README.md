RegisterLogin Application
RegisterLogin is a Spring Boot application that provides a simple registration and login system.

Running the Application
Prerequisites
Java 11 or later installed on your system
JAVA_HOME environment variable set correctly
Steps to Run the Application
Download the JAR file: Download the RegisterLogin-0.0.1-SNAPSHOT.jar file from the target directory.
Navigate to the JAR file location: Open a command prompt or terminal and navigate to the directory where you downloaded the JAR file. For example:


cd C:\Users\samee\Downloads\RegisterLogin\target


Run the JAR file: Execute the following command to start the application:

java -jar RegisterLogin-0.0.1-SNAPSHOT.jar


Alternatively, you can specify the full path to the JAR file:


java -jar C:\Users\samee\Downloads\RegisterLogin\target\RegisterLogin-0.0.1-SNAPSHOT.jar
Verify the application is running: Once the application starts, check the console output or access the application's endpoints using tools like Postman or cURL.
Consuming the API
To interact with the API endpoints, you can use the following cURL commands:

Register a new user

curl --location 'http://localhost:8085/api/user/register' \
--header 'Content-Type: application/json' \
--data-raw '{
    "employeename": "sameer",
    "email": "sameer@gmail.com",
    "password": "12121"
}'

for login:-
curl --location 'http://localhost:8085/api/user/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    
    "email": "sameer@gmail.com",
    "password": "12121"
}'
for to fetch the user you can use :-
curl --location --request GET 'http://localhost:8085/api/user/fetch/sameer' \
--header 'Content-Type: application/json' \
--data-raw '{
    
    "email": "sameer@gmail.com",
    "password": "12121"
}'

Repository URL
You can find the source code for this application at: [https://github.com/sameer-parmar/RegisterLogin]
