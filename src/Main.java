public class Main
{
    public static void main(String[] args)
    {
        String pParty = "D";

        if(pParty == "D")
        {
            System.out.println("You are a Democratic Donkey!");
        }
        else if (pParty == "R")
        {
            System.out.println("You are Republican Elephant");
        }
        else if (pParty == "I")
        {
            System.out.println("You are an independent person");
        }
        else if (pParty != "D" || pParty != "R"|| pParty != "I")
        {
            System.out.print("I'm sorry, I don't know wht you are");
        }
    }
}