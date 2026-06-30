package r45;

/* loaded from: classes5.dex */
public class q71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public q71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "liveCookies"), com.tencent.mm.protobuf.i.n(4, "liveId"), com.tencent.mm.protobuf.i.u(5, "finderUsername"), com.tencent.mm.protobuf.i.i(6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.n(7, "objectId"), com.tencent.mm.protobuf.i.c(8, "offline"), com.tencent.mm.protobuf.i.u(9, "object_nonce_id"), com.tencent.mm.protobuf.i.r(10, "status", r45.rn1.class), com.tencent.mm.protobuf.i.a(11, "live_sei"), com.tencent.mm.protobuf.i.u(12, "session_buffer"), com.tencent.mm.protobuf.i.s(13, "recv_box_list", r45.qm1.class), com.tencent.mm.protobuf.i.r(14, "current_box", r45.qm1.class), com.tencent.mm.protobuf.i.r(15, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.i(18, "offline_scene"), com.tencent.mm.protobuf.i.r(19, "getlivemsg_report_info", r45.p71.class), com.tencent.mm.protobuf.i.r(20, "display_info", r45.y12.class), com.tencent.mm.protobuf.i.r(21, "audience_status_info", r45.rl1.class), com.tencent.mm.protobuf.i.r(22, "sei_stat_info", r45.x82.class), com.tencent.mm.protobuf.i.r(24, "button_display_info", r45.wm1.class));
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
