package jcw.CAMO_Spring.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cafe {
    private Long cafeId; //카페번호(사업자번호)(PK)
    private Long memberId; //회원번호와 동일(FK)
    private String cafeName; //카페 이름
    private String cafeAddress; //카페 주소
    private String cafeCallNumber; //전화번호
    private int stampsNumber; //스탬프 전체 개수(사용 가능 개수)
    private String couponReward; //쿠폰 보상
    private String cafeIntroduce; //카페 소개글
}
