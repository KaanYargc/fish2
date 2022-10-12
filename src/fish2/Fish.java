package fish2;

public class Fish {
	private String name;
	private String type;
	private String features;
	public Fish() {
		super();
	}
	public Fish(String name, String type, String features) {
		super();
		this.name = name;
		this.type = type;
		this.features = features;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	
	
}