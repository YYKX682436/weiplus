package r45;

/* loaded from: classes5.dex */
public class go1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public go1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "lotteryInfo", r45.cz1.class), com.tencent.mm.protobuf.i.r(3, "errorPage", r45.qp1.class));
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
