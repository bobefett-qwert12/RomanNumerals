public class RomanNumerals {
    private int ones;
    private int tens;
    private int hundreds;
    private int thousands;

    /**
     * Constructs a new RomanNumerals object
     * @param ones the ones place of the number
     * @param tens the tens place of the number
     * @param hundreds the hundreds place of the number
     * @param thousands the thousands place of the number
     */
    public RomanNumerals(int ones, int tens, int hundreds, int thousands) {
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
        this.thousands = thousands;
    }

    /**
     * Gets the Roman ones place of the number
     * @return the Roman ones place
     */
    public String getRomanOnes() {
        String romanOnes;
        switch(this.ones){
            case 1:
                romanOnes = "I";
                break;
            case 2:
                romanOnes = "II";
                break;
            case 3:
                romanOnes = "III";
                break;
            case 4:
                romanOnes = "IV";
                break;
            case 5:
                romanOnes = "V";
                break;
            case 6:
                romanOnes = "VI";
                break;
            case 7:
                romanOnes = "VII";
                break;
            case 8:
                romanOnes = "VIII";
                break;
            case 9:
                romanOnes = "IX";
                break;
            default:
                romanOnes = "";
                break;
        }
        return romanOnes;
    }

    /**
     * Gets the Roman tens place of the number
     * @return the Roman tens place
     */
    public String getRomanTens() {
        String romanTens;
        switch(this.tens){
            case 10:
                romanTens = "X";
                break;
            case 20:
                romanTens = "XX";
                break;
            case 30:
                romanTens = "XXX";
                break;
            case 40:
                romanTens = "XL";
                break;
            case 50:
                romanTens = "L";
                break;
            case 60:
                romanTens = "LX";
                break;
            case 70:
                romanTens = "LXX";
                break;
            case 80:
                romanTens = "LXXX";
                break;
            case 90:
                romanTens = "XC";
                break;
            default:
                romanTens = "";
                break;
        }
        return romanTens;
    }

    /**
     * Gets the Roman hundreds place of the number
     * @return the Roman hundreds place
     */
    public String getRomanHundreds() {
        String romanHundreds;
        switch(this.hundreds){
            case 100:
                romanHundreds = "C";
                break;
            case 200:
                romanHundreds = "CC";
                break;
            case 300:
                romanHundreds = "CCC";
                break;
            case 400:
                romanHundreds = "CD";
                break;
            case 500:
                romanHundreds = "D";
                break;
            case 600:
                romanHundreds = "DC";
                break;
            case 700:
                romanHundreds = "DCC";
                break;
            case 800:
                romanHundreds = "DCCC";
                break;
            case 900:
                romanHundreds = "CM";
                break;
            default:
                romanHundreds = "";
                break;
        }
        return romanHundreds;
    }

    /**
     * Gets the Roman thousands place of the number
     * @return the Roman thousands place
     */
    public String getRomanThousands() {
        String romanThousands;
        switch(this.thousands){
            case 1000:
                romanThousands = "M";
                break;
            case 2000:
                romanThousands = "MM";
                break;
            case 3000:
                romanThousands = "MMM";
                break;
            default:
                romanThousands = "";
                break;
        }
        return romanThousands;
    }
}
