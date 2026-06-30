package r45;

/* loaded from: classes.dex */
public class t61 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public t61() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "live_info", r45.ib1.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.i(5, "start_time_range"), com.tencent.mm.protobuf.i.i(6, "end_time_range"), com.tencent.mm.protobuf.i.i(7, "total_count"));
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
