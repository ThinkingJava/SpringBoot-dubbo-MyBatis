
#### a. 基本环境配置
在 MySQL 中，创建数据库 springbootdb：
````
CREATE DATABASE springbootdb;
````
创建表 city 城市 
````
DROP TABLE IF EXISTS  `city`;
CREATE TABLE `city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned  NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
````
插入基础数据
````
INSERT city VALUES (1 ,1,'佛山市','我住在佛山。');
````