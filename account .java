class FeeAccount {

    void pay(double amount) {
        System.out.println(
            "Paid in one go (day-scholar account)"
        );
    }
}

class HostelFeeAccount extends FeeAccount {

    void payInInstallments(double amount) {
        System.out.println(
            "Paid in two installments (hostel account)"
        );
    }
}

class account {

    static void processPayment(
        FeeAccount account,
        double amount
    ) {

        if (account instanceof HostelFeeAccount) {

            HostelFeeAccount hostel =
                (HostelFeeAccount) account;

            hostel.payInInstallments(amount);

        } else {

            account.pay(amount);
        }
    }

    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        double[] amounts = {
            60000,
            60000,
            60000,
            60000
        };

        int hostelCount = 0;
        int dayScholarCount = 0;

        for (int i = 0; i < accounts.length; i++) {

            processPayment(accounts[i], amounts[i]);

            if (accounts[i] instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }

        System.out.println(
            "Hostel accounts processed: " +
            hostelCount +
            " | Day-scholar accounts processed: " +
            dayScholarCount
        );
    }
}