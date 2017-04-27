<%-- 
    Document   : save
    Created on : 15 Mar, 2017, 12:51:03 AM
    Author     : Pranav
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.psx.source.Person" %>
<%@page import="org.hibernate.cfg.Configuration" %>
<%@page import="org.hibernate.SessionFactory" %>
<%@page import="org.hibernate.Session" %>
<%@page import="helper.HibernateUtil" %>
<%@page import="org.hibernate.service.ServiceRegistry" %>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder" %>
<%@page import="org.hibernate.HibernateException" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Saving To MySQL Server</title>
	</head>
	<body>
		<jsp:useBean id="ob" class="com.psx.source.Person"></jsp:useBean>
		<jsp:setProperty property="*" name="ob"/>
		<%
                     SessionFactory factory = HibernateUtil.getSessionFactory();
                      Session s = factory.openSession(); 
                      Transaction transaction = null;
                    try{
                        transaction = s.beginTransaction();                                                                   
		    	s.save(ob);
		    	transaction.commit();
		    	System.out.println("successfully");                                             
			}catch(HibernateException e){                                                                     
                            System.out.println("not successfully");
                            e.printStackTrace();
			}
		%>
	</body>
</html>