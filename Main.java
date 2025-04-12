public class Main {
    public static void main(String[] args) {
        cuentaBancaria cuentaDeJuan = new cuentaBancaria();

        cuentaDeJuan.titular = "Juan Martinez";
        cuentaDeJuan.tipoCuenta = "nómina";
        cuentaDeJuan.saldo = 22_500;

        System.out.println(" Cual es el Sado de la cuenta de Juan " + cuentaDeJuan.saldo);

    }
}