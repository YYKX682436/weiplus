package r45;

/* loaded from: classes2.dex */
public class z82 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public z82() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "flag"), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.r(4, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.i(5, "function_type"), com.tencent.mm.protobuf.i.r(6, "jump_info", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.a(7, "flag_buffer"), com.tencent.mm.protobuf.i.i(8, "scan_scene"));
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
