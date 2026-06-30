package r45;

/* loaded from: classes5.dex */
public class e82 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public e82() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.a(2, "prepare_buf"), com.tencent.mm.protobuf.i.a(3, "ctx_buf"), com.tencent.mm.protobuf.i.s(4, "prepare_buf_infos", r45.c82.class), com.tencent.mm.protobuf.i.s(5, "ctx_buf_infos", r45.x72.class));
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
