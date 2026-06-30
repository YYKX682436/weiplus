package r45;

/* loaded from: classes5.dex */
public class h82 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public h82() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "bill_no"), com.tencent.mm.protobuf.i.a(3, "resp_buff"), com.tencent.mm.protobuf.i.r(4, "error_page", r45.qp1.class), com.tencent.mm.protobuf.i.r(5, "random_ctx", r45.xv1.class), com.tencent.mm.protobuf.i.r(6, "attack_ctx", r45.nv1.class), com.tencent.mm.protobuf.i.r(7, "extra_ctx", r45.b42.class));
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
