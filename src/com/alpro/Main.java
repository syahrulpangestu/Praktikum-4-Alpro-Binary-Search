package com.alpro;

import java.util.*;

class Sort{
    void bubbleSort(String[][] arr) {
        int i, j;
        int n = arr.length, m = arr.length;
        String temp;

        for (i = 0; i < n * m - 1; ++i) {
            for (j = 0; j < n * m - 1 - i; ++j) {
                if (arr[j / m][j % m].compareTo(arr[(j + 1) / m][(j + 1) % m]) > 0) {
                    temp = arr[(j + 1) / m][(j + 1) % m];
                    arr[(j + 1) / m][(j + 1) % m] = arr[j / m][j % m];
                    arr[j / m][j % m] = temp;
                }
            }
        }
    }

    void display(String[][] arr) {
        int i, j;
        int n = arr.length, m = arr.length;
        for (i = 0; i < n; ++i) {
            for (j = 0; j < m; ++j) {
                System.out.print((arr[i][j])+" ");
            }
            System.out.println();
        }
    }

}

class BinarySearch{
    public void search(String[][] arr, String huruf){
        int n = arr.length, m = arr[0].length;
        int start=0, end=(n*m)-1;
        int tengah;
        while (start!=end){
            tengah = (start+end-1)/2;
            if (arr[tengah/m][tengah%m].compareTo(huruf)<0){
                start = tengah+1;
            }else {
                end = tengah;
            }
        }
        if(arr[end / m][end % m].equals(huruf))
            System.out.println("["+end / m+","+end % m+"]");
        else
            System.out.println("tida ketemu");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cari;
        String[][] nama = {
                {"aaa","bbb","ccc","ddd","eee"},
                {"fff","ggg","hhh","iii","jjj"},
                {"kkk","lll","mmm","nnn","ooo"},
                {"ppp","qqq","rrr","sss","ttt"},
                {"uuu","vvv","www","xxx","yyy"}};
        Sort sort = new Sort();
        sort.bubbleSort(nama);
        sort.display(nama);

        BinarySearch binarySearch = new BinarySearch();
        System.out.print("Masukan nama yang dicari : ");
        cari = scanner.nextLine();
        System.out.print("Hasilnya : ");
        binarySearch.search(nama, cari);
    }
}
