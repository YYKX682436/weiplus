package r45;

/* loaded from: classes.dex */
public class tn1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public tn1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "realname_url"), com.tencent.mm.protobuf.i.n(3, "server_msg_id"), com.tencent.mm.protobuf.i.u(4, "session_id"), com.tencent.mm.protobuf.i.r(5, "purchase_mic_evaluate_entrance", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class));
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
