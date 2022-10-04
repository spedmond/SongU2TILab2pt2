public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot("Bot", 69);

        //void
        bot.greeting("Edmond");
        bot.weather();
        bot.favoriteNumber(12);

        //non void
        System.out.println("129 feet converted into meters is " + bot.convertFeetToMeters(129));
        System.out.println("The sum of 1, 3 and 34343 is " + bot.addNumbers(1, 3, 34343));
        System.out.println(bot.goodbye());

        //new
        bot.petName("Jean");
        System.out.println("Your height from inches to feet and inches is " + bot.height(89));
    }
}
