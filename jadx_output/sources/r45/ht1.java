package r45;

/* loaded from: classes5.dex */
public class ht1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ht1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "lotteryInfo", r45.cz1.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.i(4, "continueFlag"), com.tencent.mm.protobuf.i.r(5, "winnerInfo", r45.jz1.class), com.tencent.mm.protobuf.i.n(6, "liveId"), com.tencent.mm.protobuf.i.i(7, "personalmsg_close_switch"), com.tencent.mm.protobuf.i.u(8, "record_url"), com.tencent.mm.protobuf.i.i(9, "is_url_expired"), com.tencent.mm.protobuf.i.u(10, "expired_wording"), com.tencent.mm.protobuf.i.i(11, "lottery_type"), com.tencent.mm.protobuf.i.r(12, "coupon_record_info", r45.zl4.class), com.tencent.mm.protobuf.i.r(13, "redpacket_record_info", r45.im4.class), com.tencent.mm.protobuf.i.r(14, "milestone_lottery_info", r45.gm4.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
