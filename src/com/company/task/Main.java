package com.company.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice, rightAnswersNumber;
        ArrayList<Answer> answers = new ArrayList<>();
        ArrayList<Question> questions = createQuestionArray();

        for (Question a : questions) {
            System.out.println(a.toString());
            System.out.print("Ваш ответ: ");
            userChoice = sc.nextInt();
            Answer answer = new Answer(a, userChoice);
            answers.add(answer);
        }

        rightAnswersNumber = answers.size();
        for (Answer a : answers) {
            if (!a.isUserAnswerCorrect()) {
                --rightAnswersNumber;
            }
        }
        if(rightAnswersNumber == answers.size()) {
            System.out.println("Вы ответили на " + rightAnswersNumber + " вопросов из " +
                    answers.size() + ". Все ответы правильные!");
        } else {
            System.out.println("Вы ответили на " + rightAnswersNumber + " вопросов из " +
                    answers.size() + " вопросов. Вы ошиблись в следующих вопросах:");
            for (Answer a : answers) {
                if (!a.isUserAnswerCorrect()) {
                    System.out.println(a);
                }
            }
        }
    }

    public static ArrayList<Question> createQuestionArray() {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<String> answerVariantsOne = new ArrayList<>();
        Collections.addAll(answerVariantsOne,
                "метод, который вызывается при создании экземпляра объекта",
                "специальная переменная класса",
                "объект класса");
        Question q1 = new Question("Что такое конструктор у класса?",
                answerVariantsOne, 1);

        ArrayList<String> answerVariantsTwo = new ArrayList<>();
        Collections.addAll(answerVariantsTwo,
                "у данного класса автоматически создается коструктор по умолчанию",
                "нельзя создать объект этого класса",
                "код не скомпилируется");
        Question q2 = new Question("Если у класса в теле не объявлен коструктор, тогда",
                answerVariantsTwo, 1);

        ArrayList<String> answerVariantsThree = new ArrayList<>();
        Collections.addAll(answerVariantsThree,
                "неограниченное количество",
                "только один",
                "не более пяти");
        Question q3 = new Question("Сколько конструкторов может быть у класса?",
                answerVariantsThree, 1);

        ArrayList<String> answerVariantsFour = new ArrayList<>();
        Collections.addAll(answerVariantsFour,
                "в порядке их объявления",
                "все одновременно",
                "в случайном порядке");
        Question q4 = new Question("Переменные в классе инициалируются",
                answerVariantsFour, 1);

        ArrayList<String> answerVariantsFive = new ArrayList<>();
        Collections.addAll(answerVariantsFive,
                "чтобы другие классы могли корректно получатьили менять " +
                        "данные внутри объектов вашего класса",
                "это специальные конструкторы класса");
        Question q5 = new Question("Для каких целей служат методы get и set?",
                answerVariantsFive, 1);

        Collections.addAll(questions, q1, q2, q3, q4, q5);
        return questions;
    }
}