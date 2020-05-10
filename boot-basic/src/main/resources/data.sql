DROP TABLE IF EXISTS COMPANY;
 CREATE TABLE COMPANY (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  COMP_NAME VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS EMPLOYEE;
 CREATE TABLE EMPLOYEE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  EMPNAME VARCHAR(250) NOT NULL,
  SALARY VARCHAR(250) NOT NULL,
  DESG VARCHAR(250) NOT NULL,
  JOINING_DATE date,
  ORG_ID INT NOT NULL
);
 

INSERT INTO COMPANY(COMP_NAME) VALUES('INTEL CORP');

INSERT INTO EMPLOYEE(EMPNAME,SALARY,DESG,ORG_ID,JOINING_DATE) VALUES('vishal','1300','engineer','1',NULL);