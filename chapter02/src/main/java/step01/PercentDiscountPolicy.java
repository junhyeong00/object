package step01;

public class PercentDiscountPolicy extends DiscountPolicy{
    private Double percent;

    public PercentDiscountPolicy(Double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
