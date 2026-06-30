package r45;

/* loaded from: classes.dex */
public class pv0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public pv0() {
        super(com.tencent.mm.protobuf.i.n(1, "object_id"), com.tencent.mm.protobuf.i.u(2, "export_id"), com.tencent.mm.protobuf.i.r(3, "BaseResponse", r45.ie.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(2);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(2, ieVar);
        return this;
    }
}
