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
    name = "flashcardQuiz", 
    urlPatterns = { "/FlashcardQuiz" }
)
 
public class FlashcardQuizServlet extends HttpServlet {
 
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

        dogTwo.setDoggoType("Labrador Retriever");
        dogTwo.setDoggoHairType("Double-coated, providing protection from the elements");
        dogTwo.setDoggoAverageWeight(65);
        dogTwo.setDoggoAverageLifespan(12);

        dogThree.setDoggoType("Rhodesian Ridgeback");
        dogThree.setDoggoHairType("short and dense, sleek and glossy");
        dogThree.setDoggoAverageWeight(75);
        dogThree.setDoggoAverageLifespan(11);

        dogFour.setDoggoType("Norwegian Ridgeback");
        dogFour.setDoggoHairType("scaly, dragonesque");
        dogFour.setDoggoAverageWeight(39600);
        dogFour.setDoggoAverageLifespan(2400);
        
        doggos.add(dogOne);
        doggos.add(dogTwo);
        doggos.add(dogThree);
        doggos.add(dogFour);

        request.setAttribute("doggoQuiz", doggos);

        //Create the url
        String url = "/teamMVC.jsp";
 
        //Forward to jsp page
        RequestDispatcher  dispatcher = 
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
 
    }
 
}