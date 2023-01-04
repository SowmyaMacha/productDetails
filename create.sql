CREATE TABLE order_details (
  id_order_details INT NOT NULL,
   order_details_order_date date NULL,
   order_details_tracking_id VARCHAR(15) NULL,
   order_details_total_cost DECIMAL(10, 2) NULL,
   order_details_currency LONGTEXT NULL,
   CONSTRAINT pk_order_details PRIMARY KEY (id_order_details)
);
create table product_details (id_product_details integer not null, product_details_category tinytext, product_details_cost decimal(10,2), product_details_currency tinytext, product_details_description varchar(45), product_details_image tinytext, product_details_name varchar(45) not null, product_details_reviews varchar(45), primary key (id_product_details)) engine=InnoDB;
