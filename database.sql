USE [master]
GO
/****** Object:  Database [Shopping]    Script Date: 12/23/2020 11:39:11 PM ******/
CREATE DATABASE [Shopping]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Shopping', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Shopping.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Shopping_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Shopping_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Shopping].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Shopping] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Shopping] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Shopping] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Shopping] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Shopping] SET ARITHABORT OFF 
GO
ALTER DATABASE [Shopping] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Shopping] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Shopping] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Shopping] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Shopping] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Shopping] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Shopping] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Shopping] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Shopping] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Shopping] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Shopping] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Shopping] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Shopping] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Shopping] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Shopping] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Shopping] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Shopping] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Shopping] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Shopping] SET  MULTI_USER 
GO
ALTER DATABASE [Shopping] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Shopping] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Shopping] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Shopping] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Shopping] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Shopping]
GO
/****** Object:  Table [dbo].[ChiTietDonHang]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDonHang](
	[MaChiTietDh] [int] IDENTITY(1,1) NOT NULL,
	[MaDh] [int] NULL,
	[MaSp] [int] NULL,
	[SoLuong] [int] NULL,
	[GiaTien] [float] NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaChiTietDh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DanhGia]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DanhGia](
	[MaYt] [int] IDENTITY(1,1) NOT NULL,
	[SoSao] [int] NULL,
	[MaSp] [int] NULL,
	[MaKh] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaYt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonHang]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonHang](
	[MaDh] [int] IDENTITY(1,1) NOT NULL,
	[TenKh] [nvarchar](100) NULL,
	[Email] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SoDienThoai] [nvarchar](50) NULL,
	[TongTien] [float] NULL,
	[NgayMua] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
	[MaKh] [int] NULL,
	[MaTt] [int] NULL,
	[MaVc] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKh] [int] IDENTITY(1,1) NOT NULL,
	[TenKh] [nvarchar](100) NULL,
	[TenTk] [nvarchar](50) NULL,
	[MatKhau] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SoDienThoai] [int] NULL,
	[Email] [nvarchar](100) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNcc] [int] IDENTITY(1,1) NOT NULL,
	[TenNcc] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNcc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhomSanPham]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhomSanPham](
	[MaNhomSp] [int] IDENTITY(1,1) NOT NULL,
	[TenNhomSp] [nvarchar](100) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNhomSp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QuangCao]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QuangCao](
	[MaQc] [int] IDENTITY(1,1) NOT NULL,
	[TenQc] [nvarchar](100) NULL,
	[Anh] [nvarchar](max) NULL,
	[Gia] [float] NULL,
	[NhaSanXuat] [nvarchar](100) NULL,
	[Mota] [nvarchar](max) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaQc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QuanTri]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QuanTri](
	[MaQt] [int] IDENTITY(1,1) NOT NULL,
	[TenQt] [nvarchar](100) NULL,
	[TaiKhoan] [nvarchar](100) NULL,
	[MatKhau] [nvarchar](100) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaQt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSp] [int] IDENTITY(1,1) NOT NULL,
	[TenSp] [nvarchar](100) NULL,
	[Anh] [nvarchar](max) NULL,
	[Gia] [float] NULL,
	[MaNcc] [int] NULL,
	[Mota] [nvarchar](max) NULL,
	[TrangThai] [bit] NULL,
	[MaNhomSp] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThanhToan]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThanhToan](
	[MaTt] [int] IDENTITY(1,1) NOT NULL,
	[TenTt] [nvarchar](100) NULL,
	[Mota] [nvarchar](max) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaTt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[UaThich]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UaThich](
	[MaUt] [int] IDENTITY(1,1) NOT NULL,
	[MaKh] [int] NULL,
	[MaSp] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaUt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VanChuyen]    Script Date: 12/23/2020 11:39:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VanChuyen](
	[MaVc] [int] IDENTITY(1,1) NOT NULL,
	[TenVc] [nvarchar](100) NULL,
	[Gia] [float] NULL,
	[Mota] [nvarchar](max) NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaVc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[ChiTietDonHang] ON 

INSERT [dbo].[ChiTietDonHang] ([MaChiTietDh], [MaDh], [MaSp], [SoLuong], [GiaTien], [TrangThai]) VALUES (1, 1, 2, 1, 1000000, 1)
INSERT [dbo].[ChiTietDonHang] ([MaChiTietDh], [MaDh], [MaSp], [SoLuong], [GiaTien], [TrangThai]) VALUES (2, 2, 3, 3, 500000, 1)
SET IDENTITY_INSERT [dbo].[ChiTietDonHang] OFF
GO
SET IDENTITY_INSERT [dbo].[DonHang] ON 

INSERT [dbo].[DonHang] ([MaDh], [TenKh], [Email], [DiaChi], [SoDienThoai], [TongTien], [NgayMua], [TrangThai], [MaKh], [MaTt], [MaVc]) VALUES (1, N'quan', N'daoquan.sanfrancisco@gmail.com', N'abc', N'90202', 1050000, N'2020-12-23 14:51:06.3', 1, 1, 1, 2)
INSERT [dbo].[DonHang] ([MaDh], [TenKh], [Email], [DiaChi], [SoDienThoai], [TongTien], [NgayMua], [TrangThai], [MaKh], [MaTt], [MaVc]) VALUES (2, N'quan', N'daoquan.sanfrancisco@gmail.com', N'abc', N'90202', 1530000, N'2020-12-23 23:04:06.209', 1, 1, 1, 4)
SET IDENTITY_INSERT [dbo].[DonHang] OFF
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKh], [TenKh], [TenTk], [MatKhau], [DiaChi], [SoDienThoai], [Email], [TrangThai]) VALUES (1, N'quan', N'abc123456', N'123456', N'abc', 90202, N'daoquan.sanfrancisco@gmail.com', 1)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
GO
SET IDENTITY_INSERT [dbo].[NhaCungCap] ON 

INSERT [dbo].[NhaCungCap] ([MaNcc], [TenNcc], [TrangThai]) VALUES (1, N'Deco  rèm', 1)
INSERT [dbo].[NhaCungCap] ([MaNcc], [TenNcc], [TrangThai]) VALUES (2, N'Rèm thiên minh sơn', 1)
INSERT [dbo].[NhaCungCap] ([MaNcc], [TenNcc], [TrangThai]) VALUES (3, N'Rèm nam an', 1)
SET IDENTITY_INSERT [dbo].[NhaCungCap] OFF
GO
SET IDENTITY_INSERT [dbo].[NhomSanPham] ON 

INSERT [dbo].[NhomSanPham] ([MaNhomSp], [TenNhomSp], [TrangThai]) VALUES (1, N'Rèm sáo gỗ', 1)
INSERT [dbo].[NhomSanPham] ([MaNhomSp], [TenNhomSp], [TrangThai]) VALUES (2, N'Winlux Hàn Quốc', 1)
INSERT [dbo].[NhomSanPham] ([MaNhomSp], [TenNhomSp], [TrangThai]) VALUES (3, N'Rèm cuốn', 1)
INSERT [dbo].[NhomSanPham] ([MaNhomSp], [TenNhomSp], [TrangThai]) VALUES (4, N'Rèm vải', 1)
INSERT [dbo].[NhomSanPham] ([MaNhomSp], [TenNhomSp], [TrangThai]) VALUES (5, N'Rèm Roman', 1)
SET IDENTITY_INSERT [dbo].[NhomSanPham] OFF
GO
SET IDENTITY_INSERT [dbo].[QuangCao] ON 

INSERT [dbo].[QuangCao] ([MaQc], [TenQc], [Anh], [Gia], [NhaSanXuat], [Mota], [TrangThai]) VALUES (1, N'Hodie Alpha', N'http://cdn.nhanh.vn/cdn/store/23832/art/article_1526185666_428.jpg', 1000000, N'VietNamMade', N'...', 1)
INSERT [dbo].[QuangCao] ([MaQc], [TenQc], [Anh], [Gia], [NhaSanXuat], [Mota], [TrangThai]) VALUES (2, N'Hodie Alpha', N'https://ragus.vn/wp-content/uploads/2018/10/quan-tay-thun-nam-routine-2.jpg', 1000000, N'VietNamMade', N'...', 1)
SET IDENTITY_INSERT [dbo].[QuangCao] OFF
GO
SET IDENTITY_INSERT [dbo].[QuanTri] ON 

INSERT [dbo].[QuanTri] ([MaQt], [TenQt], [TaiKhoan], [MatKhau], [TrangThai]) VALUES (1, N'quan', N'admin', N'123456', 1)
SET IDENTITY_INSERT [dbo].[QuanTri] OFF
GO
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (1, N'Rèm vải', N'http://localhost:8080/Admin/images/13180529961941531543cb.jpg', 1000000, 1, N'...', 1, 1)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (2, N'Rèm cửa sổ', N'http://localhost:8080/Admin/images/131805301329334319188c.jpg', 1000000, 3, N'...', 1, 2)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (3, N'Rèm cửa buồng AE38-3824', N'http://localhost:8080/Admin/images/131805283887723684188c.jpg', 500000, 1, N'...', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (4, N'Rèm vài in tranh 3D AE38-3825', N'http://localhost:8080/Admin/images/131762939350396626a62f.jpg', 600000, 3, N'...', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (5, N'Rèm Roman Hàn Quốc', N'http://localhost:8080/Admin/images/131762940813211196.jpg', 800000, 2, N'...', 1, 2)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (6, N'Rèm phòng khách', N'http://localhost:8080/Admin/images/131762954284146856.jpg', 1200000, 2, N'Rèm phòng khác ', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (7, N'Rèm vải cửa xổ', N'http://localhost:8080/Admin/images/131762940816799202.jpg', 600000, 3, N'Rèm che cửa xổ', 1, 2)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (8, N'Rèm Roman Hàn Quốc', N'http://localhost:8080/Admin/images/131762940219474153.jpg', 650000, 3, N'Rèm Roman Hàn Quốc ', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (9, N'Rèm vải cao cấp', N'http://localhost:8080/Admin/images/131762934675224415.jpg', 1500000, 1, N'rèm vải cao cấp', 1, 4)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (10, N'Rèm Roman Hàn Quốc', N'http://localhost:8080/Admin/images/131762935696402208a62f.jpg', 600000, 2, N'Rèm Roman Hàn Quốc', 1, 2)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (11, N'Rèm cửa sổ', N'http://localhost:8080/Admin/images/131762939350396626.jpg', 600000, 2, N'rèm vải cao cấp', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (12, N'Rèm vải', N'http://localhost:8080/Admin/images/131762940813211196.jpg', 500000, 2, N'rèm vải cao cấp', 1, 2)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (13, N'Rèm vải cửa xổ', N'http://localhost:8080/Admin/images/131762940816799202.jpg', 600000, 2, N'Rèm phòng khác ', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (14, N'Rèm vải cửa xổ', N'http://localhost:8080/Admin/images/131763747054607284a62f.jpg', 500000, 2, N'rèm vải cao cấp', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (15, N'Rèm trẻ em', N'http://localhost:8080/Admin/images/131763771841490820a62f.jpg', 500000, 2, N'Rèm trẻ em', 1, 3)
INSERT [dbo].[SanPham] ([MaSp], [TenSp], [Anh], [Gia], [MaNcc], [Mota], [TrangThai], [MaNhomSp]) VALUES (16, N'Rèm cửa buồng AE38-3824', N'http://localhost:8080/Admin/images/131763783115318621a62f.jpg', 500000, 2, N'Rèm Roman Hàn Quốc', 1, 2)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
GO
SET IDENTITY_INSERT [dbo].[ThanhToan] ON 

INSERT [dbo].[ThanhToan] ([MaTt], [TenTt], [Mota], [TrangThai]) VALUES (1, N'Thanh toán bằng thẻ tín dụng', N'Bạn có thể trả phí trực tiếp thông qua số tài khoản ATM', 1)
INSERT [dbo].[ThanhToan] ([MaTt], [TenTt], [Mota], [TrangThai]) VALUES (2, N'Thanh toán trực tiếp', N'Bạn có thể trả phí khi nhận được hàng', 1)
SET IDENTITY_INSERT [dbo].[ThanhToan] OFF
GO
SET IDENTITY_INSERT [dbo].[UaThich] ON 

INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (1, 1, 1)
INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (2, 1, 1)
INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (3, 1, 1)
INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (4, 1, 1)
INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (5, 1, 1)
INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (6, 1, 3)
INSERT [dbo].[UaThich] ([MaUt], [MaKh], [MaSp]) VALUES (7, 1, 3)
SET IDENTITY_INSERT [dbo].[UaThich] OFF
GO
SET IDENTITY_INSERT [dbo].[VanChuyen] ON 

INSERT [dbo].[VanChuyen] ([MaVc], [TenVc], [Gia], [Mota], [TrangThai]) VALUES (1, N'Phí vận chuyển', 30000, N'Giao Hàng từ 5 - 10 ngày', 1)
INSERT [dbo].[VanChuyen] ([MaVc], [TenVc], [Gia], [Mota], [TrangThai]) VALUES (2, N'Speed Method', 50000, N'Giao Hàng từ 3 - 5 ngày', 1)
INSERT [dbo].[VanChuyen] ([MaVc], [TenVc], [Gia], [Mota], [TrangThai]) VALUES (3, N'Go Viet', 70000, N'Giao Hàng từ 1 - 3 ngày', 1)
INSERT [dbo].[VanChuyen] ([MaVc], [TenVc], [Gia], [Mota], [TrangThai]) VALUES (4, N'Phí vận chuyển', 30000, N'Thời gian giao hàng khoản từ 5-7 ngày', 1)
INSERT [dbo].[VanChuyen] ([MaVc], [TenVc], [Gia], [Mota], [TrangThai]) VALUES (5, N'Phí vận chuyển', 30000, N'Thời gian giao hàng khoản từ 5-7 ngày', 1)
SET IDENTITY_INSERT [dbo].[VanChuyen] OFF
GO
ALTER TABLE [dbo].[ChiTietDonHang]  WITH CHECK ADD FOREIGN KEY([MaDh])
REFERENCES [dbo].[DonHang] ([MaDh])
GO
ALTER TABLE [dbo].[ChiTietDonHang]  WITH CHECK ADD FOREIGN KEY([MaSp])
REFERENCES [dbo].[SanPham] ([MaSp])
GO
ALTER TABLE [dbo].[DanhGia]  WITH CHECK ADD FOREIGN KEY([MaKh])
REFERENCES [dbo].[KhachHang] ([MaKh])
GO
ALTER TABLE [dbo].[DanhGia]  WITH CHECK ADD FOREIGN KEY([MaSp])
REFERENCES [dbo].[SanPham] ([MaSp])
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD FOREIGN KEY([MaKh])
REFERENCES [dbo].[KhachHang] ([MaKh])
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD FOREIGN KEY([MaTt])
REFERENCES [dbo].[ThanhToan] ([MaTt])
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD FOREIGN KEY([MaVc])
REFERENCES [dbo].[VanChuyen] ([MaVc])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([MaNcc])
REFERENCES [dbo].[NhaCungCap] ([MaNcc])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([MaNhomSp])
REFERENCES [dbo].[NhomSanPham] ([MaNhomSp])
GO
ALTER TABLE [dbo].[UaThich]  WITH CHECK ADD FOREIGN KEY([MaKh])
REFERENCES [dbo].[KhachHang] ([MaKh])
GO
ALTER TABLE [dbo].[UaThich]  WITH CHECK ADD FOREIGN KEY([MaSp])
REFERENCES [dbo].[SanPham] ([MaSp])
GO
USE [master]
GO
ALTER DATABASE [Shopping] SET  READ_WRITE 
GO
