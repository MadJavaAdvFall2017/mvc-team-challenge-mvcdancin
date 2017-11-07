package java112.project3;
 
import java.io.*;
import java.util.*;
 
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
 
/**
 *  This class demonstrates Flashcard Quiz MVC servlet for Unit 3
 *
 *@author    eknapp
 */
@WebServlet(
    name = "doggoInfo",
        urlPatterns = { "/DoggoInfo" }
)
 
public class DoggoInfoServlet extends HttpServlet {
 
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               the HttpRequest
     *@param  response              the HttpResponse
     *@exception  ServletException  if there is a general 
     *                              servlet exception
     *@exception  IOException       if there is a general 
     *                              I/O exception
     */
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
        throws ServletException, IOException {
    

        Doggo dogOne = new Doggo();
        Doggo dogTwo = new Doggo();
        Doggo dogThree = new Doggo();
        Doggo dogFour = new Doggo();

        List<Doggo> doggos = new ArrayList<Doggo>();

        dogOne.setDoggoType("Pit Bull Terrier");
        dogOne.setDoggoHairType("Shiny and stiff to the touch, very short");
        dogOne.setDoggoAverageWeight(60);
        dogOne.setDoggoAverageLifespan(14);
        dogOne.setDoggoPic("pitbull.png");

        dogTwo.setDoggoType("Labrador Retriever");
        dogTwo.setDoggoHairType("Double-coated, providing protection from the elements");
        dogTwo.setDoggoAverageWeight(65);
        dogTwo.setDoggoAverageLifespan(12);
        dogTwo.setDoggoPic("labs.jpg");

        dogThree.setDoggoType("Rhodesian Ridgeback");
        dogThree.setDoggoHairType("short and dense, sleek and glossy");
        dogThree.setDoggoAverageWeight(75);
        dogThree.setDoggoAverageLifespan(11);
        dogThree.setDoggoPic("rhodesianRidgeback.jpg");

        dogFour.setDoggoType("Norwegian Ridgeback");
        dogFour.setDoggoHairType("scaly, dragonesque");
        dogFour.setDoggoAverageWeight(39600);
        dogFour.setDoggoAverageLifespan(2400);
        dogFour.setDoggoPic("norwegianRidgeback.jpg");

        doggos.add(dogOne);
        doggos.add(dogTwo);
        doggos.add(dogThree);
        doggos.add(dogFour);

 /*       request.setAttribute("doggos", dogOne);
        request.setAttribute("doggos", dogTwo);
        request.setAttribute("doggos", dogThree);
        request.setAttribute("doggos", dogFour);
*/      request.setAttribute("doggos", doggos);
        //Create the url
        String url = "/teamMVC.jsp";
 
        //Forward to jsp page
        RequestDispatcher  dispatcher = 
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
 
    }
 
}