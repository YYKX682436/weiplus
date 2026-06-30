package r45;

/* loaded from: classes.dex */
public class hr1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public hr1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "session_info", r45.w32.class), com.tencent.mm.protobuf.i.c(3, "enable_create_session"), com.tencent.mm.protobuf.i.u(4, "reject_msg"), com.tencent.mm.protobuf.i.u(5, "self_username"), com.tencent.mm.protobuf.i.u(6, "self_encrypted_username"));
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
