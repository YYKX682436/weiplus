package r45;

/* loaded from: classes.dex */
public class be2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public be2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.c(2, "isVerified"), com.tencent.mm.protobuf.i.u(3, "realnameUrl"), com.tencent.mm.protobuf.i.a(4, "ticket"));
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
