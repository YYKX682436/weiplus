package r45;

/* loaded from: classes.dex */
public class nl6 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public nl6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "result", r45.uk0.class), com.tencent.mm.protobuf.i.u(3, "summary_lang"), com.tencent.mm.protobuf.i.c(4, "is_reliable"), com.tencent.mm.protobuf.i.i(5, "text_bytes"), com.tencent.mm.protobuf.i.c(6, "is_wenyanwen"));
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
