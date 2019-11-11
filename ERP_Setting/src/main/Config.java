package main;

public class Config {

	public static String CD[] = { "drop database if exists skill_erp", "create database skill_erp", "use skill_erp" };

	public static String CT[] = {
			"create table department(deptno int primary key, deptname varchar(10) not null,floor int)",
			"create table title(titleno int primary key, titlename varchar(20) not null)",
			"create table employee(empno int primary key, empname varchar(20) not null,title int, salary int, dno int, post char(5),address varchar(20),pic longblob, foreign key(title) references title(titleno),foreign key(dno) references department(deptno))",
			"create table post(zipcode char(5), sido varchar(20), sigungu varchar(20),eupmyun varchar(20),doro varchar(80),building1 char(5),building2 char(5),courtdong varchar(20),ri varchar(20),adminDong varchar(20), zibun1 varchar(4),zibun2 varchar(4))" };

	public static String LP = "load data local infile '%s' into table %s character set 'euckr' fields terminated by '|' ignore 1 lines (@zipcode,@sido,@d,@sigungu,@d,@eupmyun,@d,@d,@doro,@d,@d,@building1,@building2,@d,@d,@d,@d,@courtdong,@ri,@adminDong,@d,@zibun1,@zibun2) set zipcode = @zipcode,sido = @sido,sigungu = @sigungu,eupmyun = @eupmyun,doro = @doro, building1 = @building1,building2 = @building2,courtdong = @courtdong, ri = @ri, admindong = @admindong,zibun1 =@zibun1,zibun2 = @zibun2";

	public static String CU = "grant insert, select, delete, update on skill_erp.* to user identified by '1234'";
}
