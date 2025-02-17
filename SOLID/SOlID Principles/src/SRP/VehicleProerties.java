package SRP;

/**
 * Describe the properties for the vehicle like :brand , color ....
 * 
 * @author othman.alothman
 *
 */
public class VehicleProerties {

	private String vehicleNumber;
	private String vehicleColor;
	private String vehicleModel;
	private VehicleType vehicleType;
	private VehicleBrand vehicleBrand;

	public VehicleProerties() {
		
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public VehicleBrand getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(VehicleBrand vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

}
