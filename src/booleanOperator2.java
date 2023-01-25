public class booleanOperator2 {
    /**
     * [A]: (55 != 55) && (false ^ true)
     * [B]: considering that a=true, b=false, int c=2 and char d='2': (!a || !b) || c == d )
     * [C]: false && true || false && !false
     * [D]: (false && true) || (false || true)
     *
     * [A]55 non è diverso da 55 (false) && false XOR true è (true) = false && true = false.
     * [B](false|| true) equivale a (true) || this part can't be done as "c" is an int  and  d is a string so equals woulnd't work this way
     * [C] false && true è (false) || false && diverso da false quindi , false && true è comunque (false)
     * [D] false && true ritorna anche qui (false), ||     false ||or true ritorna (true)siccome una è )true) e cè l'OR operator
     *
     * Riassunto
     *
     * [A]: false && true = false
     * [B]: true || not doable an Integer.parseInt(d) would be necessary first, in that case the boolean would return true, and a true||true would be = true
     * [C]: false || false = false
     * [D] false || true = true
     *
     */

    public static void main(String[] args) {


        boolean a =(55 != 55) && (false ^ true);
        boolean c =false && true || false && !false;
        boolean d = (false && true) || (false || true);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
