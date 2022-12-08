package com.company.task;

import java.util.ArrayList;

public class Question {
    private final String questionText;
    private final ArrayList<String> answerVariants;
    private final int rightAnswerNumber;

    public Question(String questionText, ArrayList<String> answerVariants, int rightAnswerNumber) {
        this.questionText = questionText;
        this.answerVariants = answerVariants;
        this.rightAnswerNumber = rightAnswerNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getRightAnswerNumber() {
        return rightAnswerNumber;
    }

    @Override
    public String toString() {
        StringBuilder str;
        str = new StringBuilder(questionText);
        for (int i = 0; i < answerVariants.size(); i++) {
            str.append("\n   ").append(i + 1).append(". ").append(answerVariants.get(i)).append(";");
        }
        return str.toString();
    }
}
