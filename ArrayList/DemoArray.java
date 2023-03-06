package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DemoArray {
    public static void main(String[] args) {
        /**
         * tạo và thêm phần tử
         */
        List<String> array = new ArrayList<>();
        array.add("Hà nội");
        array.add("Hải phòng");
        array.add("Hà Tĩnh");
        array.add("Bắc Ninh");
        array.add("Hải dương");

        System.out.println(array);
        array.add(2,"Nghệ An");
        System.out.println(array);

        /**
         * sửa
         */
        array.set(3, "Thanh Hóa");
        System.out.println(array);
        /**
         * Xóa
         */
        array.remove(4);
        System.out.println(array);
        /***
         * xóa dùng removeif
         */
        array.removeIf(n -> (n.charAt(0) == 'T'));
        System.out.println(array);

        /**
         *Thêm list mới
         */
        List<String> arrayNumber = new ArrayList<>();
        arrayNumber.add("Hải phòng");
        arrayNumber.add("Hải dương");

        array.removeAll(arrayNumber);
        System.out.println(array);

        /**
         * Xóa
         */
        array.remove(1);
        System.out.println(array);

        /**
         * clear
         */
        array.clear();
        System.out.println("Xóa \"Hà nội\" :" + array);
    }
}
