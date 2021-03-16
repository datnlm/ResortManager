create database ResortManager
go
use ResortManager
GO
CREATE TABLE tblRoles(
    roleID varchar(6) PRIMARY KEY,
    roleName varchar(50),
)
go
create table tblUsers(
    userID VARCHAR(50) PRIMARY KEY,
    password VARCHAR(20),
    fullName varchar(30),
    gender varchar(6),
    email varchar(50),
    roleID varchar(6) FOREIGN KEY REFERENCES [tblRoles](roleID)
)
GO
create table tblRoom(
    roomID varchar(5) PRIMARY key,
    description varchar(500),
    price float,
    status bit
)
GO
CREATE table tblOrders(
    orderID int IDENTITY(1, 1) PRIMARY key,
    userID varchar(50) FOREIGN KEY REFERENCES [tblUsers](userID),
    orderDate DateTime,
    totalMoney float,
    status bit
)
GO
create table tblOrderDetail(
    id int IDENTITY(1, 1) PRIMARY key,
    roomID varchar(5) FOREIGN KEY REFERENCES [tblRoom](roomID),
    price float,
    checkIn DATE,
    checkOut Date,
    orderID int FOREIGN KEY REFERENCES [tblOrders](orderID)
)
GO
insert into tblRoles values('admin', 'administrator')
go
insert into tblRoles values('user', 'member')
go
insert into tblUsers values('admin', 1, 'datnlm Admin', 'male', 'datnlmse@gmail.com', 'admin')
go
insert into tblUsers values('dat', 1, 'dat', 'female', 'datnlmse@gmail.com', 'user')
go
insert into tblRoom values('P01', 'This room offers sea view from the private balcony.4 There are a stone-lined ensuite bathroom and a king bed with Irish linen. Each room is equipped with free WiFi, smart TV with more than 1200 programs and bathroom amenities.', 99, 1)
go
insert into tblRoom values('P02', 'This villa features a private balcony that opens up to views of the sea and access to a private pool. The separate seating area is fitted with a flat-screen TV, desk and a safe. The stone-lined ensuite bathroom includes a hairdryer. Down pillows and bed with Irish linen are available.', 101, 1)
go
insert into tblRoom values('P03', 'This twin room features a private balcony with views of the ocean, air conditioning and cable flat-screen TV with more than 1200 programs. The stone-lined en suite bathroom and a bed with Irish linen are available. The private beach is just metres away from this room.', 89, 1)
go
insert into tblRoom values('P04', 'This room offers sea view from the private balcony. The twin bed is fitted with Irish linen and goose down pillows. Each room is equipped with a working desk, seating area, free WiFi, smart TV and bathroom amenities.', 129, 1)
go
insert into tblRoom values('P05', 'This room offers view of tropical garden from the private balcony. The twin bed is fitted with Irish linen and goose down pillows. Each room is equipped with a working desk, seating area, free WiFi, smart TV and bathroom amenities.', 89, 1)
go
insert into tblRoom values('P06', 'This twin room offers view of tropical garden from the private balcony. The stone-lined en suite bathroom includes French bathroom amenities and a hairdryer. The twin bed is fitted with Irish linen. Free WiFi and Internet TV with more than 1200 programs are provided.', 149, 1)
go
insert into tblRoom values('P07', 'This room offers view of tropical garden from the private balcony. The king bed is fitted with Irish linen and goose down pillows. Each room is equipped with a working desk, seating area, free WiFi, smart TV and bathroom amenities.', 150, 1)
go
