public class Character{
    CharacterType characterType = new CharacterType();
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    public Character( CharacterType characterType, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy){
       this.characterType = characterType;
        this.attackStrategy=attackStrategy;
        this.defenseStrategy=defenseStrategy;
    }
    public void attack(){
        attackStrategy.attack();
    }
    public void defend(){
     defenseStrategy.defend();
    }
    
}