
public class Television {

	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	
	private boolean powerOn = false;
	private int channel = 2;
	private int volume = 20;
	
	/**
	 * Television constructor
	 * @param brand the television brand
	 * @param size the size of the television screen
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	/**
	 * sets the television channel
	 * @param station the channel to be set to
	 */
	public void setChannel(int station) {
		channel = station;
	}
	
	/**
	 * turns the television on or off
	 */
	public void power() {
		powerOn = !powerOn;
	}
	
	/**
	 * increases volume by 1
	 */
	public void increaseVolume() {
		volume++;
	}
	
	/**
	 * decreases volume by 1
	 */
	public void decreaseVolume() {
		if (volume > 0)
			volume--;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
