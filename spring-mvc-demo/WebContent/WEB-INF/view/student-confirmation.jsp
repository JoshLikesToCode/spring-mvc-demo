<!-- allows forEach -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation Page</title>
</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br><br>
	Favorite Language: ${student.favoriteLanguage}
	<br><br>
	Favorite OS:
		<ul>
			<c:forEach var="temp" items="${student.favoriteOS}">
			
				<li> ${temp} <li>
				
			</c:forEach>
		</ul> 

</body>

</html>