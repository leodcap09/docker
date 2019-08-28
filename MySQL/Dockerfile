    FROM ubuntu:16.04

    ENV MYSQL_DATABASE test
    ENV MYSQL_ROOT_PASSWORD hellokoding
 
    RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y mysql-server \
     && sed -i "s/127.0.0.1/0.0.0.0/g" /etc/mysql/mysql.conf.d/mysqld.cnf \
     && mkdir /var/run/mysqld \
     && chown -R mysql:mysql /var/run/mysqld
     
    
     
    EXPOSE 3306
     
    CMD ["mysqld_safe"]
