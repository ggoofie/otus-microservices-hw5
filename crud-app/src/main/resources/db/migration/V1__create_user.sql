create table users
(
    id         bigserial not null primary key,
    username   varchar(50),
    first_name varchar(50),
    last_name  varchar(50),
    email      varchar(50),
    phone      varchar(50)
);