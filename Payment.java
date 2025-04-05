public class Payment {
    protected double totalPrice;
    protected String paymentMethod;
    protected String paymentStatus;

    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
    }

    public void processPayment(String paymentMethod, double discountPercent) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
        this.totalPrice = getFinalPrice(discountPercent);
    }

    public double getFinalPrice(double discountPercent) {
        return totalPrice - (totalPrice * discountPercent / 100);
    }

    public void showDetail(Double originalPrice, Double discount) {
        System.out.println("Total Harga Sebelum Diskon: Rp " + String.format("%,.0f", originalPrice));
        if (discount != null) {
            System.out.println("Voucher Diskon: " + discount + "%");
        }
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Status Pembayaran: " + paymentStatus);
        System.out.println();
    }
}


