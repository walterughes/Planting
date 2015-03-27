//pull in java.util for Vector and Date
import java.util.*;

public class PlantingSchedule
{
   /*
    *   Fields ----------------------------------------------------------------
    */
   
   /** The EdiblePlant object to which this planting schedule applies. */
   private EdiblePlant m_edible_plant;
   /** The vector of planting dates for this planting schedule. */
   private Vector<Date> m_planting_schedule;



   /*
    *   Constructors ----------------------------------------------------------
    */
    
   /** Default constructor for the class. 
       Initializes all data properties to initial values.
   */
   public PlantingSchedule()
   {
      //call the default constructor of the EdiblePlant class
      m_edible_plant = new EdiblePlant();
      //create an empty vector of dates
      m_planting_schedule = new Vector<Date>();
   }
   
   /** Constructor for the classs. 
       Initializes the <code>EdiblePlant</code> data property to the given 
       parameter object and creates an empty <code>Vector</code> of 
       <code>Date</code> objects.
       
       @param plant The <code>EdiblePlant</code> object for this schedule.
   */
   public PlantingSchedule(EdiblePlant plant) 
   {
      //put tthe EdiblePlant from the parameters into the new object
      m_edible_plant = plant;
      //create an empty vector of dates
      m_planting_schedule = new Vector<Date>();
   }
   
   
      
   /*
    *   Methods ---------------------------------------------------------------
    */ 
    
   /**
      Returns the <code>EdiblePlant</code> object for this PlantingSchedule.
      @return The <code>EdiblePlant</code> object for this PlantingSchedule.
   */ 
   public EdiblePlant getEdiblePlant()
   {
      //return the edible plant object in this class's data properties
      return m_edible_plant;
   }
   
   /**
      Returns the <code>Date</code> for the first planting of this 
      </code>PlantingSchedule</code>.
      @return The <code>Date</code> for the first planting of this 
      </code>PlantingSchedule</code>.
      
   */ 
   public Date getFirstPlantingDate()
   {
      //return the first element of the vector of dates for the planting sch.
      return m_planting_schedule.firstElement();
   }
   
   /**
      Returns the <code>Date</code> for the last planting of this 
      </code>PlantingSchedule</code>.
      @return The <code>Date</code> for the last planting of this 
      </code>PlantingSchedule</code>.
   */
   public Date getLastPlantingDate()
   {
      //return the last element of the vector of dates for the planting sch.
      return m_planting_schedule.lastElement();
   }
   
   /**
      Adds the given <code>Date</code> to the <code>PlantingSchedule.</code>
      @param d The <code>Date</code> to add to this 
               code>PlantingSchedule.</code>
   */
   public void addPlantingDate(Date d)
   {
      //append the date object from the parameters to the end schedule vector
      m_planting_schedule.add(d);
   }
   
   /**
      Displays the <code>PlantingSchedule</code> to the screen. 
      An example of the output produced by this method is: 
      <br>
       <pre>
           Planting Schedule for Green Beans
           =================================
           Planting #1: 05/01/2015
           Planting #2: 05/11/2015
           Planting #3: 05/21/2015
           Planting #4: 05/31/2015
           Planting #5: 06/10/2015
           Planting #6: 06/20/2015
           Planting #7: 06/30/2015
           Planting #8: 07/10/2015
           Planting #9: 07/20/2015
       </pre>
   */
   public void displayPlantingSchedule()
   {
      //get the header string that will be printed out
      String header = "Planting Schedule for " + m_edible_plant.getName();
      //print the header string
      System.out.println(header);
      //put a number of equal signs, equal to the length of the header string
      for(int i=0; i<header.length(); i++) System.out.print("=");
      
      //put in a line break for formatting
      System.out.println();
      
      //create the calendar object we will be using for displaying the dates
      Calendar cal = Calendar.getInstance();
      //counter that will be used for showing the planting number
      int i = 1;
      
      //display the actual planting dates
      for (Date d : m_planting_schedule)
      {
         // set the calendar object's time to the date we got from the vector
         cal.setTime(d);
         
         // display the planting number and the date in M/D/Y form
         System.out.println("Planting #" + i + ": " 
                          + (cal.get( Calendar.MONTH ) + 1)  + "/"
                          +  cal.get( Calendar.DAY_OF_MONTH )  + "/" 
                          +  cal.get( Calendar.YEAR ));  
         
         // Increment i
         i++;  
      }
   }
}
