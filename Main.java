public class Main {
    static class Customer extends Payment {
        public Customer(double totalPrice, String paymentMethod) {
            super(totalPrice, paymentMethod);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Transaksi Siti ===");
        Customer siti = new Customer(3500000, "Kartu Kredit");
        siti.processPayment("Kartu Kredit");
        siti.showDetail(3500000.0, null);

        System.out.println("=== Transaksi Ciciripi ===");
        Customer ciciripi = new Customer(10000000, "Voucher Diskon");
        ciciripi.processPayment("Voucher Diskon", 15);
        ciciripi.showDetail(10000000.0, 15.0);

        System.out.println("=== Transaksi Asnawi ===");
        Customer asnawi = new Customer(1200000, "Transfer Bank");
        asnawi.processPayment("Transfer Bank");
        asnawi.showDetail(1200000.0, null);
    }
}





