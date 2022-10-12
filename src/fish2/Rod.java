

package fish2;

public class Rod {
	private String name;
    private String features;
	public Rod() {
		super();
	}
	public Rod(String name, String features) {
		super();
		this.name = name;
		this.features = features;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

}