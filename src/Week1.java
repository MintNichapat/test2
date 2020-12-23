public class Week1 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("psvm -> Tab");
        System.out.println("sout -> Tab");
        System.out.printf("%d %d\n",15,20);

        double percent = 100/170 *25;
        System.out.println("percent");
        System.out.printf("%.2f\n",percent);

        for(int i = 1;i <= 10; i++){
            System.out.println(i);
        }

        //หาผลบวกเลขคู่ที่มีค่าตั้งเเต่ 1-100 โดยใช้ for loop
        int count = 0;
        for(int i = 1;i <= 100; i++){
            if(i%2==0){
                count +=i;
            }
        }
        System.out.println(count);
    }

}
