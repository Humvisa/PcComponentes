void main() {
    //creamos el procesador en blanco
    Procesador procesador = new Procesador();
    procesador.setGenerecaion("Quinta");
    procesador.setNucleo("8");
    procesador.setTipo("Intel");
    procesador.setMemCache("2kb");
    procesador.setVelocidad("3.6GHz");
    System.out.println(" ");
    System.out.println("Procesador ------------------------------------------------------------------");
    System.out.println(procesador.getGenerecaion());
    System.out.println(procesador.getNucleo());
    System.out.println(procesador.getTipo());
    System.out.println(procesador.getMemCache());
    System.out.println(procesador.getVelocidad());
    System.out.println(" ");


    Memoria memoria = new Memoria();
    memoria.setTipo("DDR5");
    memoria.setVelocidad("4GHz");
    memoria.setCapacidad("16 GB");
    System.out.println("Memoria -------------------------------------------------");
    System.out.println(memoria.getTipo());
    System.out.println(memoria.getVelocidad());
    System.out.println(memoria.getCapacidad());
    System.out.println(" ");

    Memoria memoria0 = new Memoria();
    memoria0.setTipo("DDR4");
    memoria0.setVelocidad("3.2GHz");
    memoria0.setCapacidad("16 GB");
    System.out.println("Memoria -------------------------------------------------");
    System.out.println(memoria0.getTipo());
    System.out.println(memoria0.getVelocidad());
    System.out.println(memoria0.getCapacidad());
    System.out.println(" ");


    PlacaBase placaBase = new PlacaBase();
    placaBase.setPCI("2x 16");
    placaBase.setSocket("LGA");
    System.out.println(" ");
    System.out.println("Placa Base ---------------------------------------------------------");
    System.out.println(placaBase.getPCI());
    System.out.println(placaBase.getSocket());
    System.out.println(" ");

    PlacaBase placaBase0 = new PlacaBase();
    placaBase0.setPCI("1x 16");
    placaBase0.setSocket("PGA");
    System.out.println(" ");
    System.out.println("Placa Base ---------------------------------------------------------");
    System.out.println(placaBase0.getPCI());
    System.out.println(placaBase0.getSocket());
    System.out.println(" ");


    Torre torre = new Torre();
    torre.setDimensiones("25x50x10");
    torre.setTipo("ATX");
    torre.setPuertosUSB("3X3.0");
    System.out.println(" ");
    System.out.println("Torre ------------------------------------------------------");
    System.out.println(torre.getDimensiones());
    System.out.println(torre.getTipo());
    System.out.println(torre.getPuertosUSB());

    Torre torre0 = new Torre();
    torre0.setDimensiones("30x55x15");
    torre0.setTipo("ATX");
    torre0.setPuertosUSB("5X3.0");
    System.out.println(" ");
    System.out.println("Torre ------------------------------------------------------");
    System.out.println(torre0.getDimensiones());
    System.out.println(torre0.getTipo());
    System.out.println(torre0.getPuertosUSB());
}