package com.company.task;

public class Answer {
    private final Question question;
    private final int userNumber;

    public Answer(Question question, int userNumber) {
        this.question = question;
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "Вопрос: " + question.getQuestionText() +
                "\nВаш ответ: " + userNumber +
                "\nПравильный ответ: " + question.getRightAnswerNumber();
    }

    public boolean isUserAnswerCorrect() {
        return question.getRightAnswerNumber() == userNumber;
    }
}
