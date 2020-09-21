import java.util.Scanner;
import java.io.*;
public class WonderRunner{
	public static void main(String[]args)throws IOException{

	}
	public void play(ArrayList<Card>deck,Player a,Player b,Player c){
		ArrayList<Card>stack1,stack2,stack3=new ArrayList<Card>();
		Collections.shuffle(deck);
		while(deck.size()>14)
			stack1.add(deck.remove(0));
		while(deck.size()>7)
			stack2.add(deck.remove(0));
		while(deck.size()>0)
			stack3.add(deck.remove(0));
		int count=7;
		while(count>0){
			System.out.println("Player 1: stone-"+a.get("stone")+",ore-"+a.get("ore")+",wood-"+a.get("wood")+",clay-"+a.get("clay")+",glass-"+a.get("glass")
			+",clothe-"+a.get("clothe")+",papyrus-"+a.get("papyrus")+",militaryVictories-"+a.get("militayVictories")+",victoryPoints-"+a.get("victoryPoints")
			+",coins-"+a.get("coins")+",math-"+a.get("math")+",science-"+a.get("science")+",literature-"+a.get("literature")+",miliatries-"+a.get("miliatries"))
			System.out.println();
			int i=0;
			while(i<stack1.size()){
				if(stack1.get(i).hasTwo()&&stack1.get(i).hasCoins()&&a.get("coins")>=stack1.get(i).getCoinCost())
					System.out.println(i+",Play "+stack1.get(i).getName()+" for "+stack1.get(i).getCoinCost()+" getting "+stack1.get(i).getFirstGive()+" or "+stack1.get(i).getSecondaryGive());
				else if(stack1.get(i).hasTwo()&&contains(a,stack1.get(i).getStrCost()))
					System.out.println(i+",Play "+stack1.get(i).getName()+" for "+stack1.get(i).getStrCost()+" getting "+stack1.get(i).getFirstGive()+" or "+stack1.get(i).getSecondaryGive());
				else if(stack1.get(i).hasCoins()&&a.get("coins")>=stack1.get(i).getCoinCost())
					System.out.println(i+",Play "+stack1.get(i).getName()+" for "+stack1.get(i).getCoinCost()+" getting "+stack1.get(i).getFirstGive());
				else if(contains(a,stack1.get(i).getStrCost()))
					System.out.println(i+",Play "+stack1.get(i).getName()+" for "+stack1.get(i).getStrCost()+" getting "+stack1.get(i).getFirstGive());
				else
					System.out.println();
				i++;
			}
			i=0;
			while(i<stack1.size()){
				System.out.println(i+stack1.size()+", Discard "+stack1.get(i).getName());
				i++;
			}
			System.out.println(stack1.size()*2+", Get 1 "+b.getWonder().getResource()+" from left player");
			System.out.println(((stack1.size()*2)+1)+", Get 1 "+c.getWonder().getResource()+" from right player");
			if(a.get(a.getWonder().getRequirement().subString(2))>=Integer.parseInt(a.getWonder().getRequirement().subString(0,1)))
				System.out.println("Build a wonder");
			int wat=sc.nextInt();
			if(wat=>stack1.size()&&wat<stack1.size()*2)
				stack1.remove(wat);
			else if(wat==stack1.size()*2){
				a.add(b.getWonder().getResource(),1);
				a.add("coins",-2);
			}
			else if(wat==(stack1.size()*2)+1){
				a.add(c.getWonder().getResource(),1);
				a.add("coins",-2);
			}
			else if(wat==(stack1.size()*2)+2){
				int wo=Integer.parseInt(a.getWonder().getRequirement().subString(0,1))-(Integer.parseInt(a.getWonder().getRequirement().subString(0,1))*);
				a.add(a.get(a.getWonder().getRequirement().subString(2)),wo);
			}
			else{
				if(stack1.get(wat).getCharacteristic().equals("))
			}
		}
	}
	public boolean containing(Player a,String cost){
		if(cost.contains("/")){
			String[] list=cost.split("/");
			if(cost.contains("2"))//2 first, more than 3
				if(a.get(list[0].subString(2))>=2&&a.get(list[1])>=1)
					return true;
			else if(list.length==2)
				if(a.get(list[0])>=1&&a.get(list[1])>=1)
					return true;
			else
				if(a.get(list[0])>=1&&a.get(list[1])>=1&&a.get(list[2])>=1)
					return true;
		}
		else if(cost.contins("3"))
			if(a.get(cost.subString(2))>=3)
				return true;
		else if(cost.equals("free"))
			return true;
		else
			if(a.get(cost)>=1)
				return true;
		return false;
	}
}