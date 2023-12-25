import Task1.Inventory;

public class Main {
            public static void main(String[] args) {
                Inventory inventory = new Inventory();


                try {
                    inventory.addItem("Кирпич", 100);
                    inventory.addItem("Молоток", 5);
                    inventory.addItem("Перчатки", 5);

                    System.out.println("Inventory: " + inventory.getItems());

                    inventory.removeItem("Кирпич", 3);
                    inventory.removeItem("Перчатки", 2);

                    System.out.println("Инветарь после удаления: " + inventory.getItems());

                    System.out.println("есть ли кирпичи " + inventory.checkItem("Кирпич"));
                    System.out.println(" есть ли Перчатки " + inventory.checkItem("Перчатки"));

                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

