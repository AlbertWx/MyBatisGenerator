DROP TABLE orders;
CREATE TABLE orders (id int NOT NULL AUTO_INCREMENT, user_id int NOT NULL COMMENT '下单用户id', number varchar(32) NOT NULL COMMENT '订单号', createtime datetime NOT NULL COMMENT '创建订单时间', note varchar(100) COMMENT '备注', PRIMARY KEY (id)) ENGINE=InnoDB DEFAULT CHARSET=utf8;
DROP TABLE user;
CREATE TABLE user (id int NOT NULL AUTO_INCREMENT, username varchar(32) NOT NULL COMMENT '用户名称', birthday date COMMENT '生日', sex varchar(32) COMMENT '性别', address varchar(256) COMMENT '地址', PRIMARY KEY (id)) ENGINE=InnoDB DEFAULT CHARSET=utf8;
