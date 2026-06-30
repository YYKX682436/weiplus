package r45;

/* loaded from: classes.dex */
public class eo1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public eo1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "gift_activity_info", r45.lv1.class), com.tencent.mm.protobuf.i.r(3, "error_page", r45.qp1.class));
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
