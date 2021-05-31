package me.brucephillips;

/**
 * Run the application - must provide
 * value for name as first argument.
 */
public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.printf("You must provide 1 argument for the name value.\n");
            System.exit(1);
        }

        String name = args[0];

        Main main = new Main();

        main.run(name);
    }

    private void run(String name) {

        System.out.printf("Hello %s\n", name);

    }
}
