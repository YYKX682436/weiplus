package r45;

/* loaded from: classes.dex */
public class h31 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public h31() {
        super(com.tencent.mm.protobuf.i.u(1, "url"), com.tencent.mm.protobuf.i.u(2, "thumbUrl"), com.tencent.mm.protobuf.i.i(3, "waitType"), com.tencent.mm.protobuf.i.r(4, "BaseResponse", r45.ie.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(3);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(3, ieVar);
        return this;
    }
}
