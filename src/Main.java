public class Main {
    public static void main(String[] args) {
        String phone = "06 84 15 75 37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Phone number to long !");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Phone number to short !");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Unvalide phone number");
        }
        System.out.println("Phone: " + "+33" + phone);
        String expectedPhone = "79604157537";
          // Записываем строку expectedPhone («ожидаемыйТелефон»)
        if (phone.equals(expectedPhone)) {
          // Сравниваем phone с expectedPhone с помощью метода equals()
            System.out.println("Succes");
        } else {
            System.out.println("Fail");
        }
        // Permet de trier/ajouter et avertir en cas d'erreur
        // throw new RuntimeException : permet de couper le programme en cas de condition non remplie

        task1();
        task2();
        task3();


    }

    public static void task1(){
        System.out.println("Task 1: ");
        String employName = "Ivan";
        String employPatronyme = "Ivanovitch";
        String sername = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("The full name of the employe is: " + employPatronyme + " " + employName + " "  + sername);

    }

    public static void task2() {
        System.out.println("Task 2: ");
        String employName = "Ivan";
        String employPatronyme = "Ivanov";
        String sername = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("Her is the the full name of the employe for the document: " + employPatronyme.toUpperCase() + " " + employName.toUpperCase() + " "  + sername.toUpperCase() );

    }

    public static void task3() {
        System.out.println("Task 3: ");
        System.out.println();

        String fullName = "Ivanov Sémyon Sémyonovich";
        fullName = fullName.replace("é", "e");

        System.out.println("The the full name of the employe is: " + fullName);


    }
}

