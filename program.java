import java.util.HashMap;
import java.util.Map;

/* 
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

public class program{

    public class Notebook {
        String id;
        int ram;
        int hardDrive;
        String os;
        String color;
    }

    public static Map InputNotebook(Map<String, List<Notebook>> NotebookList){
        Notebook tmp_Notebook = new Notebook();
        System.out.println("Введите название ноутбука: ");
        String name = ScannerString();
        tmp_Notebook.id = name;
        System.out.println("Введите ОЗУ ноутбука в Гб: ");
        tmp_Notebook.ram = ScannerInt();
        System.out.println("Введите объём памяти жёсткого диска ноутбука в Гб: ");
        tmp_Notebook.hardDrive = ScannerInt();
        System.out.println("Введите ОС ноутбука: ");
        tmp_Notebook.os = ScannerString();
        System.out.println("Введите цвет ноутбука: ");
        tmp_Notebook.color = ScannerString();
        NotebookList.put("name", tmp_Notebook);
        return NotebookList;
    }

    public static Map GetCriteria(){
        Map<String, String> criteria = new HashMap<>();
        System.out.println("Вводите по очереди значения критерия, если критерий не важен, вводите 'any'");
        System.out.println("ОЗУ: ");
        criteria.put("ram", ScannerString());
        System.out.println("Объём памяти жёсткого диска: ");
        criteria.put("hardDrive", ScannerString());
        System.out.println("ОС: ");
        criteria.put("os", ScannerString());
        System.out.println("Цвет: ");
        criteria.put("color", ScannerString());
        return criteria;
    }

    public static List<Notebook> Filtr(Map criteries, Map NotebookList){
        List<Notebook> result = new List<Notebook>();
        for (Map.Entry<String, String> set : NotebookList.entrySet()){
            if (set.ram.get() == criteries.get('1')){
                put.result(set);
            }
        }
    }

    public static String ScannerString(){
        java.util.Scanner scanner = new java.util.Scanner(System.in)
        String scanned = scanner.nextLine();
        return scanned;
    }

    public static int ScannerInt(){
        java.util.Scanner scanner = new java.util.Scanner(System.in)
        int scanned = scanner.nextInt();
        return scanned;
    }


}