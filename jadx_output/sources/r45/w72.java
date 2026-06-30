package r45;

/* loaded from: classes.dex */
public class w72 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public w72() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.n(2, "object_id"), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.u(4, "invitation_id"));
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
