package Equipment;

public class Weapon extends Item{
	private int damage;
	private int lifesteal;
	private int crit;
	
	Weapon(String name,String description,int damage,int lifesteal,int crit) {
		super(name,description);
		this.damage = damage;
		this.lifesteal = lifesteal;
		this.crit = crit;
	}
	
	public int getDamage() {
		return damage;
	}

	public int getLifesteal() {
		return lifesteal;
	}

	public int getCrit() {
		return crit;
	}
	
	public void equipItem(??? assignedCharacter) {
		assignedCharacter.increaseAttack(damage);
		assignedCharacter.increaseLifesteal(lifesteal);
		assignedCharacter.increaseCritical(crit);
	}
	
	public String toString() {
		return "You equip" + name + "already.";
	}
	
}