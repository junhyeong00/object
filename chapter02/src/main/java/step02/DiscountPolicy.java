package step02;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
