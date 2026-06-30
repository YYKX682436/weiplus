package r45;

/* loaded from: classes2.dex */
public class l13 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l13() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "totalLen"), com.tencent.mm.protobuf.i.i(3, "startPos"), com.tencent.mm.protobuf.i.u(4, "imgUrl"), com.tencent.mm.protobuf.i.c(5, "completed"));
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
