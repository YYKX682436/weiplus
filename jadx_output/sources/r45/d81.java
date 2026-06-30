package r45;

/* loaded from: classes5.dex */
public class d81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public d81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "gift_list", r45.kv1.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "combo_batch_size"), com.tencent.mm.protobuf.i.i(5, "combo_batch_timeout_ms"), com.tencent.mm.protobuf.i.r(6, "reward_level_info", r45.aw1.class), com.tencent.mm.protobuf.i.s(7, "gift_group_list", r45.sv1.class), com.tencent.mm.protobuf.i.r(9, "package_resource", r45.r35.class), com.tencent.mm.protobuf.i.r(10, "fan_club_panel_info", r45.zo0.class), com.tencent.mm.protobuf.i.r(11, "switch_skin_gift_config", r45.wi6.class));
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
