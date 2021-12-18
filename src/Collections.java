//Написать программу, удаляющую из вещественного массива A размерности N «лишние» элементы так,
//чтобы оставшиеся элементы оказались упорядоченными по возрастанию (начиная от первого
//элемента): первый элемент не удаляется, второй элемент удаляется, если он меньше первого, третий —
//если он меньше предыдущего элемента, оставленного в массиве, и т. д. Например, массив 5.5, 2.5, 4.6,
//7.2, 5.8, 9.4 должен быть преобразован к виду 5.5, 7.2, 9.4. а экран должны выводиться как
//оригинальное состояние массива, так и итоговое.

//после последнего введенного числа нужно нажать энтер, тогда создатся список

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Collections {
    // создаем список чисел
    public static void main(String[] arg) throws IOException /*throws IOException */ {
        System.out.println("Введите числа в коллекцию");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Float> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Float.parseFloat(s));
        }
        System.out.println(list);
        long k =list.stream().count();
       int jmax = 0;
        for(int i = 0; i<k-1;i=i+1) /* колво итераций которое повторится в цикле*/{
           if (list.get(jmax) >= list.get(jmax + 1)) {
                list.remove(jmax + 1);
            } else {
               jmax= jmax+1;
           }

        }
        System.out.println(list);

            }

    }


