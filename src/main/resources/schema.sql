CREATE TABLE IF NOT EXISTS EMPLOYEE (
     id SERIAL PRIMARY KEY,
     name varchar(100) not null,
     email varchar(100) not null,
     salary NUMERIC
);
