-- Password: @bcd12

-- ATHLETE
--INSERT INTO USERS(id,name,email,password) VALUES('9581ca9c-8879-11ec-a8a3-0242ac120002','João', 'joao@sports.com', '$2a$10$QqhDL.bK.2ceBipGJAftIegT/lxstODr0hXur14rPGiti9RTTrixG');
--INSERT INTO PROFILES(id, name) VALUES('0a40e096-887c-11ec-a8a3-0242ac120002', 'ROLE_ATHLETE');
--INSERT INTO USERS_PROFILES(user_id, profiles_id) VALUES('9581ca9c-8879-11ec-a8a3-0242ac120002', '0a40e096-887c-11ec-a8a3-0242ac120002');

-- MODERATOR
--INSERT INTO USERS(id,name,email,password) VALUES('d2419e30-7fe1-11ec-a8a3-0242ac120002','Jeison', 'jeison@sports.com', '$2a$10$QqhDL.bK.2ceBipGJAftIegT/lxstODr0hXur14rPGiti9RTTrixG');
--INSERT INTO PROFILES(id, name) VALUES('96789806-8877-11ec-a8a3-0242ac120002', 'ROLE_MODERATOR');
--INSERT INTO USERS_PROFILES(user_id, profiles_id) VALUES('d2419e30-7fe1-11ec-a8a3-0242ac120002', '96789806-8877-11ec-a8a3-0242ac120002');

INSERT INTO EVENTS (id, title, description,event_type) VALUES('77376a66-8300-11ec-a8a3-0242ac120002', 'CHALLENGE MTB FROM GRAMADO','BORA PEDALAR EM GRAMADO TÁ MASSA', 'BIKE_MTB');
--INSERT INTO CATEGORIES VALUES('c02e430c-8300-11ec-a8a3-0242ac120002', 'TEST SUBSCRIPTION', 'CATEGORY TITLE','77376a66-8300-11ec-a8a3-0242ac120002');