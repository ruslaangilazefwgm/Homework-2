public class Main {
    public static void main(String[] args) {
       // Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var weightDifferent = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов " + weightDifferent + " кг");

        // Задача 7
        System.out.println("Задача 7");
        var weightDifferent1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов (1 способ): " + weightDifferent1 + " кг");
        var weightDifferent2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов (2 способ): " + weightDifferent2 + " кг");

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkHours = 640;
        var hoursEveryWorker = 8;
        var totalWorkers = totalWorkHours / hoursEveryWorker;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");

         totalWorkers = totalWorkers + 94;
         totalWorkHours = hoursEveryWorker * totalWorkers;
        System.out.println(" Если в компании работает " + totalWorkers + " человек, то всего " + totalWorkHours + " часа работы может быть поделено между сотрудниками");

    }
}