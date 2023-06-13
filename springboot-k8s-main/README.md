# springboot-crud-k8s


JAVA spring boot app integration with #MySQL on #KUBERNETES with the help of #AWS , basically this app is about ORDER MANAGEMENT SYSTEM   which takes the orders from the customers and stores in the database which has two way communication.



Firstly, the code is converted into a .jar file using #MAVEN  to run the Java application we needed a configuration file which is POM.XML this file contains all the dependencies and plugins related to the app.



Secondly, we convert the JAR file to CONTAINER for this we need a #DOCKER FILE this file will help us convert JAR to IMAGE 



Thirdly, we convert the #DOCKER IMAGE TO #KUBERNETES POD , basically we will have 2 pods one for our application and other for our database, for this we need a Manifest file which will contain all the data to bind everything together.



Lastly, we will use #POSTMAN ,  here we use the POST method to add order and use the GET method to get order details which are all stored in our #MYSQL database. 



a. Login to AWS console , create an EC2 instance,  connect to terminal

b. Install docker , install conntract and git 

c. Install kubernetes, kubectl

d. Clone the repository from GitHub

e. create database and  make the database up

f. Install maven to convert code to jar

g. Create docker image, pust the image to docker hub

h. Create pods , put port forwarding in order for the traffic to reach 

i. Use postman to POST an order and check database to see the order details

j. To check the  dashboard of kubernetes use the minikube command and get the url 
