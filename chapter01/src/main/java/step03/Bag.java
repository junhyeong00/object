package step03;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this.amount = amount;
        this.invitation = null;
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {

            setTicket(ticket);

            return 0L;
        }

        minusAmount(ticket.getFee());

        setTicket(ticket);

        return ticket.getFee();
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
