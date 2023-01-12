public class Holiday {

    String[] day = new String[] {
            "01/01/2023",
            "21/02/2023",
            "17/04/2023",
            "21/04/2023",
            "01/05/2023",
            "08/06/2023",
            "07/09/2023",
            "12/10/2023",
            "02/11/2023",
            "15/11/2023",
            "25/12/2023",
    };

    String[] holidayName = new String[] {
            "Confraternização mundial",
            "Carnaval",
            "Páscoa",
            "Tiradentes",
            "Dia do trabalho",
            "Corpus Christi",
            "Independência do Brasil",
            "Nossa Senhora Aparecida",
            "Finados",
            "Proclamação da República",
            "Natal",
    };

    public void getAllHolidays() {
        for (int i = 0; i < this.day.length; i++) {
            System.out.println(this.day[i] + " => " + this.holidayName[i]);
        }
    }

    public void getHoliday(String holiday) {
        if ("x".equals(holiday)) {
            this.getAllHolidays();
            return;
        }
        for (int i = 0; i < day.length; i++) {
            if (day[i].equals(holiday)) {
                System.out.println("O feriado é de: " + holidayName[i]);
                return;
            }
        }
        System.out.println("Sem feriados no dia: " + holiday);
    }
}
