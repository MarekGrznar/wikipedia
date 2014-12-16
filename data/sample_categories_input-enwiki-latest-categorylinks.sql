-- MySQL dump 10.13  Distrib 5.5.35, for debian-linux-gnu (x86_64)
--
-- Host: 10.64.32.21    Database: enwiki
-- ------------------------------------------------------
-- Server version	5.5.34-MariaDB-1~precise-log

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
-- Table structure for table `categorylinks`
--

DROP TABLE IF EXISTS `categorylinks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorylinks` (
  `cl_from` int(8) unsigned NOT NULL DEFAULT '0',
  `cl_to` varbinary(255) NOT NULL DEFAULT '',
  `cl_sortkey` varbinary(230) NOT NULL DEFAULT '',
  `cl_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cl_sortkey_prefix` varbinary(255) NOT NULL DEFAULT '',
  `cl_collation` varbinary(32) NOT NULL DEFAULT '',
  `cl_type` enum('page','subcat','file') NOT NULL DEFAULT 'page',
  UNIQUE KEY `cl_from` (`cl_from`,`cl_to`),
  KEY `cl_timestamp` (`cl_to`,`cl_timestamp`),
  KEY `cl_collation` (`cl_collation`),
  KEY `cl_sortkey` (`cl_to`,`cl_type`,`cl_sortkey`,`cl_from`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorylinks`
--

/*!40000 ALTER TABLE `categorylinks` DISABLE KEYS */;

INSERT INTO `categorylinks` VALUES (41258082,'1991_births','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'All_stub_articles','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2014-06-25 07:41:39','Mirgova, Dominika','uppercase','page'),(41258082,'Articles_with_hCards','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'European_singer_stubs','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'Living_people','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'People_from_Trnava','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'Slovak_Eurovision_Song_Contest_entrants','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'Slovak_musicians','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page'),(41258082,'Slovak_people_stubs','MIRGOVA, DOMINIKA\nDOMINIKA MIRGOVÁ','2013-12-04 22:53:52','Mirgova, Dominika','uppercase','page');