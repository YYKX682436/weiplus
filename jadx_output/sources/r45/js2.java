package r45;

/* loaded from: classes5.dex */
public class js2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public js2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "prepare_info", r45.hs2.class), com.tencent.mm.protobuf.i.i(3, "last_verify_result"), com.tencent.mm.protobuf.i.r(4, "err_page", r45.qp1.class), com.tencent.mm.protobuf.i.u(5, "verify_url"), com.tencent.mm.protobuf.i.i(6, "need_face_verify"), com.tencent.mm.protobuf.i.u(7, "face_verify_url"), com.tencent.mm.protobuf.i.r(8, "network_identity_auth_info", r45.tt4.class));
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
