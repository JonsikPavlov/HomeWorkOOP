package com.company.homeWorkOOP;

public class Faculty {
    /*   Создать класс Faculty c массивом классов Specialty.
     *   У класса Specialty 2 поля: название, набор (enrollment) и количество заявок.
     *   Для класса Faculty сделать метод, который рассчитывает общий
     *   набор и другой - который рассчитывает кол-во свободных мест. */
    private Specialty[] faculty;

    public int totalEnrollment(Specialty... specialties){ // passing array of specialties(objects)
        System.arraycopy(specialties, 0, faculty, 0, specialties.length);
        int counterOfRequests = 0;
        for (int i = 0; i < faculty.length; i++) {
            counterOfRequests += faculty[i].getNumberOfRequests();
        }
        return counterOfRequests;
    }

    public int restPlacesOfFaculty(Specialty... specialties){
        System.arraycopy(specialties, 0, faculty, 0, specialties.length);
        int counterOfEnrollments = 0;
        for (int i = 0; i < faculty.length; i++) {
            counterOfEnrollments += faculty[i].getENROLLMENT();
        }
        Faculty requests = new Faculty();

        int restPlacesOnFaculty = counterOfEnrollments - requests.totalEnrollment();
        return restPlacesOnFaculty;
    }
}
