package SpringJuly26.July18.model;

public class GasEngine implements Engine {
    @Override
    public String getEngineType() {
        return "GasEngine";
    }

    @Override
    public double getHorsePower() {
        return 2000;
    }
}
