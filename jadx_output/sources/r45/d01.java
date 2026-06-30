package r45;

/* loaded from: classes.dex */
public class d01 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public d01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "task_id"), com.tencent.mm.protobuf.i.i(3, "query_interval"), com.tencent.mm.protobuf.i.i(4, "query_max_times"), com.tencent.mm.protobuf.i.a(5, "context_buffer"), com.tencent.mm.protobuf.i.i(6, "show_long_wait_button"), com.tencent.mm.protobuf.i.i(7, "estimated_aigc_wait_time"));
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
