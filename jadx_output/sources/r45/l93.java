package r45;

/* loaded from: classes5.dex */
public class l93 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l93() {
        super(com.tencent.mm.protobuf.i.r(1, "base_response", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "ret_code"), com.tencent.mm.protobuf.i.r(3, "result", r45.m93.class));
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
