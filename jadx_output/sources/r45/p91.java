package r45;

/* loaded from: classes.dex */
public class p91 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public p91() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.a(2, "last_buffer"), com.tencent.mm.protobuf.i.a(3, "seq_buffer"), com.tencent.mm.protobuf.i.r(4, "title_result", r45.n91.class));
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
