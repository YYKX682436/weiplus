package r45;

/* loaded from: classes.dex */
public class nw0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public nw0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.a(2, "last_buffer"), com.tencent.mm.protobuf.i.i(3, "continue_flag"), com.tencent.mm.protobuf.i.s(4, "object", com.tencent.mm.protocal.protobuf.FinderObject.class));
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
