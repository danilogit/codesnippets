
    public static String progresBar(double current, float total)
    {
        int bar_width = 50;
        String ch = "#";
        String bar = "";

        double bar_length =  (current / total * bar_width);

        for(int i =0; i< bar_length; i++)
            bar = bar + ch;

        for(int i =0; i< (bar_width - bar_length); i++)
            bar = bar + ".";

        String status = "Enviando";
        if(current == total)
            status = "Completo";

        return  String.format("[%s] %s %s/%s bytes (%s)\r" , bar,  (bar_length / bar_width * 100), current, total, status);
    }

