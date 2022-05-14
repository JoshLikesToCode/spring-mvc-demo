<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		Favorite Language:<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java" /><br>
		C# <form:radiobutton path="favoriteLanguage" value="C#" /><br>
		TypeScript <form:radiobutton path="favoriteLanguage" value="TypeScript" /><br>
		EmojiCode <form:radiobutton path="favoriteLanguage" value="EmojiCode" /><br>
		<br><br>
		Favorite Operating System:<br>
		Linux <form:checkbox path="favoriteOS" value="Linux" /><br>
		Kali Linux<form:checkbox path="favoriteOS" value="Kali Linux" /><br>
		Temple OS<form:checkbox path="favoriteOS" value="Temple OS" /><br>
		Mac OS<form:checkbox path="favoriteOS" value="Mac OS"/><br>
		Windows<form:checkbox path="favoriteOS" value="Windows" /><br>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>


</body>

</html>