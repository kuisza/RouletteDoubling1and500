import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bedaa on 29/03/2017.
 */
public class MainClass {

    public static void main(String[] args) throws IOException{
        RouletteKiller killer = new RouletteKiller();
        final PrintWriter out1 = new PrintWriter("result1.csv");
        final PrintWriter out2 = new PrintWriter("result2.csv");
        final PrintWriter out3 = new PrintWriter("result3.csv");
        final PrintWriter out4 = new PrintWriter("result4.csv");
        final PrintWriter out5 = new PrintWriter("result5.csv");

        out1.write("Starting Budget;Spins;SpinsNoBet;SpinsBet;Double;Spins when it was doubled;"
                + "Bets when it was doubled;MaxBudget;Spins when it reached max;Bets when it reached max" + "\n");
        for (int n = 1 ; n < 501; n++) {
            out1.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out1.close();

        out2.write("Starting Budget;Spins;SpinsNoBet;SpinsBet;Double;Spins when it was doubled;"
                + "Bets when it was doubled;MaxBudget;Spins when it reached max;Bets when it reached max" + "\n");

        for (int n = 1 ; n < 501; n++) {
            out2.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out2.close();

        out3.write("Starting Budget;Spins;SpinsNoBet;SpinsBet;Double;Spins when it was doubled;"
                + "Bets when it was doubled;MaxBudget;Spins when it reached max;Bets when it reached max" + "\n");

        for (int n = 1 ; n < 501; n++) {
            out3.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out3.close();

        out4.write("Starting Budget;Spins;SpinsNoBet;SpinsBet;Double;Spins when it was doubled;"
                + "Bets when it was doubled;MaxBudget;Spins when it reached max;Bets when it reached max" + "\n");

        for (int n = 1 ; n < 501; n++) {
            out4.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out4.close();

        out5.write("Starting Budget;Spins;SpinsNoBet;SpinsBet;Double;Spins when it was doubled;"
                + "Bets when it was doubled;MaxBudget;Spins when it reached max;Bets when it reached max" + "\n");

        for (int n = 1 ; n < 501; n++) {
            out5.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out5.close();
    }
}
