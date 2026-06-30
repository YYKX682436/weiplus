package r45;

/* loaded from: classes.dex */
public class b81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public b81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "total_num"), com.tencent.mm.protobuf.i.g(3, "total_value"), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.i(5, "continue_flag"), com.tencent.mm.protobuf.i.s(6, "info_list", r45.a82.class), com.tencent.mm.protobuf.i.n(7, "reward_total_amount_in_wecoin"), com.tencent.mm.protobuf.i.n(8, "reward_total_amount_in_heat"), com.tencent.mm.protobuf.i.n(9, "heat_value"), com.tencent.mm.protobuf.i.n(10, "live_heat_value"));
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
