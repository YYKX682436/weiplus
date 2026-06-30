package r45;

/* loaded from: classes.dex */
public class yz0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public yz0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "course_info", r45.uz0.class), com.tencent.mm.protobuf.i.i(3, "total_count"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.u(5, "last_buffer"));
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
