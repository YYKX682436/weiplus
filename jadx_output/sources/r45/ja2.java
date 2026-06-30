package r45;

/* loaded from: classes2.dex */
public class ja2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ja2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object_async_info_map", r45.dl2.class), com.tencent.mm.protobuf.i.s(3, "contact_async_info_map", r45.cz0.class), com.tencent.mm.protobuf.i.i(4, "object_info_refresh_interval_seconds"), com.tencent.mm.protobuf.i.i(5, "live_contact_ttl_seconds"), com.tencent.mm.protobuf.i.r(6, "get_async_load_info_config", r45.ha2.class), com.tencent.mm.protobuf.i.r(7, "live_aggregation_card_info", r45.re1.class), com.tencent.mm.protobuf.i.s(8, "result_list", r45.ka2.class), com.tencent.mm.protobuf.i.r(9, "live_square_interaction_entry_info", r45.r92.class));
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
