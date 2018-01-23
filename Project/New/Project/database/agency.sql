-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: agency
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL,
  `year` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'Dodge-Charger','gray','2016','9','397200','new'),(2,'Honda-Accord','blue','2016','9','89825','new'),(3,'lexus.lx','white','2013','8','814207','new'),(4,'Mitsubishi','white','2014','7','26206','new'),(5,'mitsu-lancer','red','2014','5','33258','new'),(6,'nissan-maxima','white','2015','7','35570','new'),(7,'subaru-xv','gray','2016','6','110856','new'),(8,'subaru-v','black','2014','9','36367','new'),(9,'suzuki-kizashi','silver','2015','9','44825','new'),(10,'Toyota_Land','black','2015','5','1084080','new'),(11,'ferrari','red','2013','10','90000','used'),(12,'subaru-xv','blue','2010','1','70000','used'),(13,'bmw','blue','2016','5','250000','new');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `name` varchar(45) NOT NULL,
  `ssn` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`ssn`),
  UNIQUE KEY `ssn_UNIQUE` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('someone','1234','23454987','somewhere');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_transaction`
--

DROP TABLE IF EXISTS `customer_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_transaction` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  `customer_ssn` varchar(45) NOT NULL,
  `car_id` int(11) NOT NULL,
  `replaced_car_id` int(11) DEFAULT NULL,
  `money` varchar(45) NOT NULL,
  PRIMARY KEY (`num`,`customer_ssn`,`car_id`),
  UNIQUE KEY `num_UNIQUE` (`num`),
  KEY `fk_transaction_customer_idx` (`customer_ssn`),
  KEY `fk_transaction_car1_idx` (`car_id`),
  KEY `fk_transaction_car2_idx` (`replaced_car_id`),
  CONSTRAINT `fk_transaction_car1` FOREIGN KEY (`car_id`) REFERENCES `car` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_transaction_car2` FOREIGN KEY (`replaced_car_id`) REFERENCES `car` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_transaction_customer` FOREIGN KEY (`customer_ssn`) REFERENCES `customer` (`ssn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_transaction`
--

LOCK TABLES `customer_transaction` WRITE;
/*!40000 ALTER TABLE `customer_transaction` DISABLE KEYS */;
INSERT INTO `customer_transaction` VALUES (9,'buy','1234',4,NULL,'33258'),(10,'buy','1234',4,NULL,'33258'),(11,'sell','1234',11,7,'20856.0'),(12,'sell','1234',11,NULL,'90000');
/*!40000 ALTER TABLE `customer_transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager` (
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES ('m1','1111');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager_transaction`
--

DROP TABLE IF EXISTS `manager_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager_transaction` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  `manager_password` varchar(45) NOT NULL,
  `car_id` int(11) NOT NULL,
  PRIMARY KEY (`num`,`manager_password`,`car_id`),
  UNIQUE KEY `num_UNIQUE` (`num`),
  KEY `fk_manager_manager1_idx` (`manager_password`),
  KEY `fk_manager_car1_idx` (`car_id`),
  CONSTRAINT `fk_manager_car1` FOREIGN KEY (`car_id`) REFERENCES `car` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_manager_manager1` FOREIGN KEY (`manager_password`) REFERENCES `manager` (`password`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager_transaction`
--

LOCK TABLES `manager_transaction` WRITE;
/*!40000 ALTER TABLE `manager_transaction` DISABLE KEYS */;
INSERT INTO `manager_transaction` VALUES (1,'update','1111',4),(2,'update','1111',4),(3,'update','1111',4),(4,'add','1111',13),(5,'delete','1111',8),(6,'update','1111',8),(7,'update','1111',2);
/*!40000 ALTER TABLE `manager_transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-01-24 11:34:29
