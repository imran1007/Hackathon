

/**
 *
 * @author pirrang
 */
public class Providers
{
    private String name;
    
    private double priceRange;
    
    private double fixTarif;
    
    private double nightPrice;
    private double dayPrice;
    
    private double gasPrice;

    public Providers(String name, double fixTarif, double nightPrice, double dayPrice,double gasPrice,double gasFixedPRice)
    {
        this.name = name;
        this.fixTarif = fixTarif;
        this.nightPrice = nightPrice + fixTarif;
        this.dayPrice = dayPrice + fixTarif;
        
        priceRange = dayPrice - nightPrice;
        gasPrice = gasFixedPRice + gasPrice;
       
        
    }
    
    public static Providers getLampiris() {
        return new Providers ("Lampiris",39.99,0.1232,0.1433,0.0425,39.99);
    }
    
    public static Providers getMega() {
        return new Providers ("Mega",40,0.0815,0.1230,0.0405,40);
    }
    
        
    public static Providers getEngie() {
        return new Providers ("Engie",50,0.08616,0.1165,0.04296,34.99);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPriceRange()
    {
        return priceRange;
    }

    public void setPriceRange(double priceRange)
    {
        this.priceRange = priceRange;
    }

    public double getFixTarif()
    {
        return fixTarif;
    }

    public void setFixTarif(double fixTarif)
    {
        this.fixTarif = fixTarif;
    }

    public double getNightPrice()
    {
        return nightPrice;
    }

    public void setNightPrice(double nightPrice)
    {
        this.nightPrice = nightPrice;
    }

    public double getDayPrice()
    {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice)
    {
        this.dayPrice = dayPrice;
    }

    public double getGasPrice()
    {
        return gasPrice;
    }

    public void setGasPrice(double gasPrice)
    {
        this.gasPrice = gasPrice;
    }

    

}
