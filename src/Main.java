import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String compStringOne = "10";
        ArbitraryInteger arbInt = new ArbitraryInteger(compStringOne);
        BigInteger bigInt = new BigInteger(compStringOne);
        long startTime;
        long stopTime;
        long arbIntTime = 0;
        long bigIntTime = 0;
        for (int i = 1; i < 50; i++) {
            startTime = System.nanoTime();
            arbInt = arbInt.subtract(new ArbitraryInteger(compStringOne));
            stopTime = System.nanoTime();
            System.out.println("ArbInt: " + (stopTime - startTime) + "ms");
            arbIntTime += (stopTime - startTime);

            startTime = System.nanoTime();
            bigInt = bigInt.subtract(new BigInteger(compStringOne));
            stopTime = System.nanoTime();
            System.out.println("BigInt: " + (stopTime - startTime) + "ms");
            bigIntTime += (stopTime - startTime);

            System.out.println("arbInt average time: " + arbIntTime + "\n" +
                               "bigInt average time: " + bigIntTime + "\n" +
                               "              Ratio: " + (float) (bigIntTime / i) / (float) (arbIntTime / i) + "\n");

            if (bigInt.toString().equals(arbInt.toString())){
                System.out.println("arbInt == bigInt\nValue length: " + arbInt.toString().length() + "\n");
            }
            else {
                System.out.println("Discrepancy detected.\n" + arbInt + " != " + bigInt + "\nValue length: " + arbInt.toString().length() + "\n");
            }
        }

    }
}
