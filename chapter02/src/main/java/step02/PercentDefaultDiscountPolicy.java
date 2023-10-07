package step02;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private Double percent;

    public PercentDefaultDiscountPolicy(Double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
