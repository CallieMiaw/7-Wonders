public class Card{
	private String name,characteristic,firstGive,secondaryGive,strCost,combo="";
	private int coinCost=0;
	private boolean hasTwo,hasCoins=false;
	public Card(String name,String characteristic,String give,String cost,String combo){
		this.name=name;
		this.characteristic=characteristic;
		firstGive=give;
		strCost=cost;
		this.combo=combo;
	}
	public Card(String name,String characteristic,String give,String give2,String cost,String combo){
		this.name=name;
		this.characteristic=characteristic;
		firstGive=give;
		secondaryGive=give2;
		hasTwo=true;
		strCost=cost;
		this.combo=combo;
	}
	public Card(String name,String characteristic,String give,int cost,String combo){
		this.name=name;
		this.characteristic=characteristic;
		firstGive=give;
		coinCost=cost;
		hasCoins=true;
		this.combo=combo;
	}
	public Card(String name,String characteristic,String give,String give2,int cost,String combo){
		this.name=name;
		this.characteristic=characteristic;
		firstGive=give;
		secondaryGive=give2;
		hasTwo=true;
		coinCost=cost;
		hasCoins=true;
		this.combo=combo;
	}
	public String getName(){return name;}
	public String getCharacteristic(){return characteristic;}
	public String getFirstGive(){return firstGive;}
	public String getSecondaryGive(){return secondaryGive;}
	public String getStrCost(){return strCost;}
	public int getCoinCost(){return coinCost;}
	public boolean hasTwo(){return hasTwo;}
	public boolean hasCoins(){return hasCoins;}
}