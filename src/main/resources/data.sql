DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  department VARCHAR(100) NOT NULL,
  position VARCHAR(100) NOT NULL,
  salary FLOAT NOT NULL,
  hiring DATETIME
);

INSERT INTO employees (id, name, department, position, salary, hiring) VALUES
  (1,'Aliko', 'Ciment', 'CEO', 20000, NOW()),
  (2,'Bill', 'Computer', 'CTO', 15000, NOW()),
  (3,'Folrunsho', 'Hidroplant', 'CEO', 20000, NOW());