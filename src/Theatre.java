public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor claudia = new Actor("Клаудия", "Муцио", Gender.FEMALE, 177);
        Actor matilda = new Actor("Матильда", "Кшесинская", Gender.FEMALE, 153);
        Actor alisa = new Actor("Алиса", "Фрейндлих", Gender.FEMALE, 153);
        Director ordynski = new Director("Рышард", "Ордынский", Gender.MALE, 102);
        Director tovstonogov = new Director("Георгий", "Товстоногов", Gender.MALE, 175);
        Show drama = new Show("Встреча", 90, tovstonogov);
        drama.addActor(alisa);
        drama.printActors();
        Person verdi = new Person("Джузеппе", "Верди", Gender.MALE);
        Opera opera = new Opera("Аида", 150, ordynski, verdi, "История Аиды и Радамеса", 30);
        opera.addActor(claudia);
        opera.printActors();
        opera.printLibrettoText();
        Person glazunov = new Person("Александр", "Глазунов", Gender.MALE);
        Person petipa = new Person("Мариус", "Петипа", Gender.MALE);
        Ballet ballet = new Ballet("Времена года", 40, tovstonogov, glazunov, "Смена времён года", petipa);
        ballet.addActor(matilda);
        ballet.addActor(matilda);
        ballet.printActors();
        drama.replaceActor(claudia, "Фрейндлих");
        drama.printActors();
        opera.printActors();
        ballet.replaceActor(alisa, "Муцио");
        ballet.printActors();
        ballet.printLibrettoText();
    }

}
