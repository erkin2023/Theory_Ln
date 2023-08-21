package HomeWork_Ln_18;

public enum WeekDay {
        MONDAY("Дуйшонбу") {
            @Override
            public void method() {
                System.out.println("Дуйшөмбү куну жава окуйм");
            }
        },
        TUESDAY("Шейшенби") {
            @Override
            public void method() {
                System.out.println("Шейшемби күнү англис тили сабагын окуйм");
            }
        },
        WEDNESDAY("Шаршемби") {
            @Override
            public void method() {
                System.out.println("Шаршемби  куну жава окуйм");
            }
        },
        THURSDAY("Бейшемби") {
            @Override
            public void method() {
                System.out.println("Бейшемби күнү англис тили сабагын окуйм");
            }
        },
        FRIDAY("Жума") {
            @Override
            public void method() {
                System.out.println("Жума Дуйшөмбү куну жава окуйм");
            }
        },
        SATURDAY("Ишемби") {
            @Override
            public void method() {
                System.out.println("Ишемби дем алыш ");
            }
        },
        SUNDAY("Жекжемби") {
            @Override
            public void method() {
                System.out.println("Жекжемби дем алыш");
            }
        };

        private String name;

        WeekDay(String name) {
            this.name = name;
        }

        String getWeekDay() {
            return this.name;
        }

        public abstract void method();

    @Override
    public String toString() {
        return "WeekDay{" +
                "name='" + name + '\'' +
                '}';
    }
}



