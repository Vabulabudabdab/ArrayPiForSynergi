package com.example.arraypiforsynergi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


//    Необходимо разработать приложение, создающее массив из данных чисел и анализирующее данный массив:
//    определение количества цифр 3 и 5 в данном arr // Готово
//    выявление самой редкой цифры в массиве // от части
//    и отсортировать массив в обратном порядке // Готово
    private final double[] PI = {3,1415926536}; // Создаём массив типа double и помещаем туда число PI

    private TextView possibilityOut; // Поле цифр 3 и 5
    private TextView rare; // Самая редкая цифра и массив в обратном порядке

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rare = findViewById(R.id.rare); // вывод информации о редких цифрах в массиве
        possibilityOut = findViewById(R.id.arrOut); // вывод информации о массиве


        rare.setText("Редких цифр в массиве: " + uniqueCount());
        possibilityOut.setText("Информация о массиве в обратном порядке :" + "\n" + initArrReverse() + "\n" + "Цифр 3 и 5 найдено: " + thirdAndFive()); //Массив в обратном порядке
    }

    private String initArrReverse() { //Вывод в обратном порядке

        PI.toString();

        return new StringBuilder(Arrays.toString(PI)).reverse().toString();
    }


     int uniqueCount() { //Поиск уникальный значений в массиве PI
        int result = 0;
        int countUnique = 1;
        int count = 0;
        for (int i = 0; i < PI.length; i++) {
            countUnique++;
            for (int j = i + 1; j < PI.length; j++) {
                if (PI[j] == PI[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count; //Возращаем унникальнеы значения в массиве
    }

    int thirdAndFive() {
        int i;
        int count = 1;
        for (i = 0; i < PI.length; ++i) {
            if (PI[i] == 3 || PI[i] == 5) { //Если числа в массиве равны 3 или 5, тогда + 1 к счетчику
                count++;
               for (int j = 0; j < PI.length; j++) {
                   count++;
               }
            }
        }
        return count;
    }

}