package fish2;

public class Aquarium {
private String aquarium;
public Aquarium() {
	super();
}
private String features;
public Aquarium(String aquarium, String features) {
	super();
	this.aquarium = aquarium;
	this.features = features;
}
public String getAquarium() {
	return aquarium;
}
public void setAquarium(String aquarium) {
	this.aquarium = aquarium;
}
public String getFeatures() {
	return features;
}
public void setFeatures(String features) {
	this.features = features;
}

}