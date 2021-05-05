public static void main(String[] args) {
    Ejemplo ejemploApp = new Ejemplo();

    int option = ejemploApp.askNumber();
    if (option > 0) {
        ejemploApp.printMessage(option);
        } else {
        System.out.println("el número puede ser mayor que cero");
        }

    return;
}
