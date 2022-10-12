package fish2;

public class Main {

	public static void main(String[] args) {
		Fish fs=new Fish();
		Rod rod=new Rod();		
		Bait bait=new Bait();
		Aquarium aq1=new Aquarium();
		
		fs.setName("Deniz Fili");
	    fs.setFeatures("Vücut yanlardan yassýlaþmýþ, füze þeklinde zeytin yeþili renkli olup yanal çizginin üstü beyaz halkalarla çevrili kýrmýzý beneklidir. Kýrmýzý beneklerin beyaz halkalý ve siyah beneklerin yan çizginin altýna inmesi ile diðer alt türlerden ayrýlýr.");
		
	    rod.setName("Discovery");
		rod.setFeatures("Discovery Baþlangýç Seti Yeni Dft Racer 360CM 100-150GR Charisma Silver Misinalý ");
	
		bait.setName("Ozzy Insect");
		bait.setFeatures("Ozzy Insect Nature Balýk Yemi 250 ML");
		aq1.setAquarium("Kanki");
		aq1.setFeatures("Kanki Flex Akvaryum 34Lt Siyah");
			System.out.println(rod.getName()+" : "+rod.getFeatures());
		System.out.println(fs.getName()+" : "+fs.getFeatures());
		System.out.println(bait.getName()+" : "+bait.getFeatures());
		System.out.println(aq1.getAquarium()+" : "+aq1.getFeatures());
		
        
	
	
	}
	

}
