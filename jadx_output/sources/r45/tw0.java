package r45;

/* loaded from: classes.dex */
public class tw0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public tw0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "check_result", r45.e20.class), com.tencent.mm.protobuf.i.s(3, "objects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.r(4, "check_config", r45.rw0.class), com.tencent.mm.protobuf.i.a(5, "last_check_context"));
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
