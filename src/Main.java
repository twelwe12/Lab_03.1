void main(){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt();
    double y;
    double A;
    double B = 0;

    A = 13.5 - 2 * x;

    if (x <= -1) B = Math.exp(0.4 + x);
    if (x > -1 && x < 1) B = 1 - Math.pow(Math.sin(x), 2);
    if (x >= 1) B = Math.cos(x) / (Math.pow(Math.sin(x), 2));

    y = A - B;
    System.out.println(y);

    //Cпосіб 2
    if (x <= -1) B = Math.exp(0.4 + x);
    else {
        if (x > -1 && x < 1) B = 1 - Math.pow(Math.sin(x), 2);
        else {
            if (x >= 1) B = Math.cos(x) / (Math.pow(Math.sin(x), 2));
        }
    }

    y = A - B;
    System.out.println(y);
}