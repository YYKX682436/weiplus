package r45;

/* loaded from: classes2.dex */
public class y71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public y71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.u(5, "object_nonce_id"), com.tencent.mm.protobuf.i.g(6, "longitude"), com.tencent.mm.protobuf.i.g(7, "latitude"), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(9, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(10, "live_status", r45.rn1.class), com.tencent.mm.protobuf.i.u(11, "session_buffer"), com.tencent.mm.protobuf.i.r(12, "lbs_tab_tips_info", r45.kd1.class), com.tencent.mm.protobuf.i.r(13, "pressure_ctrl", r45.yq2.class), com.tencent.mm.protobuf.i.u(14, "by_pass"), com.tencent.mm.protobuf.i.r(16, "comm_by_pass", r45.gy0.class), com.tencent.mm.protobuf.i.s(17, "stats", r45.vd6.class), com.tencent.mm.protobuf.i.i(18, "pull_type"), com.tencent.mm.protobuf.i.r(19, "before_join_live_room_status", r45.om1.class), com.tencent.mm.protobuf.i.s(20, "read_stat", r45.d72.class), com.tencent.mm.protobuf.i.i(21, "cur_object_index"), com.tencent.mm.protobuf.i.p(22, "nav_container_read_ids"), com.tencent.mm.protobuf.i.a(23, "nav_last_buffer"), com.tencent.mm.protobuf.i.a(24, "nav_container_last_buffer"), com.tencent.mm.protobuf.i.i(25, "request_scene"), com.tencent.mm.protobuf.i.r(26, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.a(27, "live_cookies"));
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
