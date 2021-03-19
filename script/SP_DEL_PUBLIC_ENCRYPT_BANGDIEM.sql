/*----------------------------------------------------------
MASV: N17DCAT015
HO TEN: ĐOÀN HỒNG ĐĂNG
LAB: 04
NGAY: 24/09/2020
----------------------------------------------------------*/
USE [QLSVNhom]
GO
/****** Object:  StoredProcedure [dbo].[SP_DEL_PUBLIC_ENCRYPT_BANGDIEM]    Script Date: 28/9/2020 9:51:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[SP_DEL_PUBLIC_ENCRYPT_BANGDIEM]
(@MAHP VARCHAR(20),@MASV VARCHAR(20))
AS
BEGIN
DELETE FROM BANGDIEM
WHERE MAHP = @MAHP AND MASV = @MASV
END