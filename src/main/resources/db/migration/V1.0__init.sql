CREATE TABLE user (
  id int
  name VARCHAR(255),
  password VARCHAR(255),
  PRIMARY KEY(id)
);

INSERT INTO user (id, name, password) VALUES (42, 'herbert', "unicorn");
INSERT INTO user (id, name, password) VALUES (666, 'hubert', 'hacker');