package r45;

/* loaded from: classes2.dex */
public class dk2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public dk2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "container_list", r45.fa2.class), com.tencent.mm.protobuf.i.r(3, "live_preload_info", r45.l42.class), com.tencent.mm.protobuf.i.i(4, "prefech_min_interval"), com.tencent.mm.protobuf.i.a(5, "debug_message"), com.tencent.mm.protobuf.i.i(6, "refresh_interval"), com.tencent.mm.protobuf.i.a(7, "last_buffer"), com.tencent.mm.protobuf.i.c(8, "skip_get_all_live_tabs"), com.tencent.mm.protobuf.i.c(9, "skip_async_load_live_info"), com.tencent.mm.protobuf.i.i(11, "continue_flag"), com.tencent.mm.protobuf.i.c(12, "skip_feeds_report"), com.tencent.mm.protobuf.i.i(13, "flags"), com.tencent.mm.protobuf.i.r(14, "style_info", r45.s92.class), com.tencent.mm.protobuf.i.r(15, "async_load_info_config", r45.ha2.class), com.tencent.mm.protobuf.i.r(16, "live_discover_preload_config", r45.wo1.class), com.tencent.mm.protobuf.i.i(17, "live_card_auto_play_flag"), com.tencent.mm.protobuf.i.r(18, "preload_control_config", r45.bk2.class), com.tencent.mm.protobuf.i.r(19, "quit_live_guide_page_preload_config", r45.cs2.class), com.tencent.mm.protobuf.i.r(20, "no_reddot_preload_config", r45.wo1.class), com.tencent.mm.protobuf.i.r(21, "jump_nav_prefetch_control", r45.ma2.class), com.tencent.mm.protobuf.i.a(22, "more_live_objects_buffer"));
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
