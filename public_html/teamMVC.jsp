<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <%@ include file="body.jsp" %>
    <%@ include file="teamMvcHeader.jsp" %>

    <div style="background-image: url(images/background.png);">

        <div id="wrap">

        <div id="content">
        <p>where dis?</p>
        <table>
            <tr>
               <h3>
                   <th>Breed</th>
                   <th>Hair Type</th>
                   <th>Avg Weight (lbs)</th>
                   <th>Avg Lifespan</th>
                   <th>Doggo Pic</th>
               </h3>
            </tr>
            <c:forEach items="${doggos}" var="doggos">
                <tr>
                    <td>${doggos.doggoType}</td>
                    <td>${doggos.doggoHairType}</td>
                    <td>${doggos.doggoAverageWeight}</td>
                    <td>${doggos.doggoAverageLifespan}</td>
                    <td>
                        <img src="images/${doggos.doggoPic}">
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </div>
    <%@ include file="teamFooter.jsp" %>
    </div>
</body>
</html>
