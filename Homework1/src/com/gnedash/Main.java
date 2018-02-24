package com.gnedash;
/*
        БУДЬТЕ, ПОЖАЛУЙСТА, ОСТОРОЖНЫ!
        ТУТ МНОГО Г*ВН*КОДА!
        БЕРЕГИТЕ ГЛАЗА И НЕРВЫ.
        ВЕДЬ ГЛАВНОЕ НЕ КРАСОТА!
        ГЛАВНОЕ ТО, ЧТО ЭТО РАБОТАЕТ.
        :)
*/
import java.io.*;
import java.net.URL;

public class Main {

    private static void Download(String from, String to) throws IOException {
        URL url = new URL(from);
        BufferedInputStream Input = new BufferedInputStream(url.openStream());
        FileOutputStream Output = new FileOutputStream(to);
        byte[] buffer = new byte[1024];
        int count;
        while ((count = Input.read(buffer)) != -1)
            Output.write(buffer, 0, count);
        Input.close();
        Output.close();
    }

    private static void SearchingEquals(String str) {
        String colorA[] = new String[]{"aliceblue", "antiquewhite", "aqua", "aquamarine", "azure"};
        String colorB[] = new String[]{"beige", "bisque", "black", "blanchedalmond", "blue", "blueviolet", "brown", "burlywood"};
        String colorC[] = new String[]{"cadetblue", "chartreuse", "chocolate", "coral", "cornflowerblue", "cornsilk", "crimson", "cyan"};
        String colorD[] = new String[]{"darkblue", "darkcyan", "darkgoldenrod", "darkgray", "darkgreen", "darkkhaki", "darkmagenta", "darkolivegreen", "darkorange", "darkorchid", "darkred", "darksalmon", "darkseagreen", "darkslateblue", "darkslategray", "darkturquoise", "darkviolet", "deeppink", "deepskyblue", "dimgray", "dodgerblue"};
        String colorF[] = new String[]{"firebrick", "floralwhite", "forestgreen", "fuchsia"};
        String colorG[] = new String[]{"gainsboro", "ghostwhite", "gold", "goldenrod", "gray", "green", "greenyellow"};
        String colorH[] = new String[]{"honeydew", "hotpink"};
        String colorI[] = new String[]{"indianred", "indigo", "ivory"};
        String colorK[] = new String[]{"khaki"};
        String colorL[] = new String[]{"lavender", "lavenderblush", "lawngreen", "lemonchiffon", "lightblue", "lightcoral", "lightcyan", "lightgoldenrodyellow", "lightgreen", "lightgrey", "lightpink", "lightsalmon", "lightseagreen", "lightskyblue", "lightslategray", "lightsteelblue", "lightyellow", "lime", "limegreen", "linen"};
        String colorM[] = new String[]{"magenta", "maroon", "mediumaquamarine", "mediumblue", "mediumorchid", "mediumpurple", "mediumseagreen", "mediumslateblue", "mediumspringgreen", "mediumturquoise", "mediumvioletred", "midnightblue", "mintcream", "mistyrose", "moccasin"};
        String colorN[] = new String[]{"navajowhite", "navy"};
        String colorO[] = new String[]{"oldlace", "olive", "olivedrab", "orange", "orangered", "orchid"};
        String colorP[] = new String[]{"palegoldenrod", "palegreen", "paleturquoise", "palevioletred", "papayawhip", "peachpuff", "peru", "pink", "plum", "powderblue", "purple"};
        String colorR[] = new String[]{"red", "rosybrown", "royalblue"};
        String colorS[] = new String[]{"saddlebrown", "salmon", "sandybrown", "seagreen", "seashell", "sienna", "silver", "skyblue", "slateblue", "slategray", "snow", "springgreen", "steelblue"};
        String colorT[] = new String[]{"tan", "teal", "thistle", "tomato", "turquoise"};
        String colorV[] = new String[]{"violet"};
        String colorW[] = new String[]{"wheat", "white", "whitesmoke"};
        String colorY[] = new String[]{"yellow", "yellowgreen"};
        switch (str.charAt(0)) {
            case 'a':
                for (String aColorA : colorA) if (str.equals(aColorA)) System.out.println(str);
                break;
            case 'b':
                for (String aColorB : colorB) if (str.equals(aColorB)) System.out.println(str);
                break;
            case 'c':
                for (String aColorC : colorC) if (str.equals(aColorC)) System.out.println(str);
                break;
            case 'd':
                for (String aColorD : colorD) if (str.equals(aColorD)) System.out.println(str);
                break;
            case 'f':
                for (String aColorF : colorF) if (str.equals(aColorF)) System.out.println(str);
                break;
            case 'g':
                for (String aColorG : colorG) if (str.equals(aColorG)) System.out.println(str);
                break;
            case 'h':
                for (String aColorH : colorH) if (str.equals(aColorH)) System.out.println(str);
                break;
            case 'i':
                for (String aColorI : colorI) if (str.equals(aColorI)) System.out.println(str);
                break;
            case 'k':
                for (String aColorK : colorK) if (str.equals(aColorK)) System.out.println(str);
                break;
            case 'l':
                for (String aColorL : colorL) if (str.equals(aColorL)) System.out.println(str);
                break;
            case 'm':
                for (String aColorM : colorM) if (str.equals(aColorM)) System.out.println(str);
                break;
            case 'n':
                for (String aColorN : colorN) if (str.equals(aColorN)) System.out.println(str);
                break;
            case 'o':
                for (String aColorO : colorO) if (str.equals(aColorO)) System.out.println(str);
                break;
            case 'p':
                for (String aColorP : colorP) if (str.equals(aColorP)) System.out.println(str);
                break;
            case 'r':
                for (String aColorR : colorR) if (str.equals(aColorR)) System.out.println(str);
                break;
            case 's':
                for (String color : colorS) if (str.equals(color)) System.out.println(str);
                break;
            case 't':
                for (String aColorT : colorT) if (str.equals(aColorT)) System.out.println(str);
                break;
            case 'v':
                for (String aColorV : colorV) if (str.equals(aColorV)) System.out.println(str);
                break;
            case 'w':
                for (String aColorW : colorW) if (str.equals(aColorW)) System.out.println(str);
                break;
            case 'y':
                for (String aColorY : colorY) if (str.equals(aColorY)) System.out.println(str);
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        Download(args[0], args[1]);
        BufferedReader Input = new BufferedReader(new FileReader(args[1]));
        String s;
        StringBuilder ss = new StringBuilder();
        while ((s = Input.readLine()) != null) {
            s = s.replaceAll("[^A-Za-z]", " ").toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (ss.length() > 0) SearchingEquals(ss.toString());
                    ss = new StringBuilder();
                } else {
                    ss.append(s.charAt(i));
                }
            }
        }
        Input.close();
    }
}

