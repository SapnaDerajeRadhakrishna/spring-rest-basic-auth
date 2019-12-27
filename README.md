Start Mongo Container
docker run -it --name my-mongo -p 27017:27017 -d mongo:latest

to log into the mongo
docker exec -it my-mongo bash

mongo logs
docker logs some-mongo


db.createUser(
...   {
...     user: "NOTiFY",
...     pwd: "MyPassword",
...     roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
...   }
... )


