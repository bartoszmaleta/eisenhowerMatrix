package app;

public class ClassForTestingMethods {
    public static void main(String[] args) {
        // # \033[0;34m --------------> blue
        // # \033[0;34;44m --------------> blue + background blue
        // # \033[0;33m --------------> yellow, almost brown
        // # \033[0;35m --------------> magenta
        // # \033[0;32m --------------> green
        // # \033[1;31m --------------> red
        // # \033[1;31m --------------> red
        // # \033[1;31;41m --------------> red + background red
        // # \033[1;30m --------------> black font
        // # \033[0;40m --------------> black background
        // # \033[0;42m --------------> green background
        // # \033[0;32;42m --------------> green background
    }
}