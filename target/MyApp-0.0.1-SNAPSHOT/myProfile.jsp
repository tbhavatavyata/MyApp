<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="Data.Profile"%>
<%@ page import="java.util.ArrayList"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

     %>
%>for( fontSize = 1; fontSize <= 3; fontSize++)

Profile profile = new Profile();
ArrayList<Profile> list = (ArrayList<Profile>) request.getAttribute("list");
//storing passed value from jsp

for(int i = 0; i < list.size(); i++) {

	profile = list.get(i);

out.println( profile.getId());

out.println(profile.getName());

out.println(profile.getAge() );
}
</font><br />

%>

</body>
</html>