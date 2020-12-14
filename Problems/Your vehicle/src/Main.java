class EnjoyVehicle {

    public static void startVehicle() {
        new EnjoyVehicle().new Vehicle().new Engine().start();
    }

    class Vehicle {

        private String name;

        class Engine {

            void start() {
                System.out.println("RRRrrrrrrr....");
            }
        }
    }
}