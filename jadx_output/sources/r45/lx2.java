package r45;

/* loaded from: classes.dex */
public class lx2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public lx2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", r45.jx2.class), com.tencent.mm.protobuf.i.a(3, "rerank_last_buffer"), com.tencent.mm.protobuf.i.r(4, "preload_info", r45.sq2.class));
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
