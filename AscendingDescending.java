public static int[] sort3Ascending(int a, int b, int c) {

    if (a > b) {
        int temp = a;
        a = b;
        b = temp;
    }
    if (a > c) {
        int temp = a;
        a = c;
        c = temp;
    }
    if (b > c) {
        int temp = b;
        b = c;
        c = temp;
    }

    return new int[]{a, b, c};
}

void main() {

    Scanner input = new Scanner(System.in);

    IO.print("Enter first integer: ");
    int a = input.nextInt();

    IO.print("Enter second integer: ");
    int b = input.nextInt();

    IO.print("Enter third integer: ");
    int c = input.nextInt();

    int[] sorted = sort3Ascending(a, b, c);

    IO.println("Ascending: " + sorted[0] + " " + sorted[1] + " " + sorted[2]);
    IO.println("Descending: " + sorted[2] + " " + sorted[1] + " " + sorted[0]);

    input.close();
}