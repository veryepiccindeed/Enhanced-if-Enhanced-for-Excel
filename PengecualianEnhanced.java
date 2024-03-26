public class PengecualianEnhanced {
    public static void main(String[] args) {
        // Pengecualian untuk enhanced for loop
        int[] numbers = {1, 2, 3, 4, 5}; // Membuat array numbers dengan 5 elemen
        for (int number : numbers) { // Looping melalui setiap elemen dalam array numbers
            if (number == 3) { // Memeriksa apakah nilai elemen saat ini adalah 3
                numbers[0] = 100; // Mengubah nilai elemen pertama menjadi 100 jika nilai elemen saat ini adalah 3
                // Ini akan mengubah nilai 1 menjadi 100, dan merupakan modifikasi struktural yang berbahaya dalam looping for-each
                // Modifikasi struktural dalam enhanced for loop dapat menyebabkan ConcurrentModificationException
            }
            System.out.println(number); // Mencetak nilai elemen saat ini ke konsol
        }

        // Pengecualian untuk enhanced if
        // Pengecualian untuk enhanced if
        int x = 5; // Mendefinisikan variabel x dengan nilai 5
        int y = 10; // Mendefinisikan variabel y dengan nilai 10
        // int result = (x > y) ? x : y; // Error: enhanced if tidak cocok untuk kasus ini
        // Enhanced if digunakan untuk ekspresi sederhana dengan dua kemungkinan nilai kembali
        // Namun, dalam kasus ini, kita memiliki lebih dari dua kemungkinan hasil karena kita perlu menetapkan nilai ke variabel result berdasarkan suatu kondisi
        int result; // Mendeklarasikan variabel result
        if (x > y) { // Memeriksa apakah x lebih besar dari y
            result = x; // Jika ya, tetapkan nilai x ke result
        } else {
            result = y; // Jika tidak, tetapkan nilai y ke result
        }
        System.out.println("Result: " + result); // Mencetak nilai result ke konsol
    }
}

