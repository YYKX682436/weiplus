package r45;

/* loaded from: classes2.dex */
public class ix2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ix2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.u(4, "finderUsername"), com.tencent.mm.protobuf.i.i(5, "pullType"), com.tencent.mm.protobuf.i.r(6, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.g(7, "longitude"), com.tencent.mm.protobuf.i.g(8, "latitude"), com.tencent.mm.protobuf.i.u(9, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID), com.tencent.mm.protobuf.i.r(10, "status", r45.dx0.class), com.tencent.mm.protobuf.i.s(11, "readStats", r45.ni4.class), com.tencent.mm.protobuf.i.i(12, "consumeFlag"), com.tencent.mm.protobuf.i.i(13, "tabType"), com.tencent.mm.protobuf.i.n(14, "tabTipsObjectId"), com.tencent.mm.protobuf.i.u(15, "tabTipsObjectNonceId"), com.tencent.mm.protobuf.i.s(16, "stats", r45.vd6.class), com.tencent.mm.protobuf.i.n(17, "partialExposedObjectId"), com.tencent.mm.protobuf.i.s(18, "markUnreadObjectList", r45.e13.class), com.tencent.mm.protobuf.i.a(19, "cardBuffer"), com.tencent.mm.protobuf.i.i(20, "specialRequestScene"), com.tencent.mm.protobuf.i.u(21, "tabTipsUsername"), com.tencent.mm.protobuf.i.a(22, "tabTipsByPassInfo"), com.tencent.mm.protobuf.i.r(23, "liveStatus", r45.rn1.class), com.tencent.mm.protobuf.i.u(24, "tab_tips_path"), com.tencent.mm.protobuf.i.i(25, "request_source"), com.tencent.mm.protobuf.i.r(26, "finder_switch", r45.fy2.class), com.tencent.mm.protobuf.i.n(27, "guide_bar_object_id"), com.tencent.mm.protobuf.i.s(28, "top_objects", r45.qx2.class), com.tencent.mm.protobuf.i.i(29, "enter_finder_probability"), com.tencent.mm.protobuf.i.u(30, "h5_by_pass"), com.tencent.mm.protobuf.i.r(32, "comm_by_pass", r45.gy0.class), com.tencent.mm.protobuf.i.r(33, "scene_status", r45.nx2.class), com.tencent.mm.protobuf.i.r(34, "before_join_live_room_status", r45.om1.class), com.tencent.mm.protobuf.i.r(36, "related_info", r45.hx2.class), com.tencent.mm.protobuf.i.r(37, "sub_tab", r45.sx2.class), com.tencent.mm.protobuf.i.s(38, "other_tab_read_stats", r45.ni4.class), com.tencent.mm.protobuf.i.s(39, "cache_feeds", r45.vw2.class), com.tencent.mm.protobuf.i.r(40, "backup_request", r45.qf6.class), com.tencent.mm.protobuf.i.a(41, "rerank_last_buffer"), com.tencent.mm.protobuf.i.i(42, "location_generated_time"), com.tencent.mm.protobuf.i.n(43, "client_control_flag"));
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
