<html>
<body>
    <%@ include file="teamMvcHeader.jsp" %>
<div style="background-image: url(images/background.png);">

    <div id="wrap">

        <div id="sidebar">
            <h2 class="header">Project 3 Links</h2>
            <div class="box">
                <ul>
                    <li><a href="/java112/request-servlet" title="request-servlet">HTTP Request Data</a></li>
                    <li><a href="/java112/project3-properties" title="project3-properties">Project Properties</a></li>
                </ul>
            </div>

            <h2>Unit 3 Labs</h2>
            <div class="box">
                <ul>
                    <li><a href="/java112/lab31">3.1 - My very first JSP</a></li>
                    <li><a href="/java112/lab32">3.2 - HTTP Requests</a></li>
                    <li><a href="/java112/lab33Servlet" title="Lab33Servlet">3.3 - Expression Language</a></li>
                    <li><a href="/java112/mvc-demo" title="MvcDemo">3.4 - MVC</a></li>
                </ul>
            </div>

            <h2 class="header">Project 2 Links</h2>
            <div class="box">
                <ul>
                    <li><a href="/java112/first" title="First112Servlet">First112Servlet</a></li>
                    <li><a href="/java112/project2-properties" title="properties">PropertiesServlet</a></li>
                </ul>
            </div>

            <h2>Class demos</h2>
            <div class="box">
                <ul>
                    <li><a href="linkingDemo.html">This is a demo on linking</a></li>
                </ul>
            </div>
        </div>
        <p>where dis?</p>
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
</div>
</body>
</html>
