package java112.project3;

/**
*  This JavaBean is for identifying pretty pretty doggos.
*
*@author    nsteck
*/
public class Doggo /* extends java.lang.Object */ {

    private String doggoType;
    private String doggoHairType;
    private int doggoAverageWeight;
    private int doggoAverageLifespan;
    private String doggoPic;
       
    //Doggo doggo = new Doggo();

    /**
    *  Constructor for the Doggo object
    */
    public Doggo() {
       doggoType = "A friendly mutt";
       doggoHairType = "Coarse doggo hairs";
       doggoAverageWeight = 33;
       doggoAverageLifespan = 100;
       doggoPic = "sup brah";
    }
    
    
    /**
    *  Gets the doggoType attribute of the Doggo object
    *
    *@return    The doggoType value
    */
    public String getDoggoType() {
       return doggoType;
    }
    
    
    /**
    *  Sets the doggoType attribute of the Doggo object
    *
    *@param  doggoType  The new doggoType value
    */
    public void setDoggoType(String doggoType) {
       this.doggoType = doggoType;
    }
    
    /**
    *  Gets the doggoHairType attribute of the Doggo object
    *
    *@return    The doggoHairType value
    */
    public String getDoggoHairType() {
       return doggoHairType;
    }
    
    /**
    *  Sets the doggoHairType attribute of the Doggo object
    *
    *@param  doggoHairType  The new doggoHairType value
    */
    public void setDoggoHairType(String doggoHairType) {
       this.doggoHairType = doggoHairType;
    }
    
    /**
    *  Gets the doggoAverageWeight attribute of the Doggo object
    *
    *@return    The doggoAverageWeight value
    */
    public int getDoggoAverageWeight() {
       return doggoAverageWeight;
    }
    
    /**
    *  Sets the doggoAverageWeight attribute of the Doggo object
    *
    *@param  doggoAverageWeight  The new doggoAverageWeight value
    */
    public void setDoggoAverageWeight(int doggoAverageWeight) {
       this.doggoAverageWeight = doggoAverageWeight;
    }
    
    /**
    *  Gets the doggoAverageLifespan attribute of the Doggo object
    *
    *@return    The doggoAverageLifespan value
    */
    public int getDoggoAverageLifespan() {
       return doggoAverageLifespan;
    }

    /**
     *  Sets the doggoAverageLifespan attribute of the Doggo object
     *
     *@param  doggoAverageLifespan  The new doggoAverageLifespan value
     */
    public void setDoggoAverageLifespan(int doggoAverageLifespan) {
        this.doggoAverageLifespan = doggoAverageLifespan;
    }

    /**
     *  Sets the doggoPic attribute of the Doggo object
     *
     *@param  doggoPic  The new doggoPic location
     */
    public void setDoggoPic(String doggoPic) {
        this.doggoPic = doggoPic;
    }

    /**
     *  Gets the doggoPic attribute of the Doggo object
     *
     *@return  doggoPic
     */
    public String getDoggoPic() {
        return doggoPic;
    }

}

