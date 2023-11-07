/*
V = 17
C3 = String
C17 = Знайти найбільшу кількість речень заданого тексту, в яких є однакові
слова.

Створити клас, який складається з виконавчого методу, що виконує дію текстовим рядком (п.3),
    тип якого визначено варіантом (п.2) - String.
Необхідно обробити всі виключні ситуації, що можуть виникнути під час виконання програмного коду.
Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
*/
public class Main {
    public static void main(String[] args) {
        String text = "1 2 3, 3 2 1. 4 5 45. abc, aBc .";

        int Counter = 0;

        String[] strings = text.split("\\."); //масив речень в тексті
        for(String string : strings){

            String[] words = string.split("[\\s:;,]"); //масив слів в речені
            int CounterUniqueWordsInString = 0;

            for(int i = 0; i < words.length; i++){
                for(int j = i+1; j < words.length; j++){
                   if(words[i].equalsIgnoreCase(words[j])) {
                       CounterUniqueWordsInString++;
                   }
                }
            }
            if(CounterUniqueWordsInString>0) Counter++;
        }
        System.out.println("Кількість речень заданого тексту, в яких є однакові слова: "+ Counter);
    }
}