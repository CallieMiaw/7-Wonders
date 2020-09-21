import java.util.ArrayList;
import java.util.HashMap;
public class Player{
	private HashMap<String,Integer>stats=new HashMap<String,Integer>();
	private ArrayList<Card> marketDeck,civilianDeck,scientificDeck,artisanDeck,militaryDeck,resourceDeck,guildDeck=new ArrayList<Card>();
	private String name="";
	private Wonder wonder;
	public Player(){
		stats.put("stone",0);
		stats.put("ore",0);
		stats.put("wood",0);
		stats.put("clay",0);
		stats.put("glass",0);
		stats.put("clothe",0);
		stats.put("papyrus",0);
		stats.put("militaryVictories",0);
		stats.put("victoryPoints",0);
		stats.put("coins",3);
		stats.put("math",0);
		stats.put("science",0);
		stats.put("literature",0);
		stats.put("militaries",0);
	}
	public int get(String a){return stats.get(a);}
	public String getName(){return name;}
	public Wonder getWonder(){return wonder;}
	public boolean isCardInDeck(String combo,String characteristic){
		if(characteristic.equals("market")){for(Card a:marketDeck){if(a.getName().equals(combo)){return true;}}}
		else if(characteristic.equals("civilian")){for(Card b:civilianDeck){if(b.getName().equals(combo)){return true;}}}
		else if(characteristic.equals("scientific")){for(Card c:scientificDeck){if(c.getName().equals(combo)){return true;}}}
		else if(characteristic.equals("artisan")){for(Card d:artisanDeck){if(d.getName().equals(combo)){return true;}}}
		else if(characteristic.equals("military")){for(Card e:militaryDeck){if(e.getName().equals(combo)){return true;}}}
		else if(characteristic.equals("resource")){for(Card f:resourceDeck){if(f.getName().equals(combo)){return true;}}}
		else{for(Card g:guildDeck){if(g.getName().equals(combo)){return true;}}}
		return false;
	}
	public void add(String a,int b){stats.put(a,stats.get(a)+b);}
	public void addCard(Card a,String characteristic){
		if(characteristic.equals("market")){marketDeck.add(a);}
		else if(characteristic.equals("civilian")){civilianDeck.add(a);}
		else if(characteristic.equals("scientific")){scientificDeck.add(a);}
		else if(characteristic.equals("artisan")){artisanDeck.add(a);}
		else if(characteristic.equals("military")){militaryDeck.add(a);}
		else if(characteristic.equals("resource")){resourceDeck.add(a);}
		else{guildDeck.add(a);}
	}
}