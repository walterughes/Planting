/**
  *   This class acts as a representation of an edible plant, 
  *    such as a fruit or a vegetable.
  *
  *   @author: Carrel Reid and Walter Ughes
  *   @version 1.0, April 3, 2015
  **/
  
public class EdiblePlant 
{
   // The number of days it takes this EdiblePlant object to grow.
   private int m_days_to_maturity;
   
   // The name of the EdiblePlant object.
   private String m_name;
   
   // The number of days between plantings of this EdiblePlant object.
   private int m_planting_interval;
   
   /**
    Default constructor for the class. Initializes all data properties to initial values.
   */
   public EdiblePlant()
   {
      // set value to null
      m_name = null;
       
      // set the value to 0
      m_days_to_maturity = 0;
       
      // set the value to 0
      m_planting_interval = 0;  
   }
   
   /**
    Constructor for the class. Initializes all data properties to the given values.
    
    @param String name, The name of the plant.
    @param int days_to_maturity, The number of days for the plant to grow.
    @param int interval, The number of days to separate plantings.
   */ 
   public EdiblePlant(String name, int days_to_maturity, int interval)
   {
      // store name in m_name
      m_name = name;
       
      // store days_to_maturity in m_days_to_maturity
      m_days_to_maturity = days_to_maturity;
       
      // store interval in m_planting_interval 
      m_planting_interval = interval; 
   }
    
   
   /**
    Returns the name of this EdiblePlant object.
   */
   public String getName()
   {
      // The name of this EdiblePlant object.
      return m_name;
   }
   
   /**
    Returns the growing time of this EdiblePlant object, in days.
   */
   public int getDaysToMaturity()
   {
      // The growing time of this EdiblePlant object, in days.
      return m_days_to_maturity;
   }
   
   /**
    Returns the interval (in days) between plantings of this EdiblePlant object.
   */ 
   public int getPlantingInterval()
   {
      // The planting interval of this EdiblePlant object.
      return m_planting_interval;
   }
} 
