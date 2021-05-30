
The config file points to the local dev DB by default. 
## Local Development DB
This project uses a Docker container to host the local Postgres database. To start it up, open a command terminal and run: 
```
docker-compose up
```
You will need to install Docker and Docker Compose if you don't have them already. 
If you already have Postgres installed and running on your computer, you may need to stop it's service before spinning up the dockerized database so that the ports don't conflict
```
sudo service postgresql stop
#also
docker stop $(docker ps --quiet)
```
Once the database is up and running, you can generate the schema and populate it with test data using the db migrations. 


