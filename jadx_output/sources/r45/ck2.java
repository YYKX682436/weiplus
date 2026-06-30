package r45;

/* loaded from: classes2.dex */
public class ck2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ck2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.g(4, "longitude"), com.tencent.mm.protobuf.i.g(5, "latitude"), com.tencent.mm.protobuf.i.r(6, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(7, "live_status", r45.rn1.class), com.tencent.mm.protobuf.i.i(8, "pull_type"), com.tencent.mm.protobuf.i.r(9, "finder_switch", r45.fy2.class), com.tencent.mm.protobuf.i.s(10, "read_stats", r45.ni4.class), com.tencent.mm.protobuf.i.s(11, "mark_unread_object_list", r45.e13.class), com.tencent.mm.protobuf.i.i(12, "from_scene"), com.tencent.mm.protobuf.i.r(13, "lbs_tab_tips_info", r45.kd1.class), com.tencent.mm.protobuf.i.i(14, "isFreqControl"), com.tencent.mm.protobuf.i.r(15, "pressure_ctrl", r45.yq2.class), com.tencent.mm.protobuf.i.u(16, "by_pass"), com.tencent.mm.protobuf.i.r(17, "before_join_live_room_status", r45.om1.class), com.tencent.mm.protobuf.i.i(18, "container_id"), com.tencent.mm.protobuf.i.n(19, "related_object_id"), com.tencent.mm.protobuf.i.s(20, "container_context", r45.u80.class), com.tencent.mm.protobuf.i.r(21, "live_tab", r45.dd2.class), com.tencent.mm.protobuf.i.r(22, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.r(23, "live_discover_preload_info", r45.xo1.class), com.tencent.mm.protobuf.i.a(24, "jump_navlive_buffer"), com.tencent.mm.protobuf.i.u(25, "from_comment_scene"), com.tencent.mm.protobuf.i.a(26, "pre_navlive_more_live_objects_buffer"), com.tencent.mm.protobuf.i.r(27, "client_spec_config", r45.n40.class), com.tencent.mm.protobuf.i.r(28, "end_nav_buffer", r45.rk0.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
