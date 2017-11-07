<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <%@ include file="body.jsp" %>
    <%@ include file="teamMvcHeader.jsp" %>

    <div id="wrap">

        <div id="sidebar">
            <h2 class="header">Project 3 Links</h2>
            <div class="box">
                <ul>
                    <li><a href="/java112/request-servlet" title="request-servlet">HTTP Request Data</a></li>
                </ul>
            </div>

        </div>
        <p>where dis?</p>
        <table>
            <tr>
                <td>Breed</td>
                <td>Hair Type</td>
                <td>Avg Weight (lbs)</td>
                <td>Avg Lifespan</td>
            </tr>
            <c:forEach items="${doggos}" var="doggos">
                <tr>
                    <td>${doggos.doggoType}</td>

                    <td>${doggos.doggoHairType}</td>

                    <td>${doggos.doggoAverageWeight}</td>

                    <td>${doggos.doggoAverageLifespan}</td>
                </tr>
            </c:forEach>
        </table>
        <p>Dog Type: ${doggo1.doggoType}</p>
        <p>Hair Type: ${doggo1.doggoHairType}</p>
        <p>Avg Weight: ${doggo1.doggoAverageWeight}</p>
        <p>Avg Lifespan: ${doggo1.doggoAverageLifespan}</p>
        <br />
        <p>Dog Type: ${doggo2.doggoType}</p>
        <p>Hair Type: ${doggo2.doggoHairType}</p>
        <p>Avg Weight: ${doggo2.doggoAverageWeight}</p>
        <p>Avg Lifespan: ${doggo2.doggoAverageLifespan}</p>
        <br />
        <p>Dog Type: ${doggo3.doggoType}</p>
        <p>Hair Type: ${doggo3.doggoHairType}</p>
        <p>Avg Weight: ${doggo3.doggoAverageWeight}</p>
        <p>Avg Lifespan: ${doggo3.doggoAverageLifespan}</p>
        <br />
        <p>Dog Type: ${doggo4.doggoType}</p>
        <p>Hair Type: ${doggo4.doggoHairType}</p>
        <p>Avg Weight: ${doggo4.doggoAverageWeight}</p>
        <p>Avg Lifespan: ${doggo4.doggoAverageLifespan}</p>

    </div>
    <%@ include file="teamFooter.jsp" %>
</body>
</html>
