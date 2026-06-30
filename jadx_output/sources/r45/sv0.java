package r45;

/* loaded from: classes.dex */
public class sv0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public sv0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "objects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.i(3, "refresh_interval"), com.tencent.mm.protobuf.i.s(4, "object_responses", r45.pv0.class), com.tencent.mm.protobuf.i.d(5, "can_pre_download", java.lang.Boolean.TRUE));
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
