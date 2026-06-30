package o0;

/* loaded from: classes16.dex */
public class l extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "live_contacts", r45.xn1.class), com.tencent.mm.protobuf.i.i(3, "live_contacts_max_display_count"));
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
