public class GameApp{
public static void main(String[] args){
  Character knight = new Character(CharacterType.knight, new SwordAttack(), new Shield());
    knight.attack();
    knight.defend();

    Character wizard = new Character(CharacterType.wizard, new SpellAttack(),new Magic());
    wizard.attack();
    wizard.defend();

    Character archer = new Character(CharacterType.archer, new ArrowAttack(), new Dodge());
    archer.attack();
    archer.defend();
   
}
}

