package r45;

/* loaded from: classes5.dex */
public class r81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public r81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "_deprecated_session_id"), com.tencent.mm.protobuf.i.i(3, "_deprecated_enable_action"), com.tencent.mm.protobuf.i.u(4, "_deprecated_to_username"), com.tencent.mm.protobuf.i.r(5, "sessionInfo", r45.vi2.class));
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
