SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS MST_WINDOW;
DROP TABLE IF EXISTS TRN_RECEPTION;


/* Create Tables */

CREATE TABLE MST_WINDOW
(
	WINDOW_ID varchar(20),
	WINDO_NM varchar(256),
	VERSION_NO int,
	INSERT_DATE timestamp,
	UPDATE_DATE timestamp,
	INSERT_USER_ID varchar(20),
	UPDATE_USER_ID varchar(20),
	PRIMARY KEY (WINDOW_ID)
);


CREATE TABLE TRN_RECEPTION
(
	TRN_RECEPTION_ID int NOT NULL,
	DISPAY_ID int,
	WINDOW_ID varchar(20),
	PREVIOUS_WINDOW_ID varchar(20),
	STATUS_CD varchar(4),
	IS_ACTIVE char(1),
	VERSION_NO int,
	INSERT_DATE timestamp,
	UPDATE_DATE timestamp,
	INSERT_USER_ID varchar(20),
	UPDATE_USER_ID varchar(20),
	PRIMARY KEY (TRN_RECEPTION_ID)
);


