package r45;

/* loaded from: classes5.dex */
public class pf2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public pf2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "live_duration_seconds"), com.tencent.mm.protobuf.i.i(3, "live_audiences_num"), com.tencent.mm.protobuf.i.i(4, "live_be_liked_num"), com.tencent.mm.protobuf.i.i(5, "live_new_fans_num"), com.tencent.mm.protobuf.i.i(6, "max_online_count"), com.tencent.mm.protobuf.i.i(7, "audiences_avg_seconds"), com.tencent.mm.protobuf.i.i(8, "biz_live_new_fans_num"), com.tencent.mm.protobuf.i.i(9, "replay_privilege"), com.tencent.mm.protobuf.i.n(10, "new_live_be_liked_num"), com.tencent.mm.protobuf.i.i(11, "replay_switch_status"), com.tencent.mm.protobuf.i.i(12, "guide_generation_replay"), com.tencent.mm.protobuf.i.u(13, "generate_replay_page_display_info"), com.tencent.mm.protobuf.i.r(15, "auto_gen_replay_option", r45.sl1.class));
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
