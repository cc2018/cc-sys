/*
MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : cc

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2018-03-10 13:13:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Create database;
-- ----------------------------

DROP DATABASE IF EXISTS cc_sku;
create database cc_sku;
use cc_sku;
grant all privileges on cc_sku.* to cc_sku@localhost identified by 'sku123456';

-- ----------------------------
-- Table structure for sku_product
-- 类别：OTC药品|处方药品|非药品
-- 剂型: 液体剂|注射剂|输液剂|眼用剂|散剂|浸出剂|片剂|胶囊剂|丸剂|软膏剂|硬膏剂
-- 单位：袋|颗|瓶|片
-- ----------------------------
DROP TABLE IF EXISTS `sku_product`;
CREATE TABLE `sku_product` (
  `product_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '数据库编号',
  `barcode` varchar(15) NOT NULL unique COMMENT '单品编码',
  `name` varchar(100) NOT NULL COMMENT '品名',
  `en_name` varchar(100) NOT NULL COMMENT '英文名',
  `type` varchar(100) NOT NULL COMMENT '类别',
  `dosage_form` varchar(20) DEFAULT NULL COMMENT '剂型',
  `specifications` varchar(200) DEFAULT NULL COMMENT '规格',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `manufacturer` varchar(100) DEFAULT NULL COMMENT '生产企业',
  `address` varchar(100) DEFAULT NULL COMMENT '生产地址',
  `approval_number` varchar(100) DEFAULT NULL COMMENT '批准文号',
  `approval_date` varchar(100) DEFAULT NULL COMMENT '批准日期',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='单品';

-- ----------------------------
-- Table structure for sku_store
-- ----------------------------
DROP TABLE IF EXISTS `sku_store`;
CREATE TABLE `sku_store` (
  `store_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '门店编号',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `date` varchar(100) NOT NULL COMMENT '创建日期',
  `phone` varchar(100) NOT NULL COMMENT '联系电话',
  `manager_id` varchar(100) NOT NULL COMMENT '店长id',
  `manager` varchar(100) NOT NULL COMMENT '店长',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='门店信息';

-- ----------------------------
-- Table structure for sku_supplier
-- ----------------------------
DROP TABLE IF EXISTS `sku_supplier`;
CREATE TABLE `sku_supplier` (
  `supplier_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '供货商编号',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `phone` varchar(100) NOT NULL COMMENT '联系电话',
  `contacts` varchar(100) NOT NULL COMMENT '联系人',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='供货商信息';