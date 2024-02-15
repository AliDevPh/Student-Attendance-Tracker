-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2023 at 08:44 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trackeradmin`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `Name` varchar(50) NOT NULL,
  `Admin Code` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`Name`, `Admin Code`) VALUES
('Dean', '21-05310');

-- --------------------------------------------------------

--
-- Table structure for table `mercado_anacieto_oop`
--

CREATE TABLE `mercado_anacieto_oop` (
  `Name` varchar(50) NOT NULL,
  `SR Code` varchar(10) NOT NULL,
  `Date` varchar(10) NOT NULL,
  `Time` varchar(50) NOT NULL,
  `Attendance` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mercado_anacieto_oop`
--

INSERT INTO `mercado_anacieto_oop` (`Name`, `SR Code`, `Date`, `Time`, `Attendance`) VALUES
('asfas', 'asdfa', '05-13-2023', '08:13:40 PM', 'PRESENT'),
('asdfa', 'sfs', '05-13-2023', '08:15:47 PM', 'PRESENT');

-- --------------------------------------------------------

--
-- Table structure for table `mercado_anacieto_oop_display`
--

CREATE TABLE `mercado_anacieto_oop_display` (
  `Name` varchar(50) NOT NULL,
  `SR Code` varchar(11) NOT NULL,
  `ATTENDANCE` varchar(7) NOT NULL,
  `TIME` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mercado_anacieto_oop_display`
--

INSERT INTO `mercado_anacieto_oop_display` (`Name`, `SR Code`, `ATTENDANCE`, `TIME`) VALUES
('Abellera, Charles G.', '21-09813', 'ABSENT', '-'),
('Adajar, Maria Angeline F.', '21-04885', 'ABSENT', '-'),
('Alcazar, Mark Eñigo R.', '21-08107', 'ABSENT', '-'),
('Arcenas, Derek William D.', '21-08649', 'PRESENT', ''),
('Arellano, Peter John Nelson D.', '21-00752', 'ABSENT', '-'),
('Bondad, Joshua Matthew A.', '20-35191', 'ABSENT', '-'),
('Briones, Venus Angel C.', '21-00588', 'ABSENT', '-'),
('Caringal, Ivan P.', '21-04078', 'PRESENT', ''),
('Castro, Jhon Ernesto M.', '21-05012', 'PRESENT', ''),
('Cicat, Jesieca C.', '21-01613', 'ABSENT', '-'),
('Cimanes, Ralph AJ M.', '21-06994', 'ABSENT', '-'),
('De Castro, Diana Elizabeth A.', '21-08788', 'ABSENT', '-'),
('De Villa, Glecy Rose M.', '21-02870', 'ABSENT', '-'),
('Diaz, Daniel E.', '21-04655', 'ABSENT', '-'),
('Dimatatac, Kyell P.', '21-01302', 'ABSENT', '-'),
('Emilio, Alysa Juliana M.', '21-09249', 'PRESENT', ''),
('Enriquez, John Michael D.', '21-01420', 'ABSENT', '-'),
('Esguerra, John Wayne Vincent P.', '21-04762', 'ABSENT', '-'),
('Flores, Marc Revzen B.', '21-09478', 'ABSENT', '-'),
('Formento, Joshua Ashley D.', '20-04644', 'PRESENT', ''),
('Goco, Isaac Garrick P.', '21-07393', 'ABSENT', '-'),
('Gruta, Dean Carmelo A.', '21-05310', 'ABSENT', '-'),
('Huelgas, Reuben John H.', '21-00526', 'ABSENT', '-'),
('Lopez, Jamaica Kaye H.', '21-05839', 'ABSENT', '-'),
('Magbanua, James Patrick N.', '21-04601', 'ABSENT', '-'),
('Malijan, Raphael Yuri C.', '21-04010', 'ABSENT', '-'),
('Marabe, Carlos Miguel A.', '21-04698', 'ABSENT', '-'),
('Mas, Lanthis Audrei H.', '21-00880', 'ABSENT', '-'),
('Mistas, Elaiza Jane R.', '21-09105', 'ABSENT', '-'),
('Pantay, Karl David B.', '21-07124', 'ABSENT', '-'),
('Robles, Ryniel Dave R.', '21-03974', 'ABSENT', '-'),
('Rodil, Mark Joshua H.', '21-06112', 'ABSENT', '-'),
('Siman, Niel Patrick Harris D.', '21-02139', 'ABSENT', '-'),
('Simara, Justine C.', '21-02534', 'ABSENT', '-'),
('Sta. Barbara, Wency C.', '21-07284', 'ABSENT', '-'),
('TEST', 'TEST1', '1', ''),
('Teves, Daniel R.', '21-07068', 'ABSENT', '-'),
('Villanueva, Mariejoe P.', '21-02019', 'ABSENT', '-');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`Name`,`Admin Code`);

--
-- Indexes for table `mercado_anacieto_oop_display`
--
ALTER TABLE `mercado_anacieto_oop_display`
  ADD PRIMARY KEY (`Name`,`SR Code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
