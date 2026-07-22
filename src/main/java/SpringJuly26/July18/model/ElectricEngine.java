package SpringJuly26.July18.model;

public class ElectricEngine implements Engine{
    @Override
    public String getEngineType() {
        return "Electric";
    }

    @Override
    public double getHorsePower() {
        return 5000;
    }
}
