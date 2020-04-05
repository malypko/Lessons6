import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Определяем количество пользовтелей
        int k;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пользователей: ");
        k = in.nextInt();
        String[] user = new String[k];
        String nick = new String();
        for (int i = 0; i < user.length; i++) {
            System.out.println("Введите имя пользователя " + i +" : ");
            nick = in.next();
            user[i] = nick;
            System.out.println(user[i]);
        }
        User Max = new User();
        System.out.println(Max.nickname);
        Max.nickname = user[0];
        System.out.println(Max.nickname);

        User Lena = new User("Lena", 23);
        System.out.println(Lena.nickname + " " + Lena.age);
    }
}

