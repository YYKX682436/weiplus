package r45;

/* loaded from: classes5.dex */
public class ao1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ao1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "result_type"), com.tencent.mm.protobuf.i.u(3, "enhanced_cover_url"), com.tencent.mm.protobuf.i.u(4, "task_id"), com.tencent.mm.protobuf.i.i(5, "delay_time_ms"));
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
