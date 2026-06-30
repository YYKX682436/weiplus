package r45;

/* loaded from: classes.dex */
public class xd2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public xd2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.r(3, "preload_info", r45.sq2.class), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.i(5, "continue_flag"), com.tencent.mm.protobuf.i.r(6, "contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.i(7, "total_count"));
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
