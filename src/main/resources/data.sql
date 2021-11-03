DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  department VARCHAR(100) NOT NULL,
  position VARCHAR(100) NOT NULL,
  salary FLOAT NOT NULL
);

INSERT INTO employees (id, name, department, position, salary) VALUES
  (1,'Aliko', 'Ciment', 'CEO', 20000),
  (2,'Bill', 'Computer', 'CTO', 15000),
  (3,'Folrunsho', 'Hidroplant', 'CEO', 20000);