package com.company.homeWorkOOP;

public class Specialty {
 /*   Создать класс Faculty c массивом классов Specialty.
 *   У класса Specialty 2 поля: название, набор (enrollment) и количество заявок.
 *   Для класса Faculty сделать метод, который рассчитывает общий
 *   набор и другой - который рассчитывает кол-во свободных мест. */
    private String specialtyName;
    private final int ENROLLMENT = 30;
    private int numberOfRequests;

    public Specialty(String specialtyName, int numberOfRequests){
        this.specialtyName = specialtyName;
        this.numberOfRequests = numberOfRequests;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public int getENROLLMENT() {
        return ENROLLMENT;
    }

    public int getNumberOfRequests() {
        return numberOfRequests;
    }

    public void setNumberOfRequests(int numberOfRequests) {
        this.numberOfRequests = numberOfRequests;
    }
}
