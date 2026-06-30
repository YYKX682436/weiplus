package r45;

/* loaded from: classes.dex */
public class fo1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public fo1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "liveId"), com.tencent.mm.protobuf.i.n(4, "objectId"), com.tencent.mm.protobuf.i.n(5, "objectNonceId"), com.tencent.mm.protobuf.i.i(6, "lotteryDuration"), com.tencent.mm.protobuf.i.u(7, "lotteryDescription"), com.tencent.mm.protobuf.i.r(8, ya.b.METHOD, r45.xy1.class), com.tencent.mm.protobuf.i.i(9, "lotteryWinnerCnt"), com.tencent.mm.protobuf.i.i(10, "opType"), com.tencent.mm.protobuf.i.u(11, "nonceId"), com.tencent.mm.protobuf.i.n(12, "setting_flag"), com.tencent.mm.protobuf.i.a(13, "live_cookies"), com.tencent.mm.protobuf.i.r(14, "claim_method", r45.yy1.class), com.tencent.mm.protobuf.i.i(15, "lottery_method_id"), com.tencent.mm.protobuf.i.r(16, "prize_method", r45.gz1.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
