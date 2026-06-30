package r45;

/* loaded from: classes.dex */
public class r41 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public r41() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "query_interval"), com.tencent.mm.protobuf.i.i(3, "query_max_times"), com.tencent.mm.protobuf.i.c(4, "is_finished"), com.tencent.mm.protobuf.i.a(5, "context_buff"), com.tencent.mm.protobuf.i.s(6, "asset_list", r45.z25.class), com.tencent.mm.protobuf.i.i(7, "estimated_aigc_wait_time"), com.tencent.mm.protobuf.i.i(8, "completion_percentage"));
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
