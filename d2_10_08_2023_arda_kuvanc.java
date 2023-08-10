
public class d2_10_08_2023_arda_kuvanc {
    public d2_10_08_2023_arda_kuvanc() {
    }

    public static void main(String[] args) {
        int bigNumber = 1;
        boolean isPrime = true;
        if (bigNumber <= 1) {
            System.out.print("invalid number");
        } else {
            for(int i = 2; i < bigNumber; ++i) {
                if (bigNumber % i == 0) {
                    isPrime = false;
                    break;
                }

                isPrime = true;
            }

            if (!isPrime) {
                System.out.print("BigNumber is not prime");
            } else {
                System.out.print("BigNumber is prime");
            }

        }
    }
}
