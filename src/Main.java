public class Main {
    public static void main(String[] args) {




        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);


        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);


        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/3;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);



        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        var totalWeightOfBoxers=boxer1+boxer2;
        System.out.println(totalWeightOfBoxers);
        var theDifferenceBetweenTheScalesOfBoxers=boxer2-boxer1;
        System.out.println(theDifferenceBetweenTheScalesOfBoxers);



        var athletesWeightDifference=boxer2-boxer1;
        System.out.println("Разница в весе спортсменов "+athletesWeightDifference+" кг");
        var RemainderFromDivision=(boxer2 % boxer1);
        System.out.println("остаток от деления равен "+athletesWeightDifference+" кг");





        var totalWorkHoursePerDay = 640.0;
        System.out.println(totalWorkHoursePerDay);
        var workingTimeOfOnePersonPerDay =8.0;
        System.out.println(workingTimeOfOnePersonPerDay);
        var  totalNumberOfEmployees = totalWorkHoursePerDay/workingTimeOfOnePersonPerDay;
        System.out.println("Колличество сотрудников в данном примере  = "+totalNumberOfEmployees+" человек.");
        var morePeopleBy94People=94;
        System.out.println("на "+morePeopleBy94People+" человек больше,чем в первой компании");
        var howManyPeopleAreInTheCompany = morePeopleBy94People+totalNumberOfEmployees;
        System.out.println(howManyPeopleAreInTheCompany+" человек, работают во второй компании");
        var hoursOfWorkPerDayTnTheSecondCompany = howManyPeopleAreInTheCompany * workingTimeOfOnePersonPerDay;
        System.out.println(hoursOfWorkPerDayTnTheSecondCompany+" часов работы должно быть поделено  ");



    }
}







