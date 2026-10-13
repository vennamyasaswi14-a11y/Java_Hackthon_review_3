class MovieTicket 
{
    String movieName, customerName;
    double ticketPrice;
    int numberOfTickets;

    // Default constructor
    MovieTicket() {
        movieName = "Not Selected";
        customerName = "Guest";
        ticketPrice = 0;
        numberOfTickets = 0;
    }

    // Parameterized constructor
    MovieTicket(String m, String c, double p, int n) {
        movieName = m;
        customerName = c;
        ticketPrice = p;
        numberOfTickets = n;
    }

    // Method overloading
    void bookTickets(int n) {
        numberOfTickets = n;
    }

    void bookTickets(int n, String c) {
        numberOfTickets = n;
        customerName = c;
    }

    void display() {
        if (numberOfTickets <= 0) {
            System.out.println("Invalid number of tickets");
            return;
        }

        double total = ticketPrice * numberOfTickets;
        double discount = 0;

        if (numberOfTickets >= 5) {
            discount = total * 0.10;
        }

        System.out.println("Movie Name: " + movieName.toUpperCase());
        System.out.println("Customer Name: " + customerName.toUpperCase());
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (total - discount));
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket(
            "Avatar", "Ravi", 200, 6
        );

        t1.display();

        System.out.println();

        MovieTicket t2 = new MovieTicket();
        t2.movieName = "Pushpa";
        t2.ticketPrice = 150;

        t2.bookTickets(3);
        t2.bookTickets(3, "Sita");

        t2.display();

        System.out.println();

        // Compare customer names
        if (t1.customerName.equalsIgnoreCase(t2.customerName)) {
            System.out.println("Same Customer");
        } else {
            System.out.println("Different Customers");
        }
    }
}