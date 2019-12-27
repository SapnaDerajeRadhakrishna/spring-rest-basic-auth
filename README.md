To run against Mongo docker container

###Start Mongo Container
docker run -it --name my-mongo -p 27017:27017 -d mongo:latest

###to log into the mongo
docker exec -it my-mongo bash

###mongo logs
docker logs some-mongo

###create user
db.createUser(
...   {
...     user: "NOTiFY",
...     pwd: "MyPassword",
...     roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
...   }
... )




##Curl commands
1. get all student 
	curl -H "Authorization: Basic YWRtaW46cGFzc3dvcmQ=" http://localhost:8090/api/v1/students
2. add new student 
	curl -H "Authorization: Basic YWRtaW46cGFzc3dvcmQ=" -d '{"id":"3", "name":"Molly", "grade":"kindergarten", "age":5}' -H "Content-Type: application/json" http://localhost:8090/api/v1/students
3. get student by id	 
	curl -H "Authorization: Basic YWRtaW46cGFzc3dvcmQ=" http://localhost:8090/api/v1/students/1
4. update a student 
	curl -H "Authorization: Basic YWRtaW46cGFzc3dvcmQ=" -PUT -d '{"id":"3", "name":"Molly", "grade":"kindergarten", "age":6}' -H "Content-Type: application/json" http://localhost:8090/api/v1/students
5. delete a student
	curl -H "Authorization: Basic YWRtaW46cGFzc3dvcmQ=" -X DELETE http://localhost:8090/api/v1/students?studentId=3


