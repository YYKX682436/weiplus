package r45;

/* loaded from: classes2.dex */
public class ed1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ed1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.g(4, "longitude"), com.tencent.mm.protobuf.i.g(5, "latitude"), com.tencent.mm.protobuf.i.r(6, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(7, "live_status", r45.rn1.class), com.tencent.mm.protobuf.i.i(8, "pull_type"), com.tencent.mm.protobuf.i.r(9, "finder_switch", r45.fy2.class), com.tencent.mm.protobuf.i.s(10, "read_stats", r45.ni4.class), com.tencent.mm.protobuf.i.s(11, "mark_unread_object_list", r45.e13.class), com.tencent.mm.protobuf.i.r(12, "tab_list", r45.dd2.class), com.tencent.mm.protobuf.i.i(13, "from_scene"), com.tencent.mm.protobuf.i.r(14, "lbs_tab_tips_info", r45.kd1.class), com.tencent.mm.protobuf.i.i(15, "isFreqControl"), com.tencent.mm.protobuf.i.r(16, "pressure_ctrl", r45.yq2.class), com.tencent.mm.protobuf.i.u(17, "by_pass"), com.tencent.mm.protobuf.i.i(18, "only_follow_feed"), com.tencent.mm.protobuf.i.n(19, "related_object_id"), com.tencent.mm.protobuf.i.r(20, "before_join_live_room_status", r45.om1.class), com.tencent.mm.protobuf.i.i(21, "need_banner_card_style"), com.tencent.mm.protobuf.i.u(22, "jump_navlive_buffer_encode"));
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
