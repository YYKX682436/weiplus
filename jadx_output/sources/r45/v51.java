package r45;

/* loaded from: classes.dex */
public class v51 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public v51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "contactList", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.i(3, "continueFlag"), com.tencent.mm.protobuf.i.n(4, "lastId"), com.tencent.mm.protobuf.i.a(5, "lastBuff"), com.tencent.mm.protobuf.i.s(6, "fansList", r45.q21.class));
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
