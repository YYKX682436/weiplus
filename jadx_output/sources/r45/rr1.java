package r45;

/* loaded from: classes.dex */
public class rr1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public rr1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.n(2, "wecoin_balance"), com.tencent.mm.protobuf.i.n(3, "consume_quota_balance"), com.tencent.mm.protobuf.i.u(4, "consume_quota_verify_url"), com.tencent.mm.protobuf.i.n(5, "history_consume_quota_balance"));
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
