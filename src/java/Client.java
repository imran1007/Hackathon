
/**
 *
 * @author pirrang
 */
public class Client
{
    private String lastName;
    private String firstName;
    
    private double eletricityKWHAn;
    private double electricityPriceByYear;
    private double electricitySpareMade;
    
    private double gasKWHAn;
    private double gasPriceByYear;
    private double gasSpareMade;

    public Client(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public Client() {
        this("James","Smith");
        
        eletricityKWHAn = 155;
        electricityPriceByYear = 102;
        electricitySpareMade = 224;
        
        gasKWHAn = 120;
        gasPriceByYear = 145;
    }
    
    

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public double getEletricityKWHAn()
    {
        return eletricityKWHAn;
    }

    public void setEletricityKWHAn(double eletricityKWHAn)
    {
        this.eletricityKWHAn = eletricityKWHAn;
    }

    public double getElectricityPriceByYear()
    {
        return electricityPriceByYear;
    }

    public void setElectricityPriceByYear(double electricityPriceByYear)
    {
        this.electricityPriceByYear = electricityPriceByYear;
    }

    public double getElectricitySpareMade()
    {
        return electricitySpareMade;
    }

    public void setElectricitySpareMade(double electricitySpareMade)
    {
        this.electricitySpareMade = electricitySpareMade;
    }

    public double getGasKWHAn()
    {
        return gasKWHAn;
    }

    public void setGasKWHAn(double gasKWHAn)
    {
        this.gasKWHAn = gasKWHAn;
    }

    public double getGasPriceByYear()
    {
        return gasPriceByYear;
    }

    public void setGasPriceByYear(double gasPriceByYear)
    {
        this.gasPriceByYear = gasPriceByYear;
    }

    public double getGasSpareMade()
    {
        return gasSpareMade;
    }

    public void setGasSpareMade(double gasSpareMade)
    {
        this.gasSpareMade = gasSpareMade;
    }
    
    
}
