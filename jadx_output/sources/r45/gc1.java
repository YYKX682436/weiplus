package r45;

/* loaded from: classes5.dex */
public class gc1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public gc1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "liveId"), com.tencent.mm.protobuf.i.a(4, "liveCookies"), com.tencent.mm.protobuf.i.n(5, "objectId"), com.tencent.mm.protobuf.i.u(6, "finderUsername"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(8, "live_pk_id"), com.tencent.mm.protobuf.i.u(9, "object_nonce_id"), com.tencent.mm.protobuf.i.u(10, "session_buffer"), com.tencent.mm.protobuf.i.i(11, "join_type"), com.tencent.mm.protobuf.i.u(12, "share_username"), com.tencent.mm.protobuf.i.i(13, "from_scene"), com.tencent.mm.protobuf.i.n(14, "ref_object_id"), com.tencent.mm.protobuf.i.r(15, "joinlive_tab_tips_info", r45.jc1.class), com.tencent.mm.protobuf.i.a(16, "live_sei"), com.tencent.mm.protobuf.i.u(17, "ec_source"), com.tencent.mm.protobuf.i.r(18, "before_join_live_room_status", r45.om1.class), com.tencent.mm.protobuf.i.r(19, "box", r45.qm1.class), com.tencent.mm.protobuf.i.r(20, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.r(21, "client_status", r45.rn1.class), com.tencent.mm.protobuf.i.i(23, "is_keep_alive_req"), com.tencent.mm.protobuf.i.a(24, "ux_info"), com.tencent.mm.protobuf.i.r(25, "dynamic_card_version", r45.ap1.class), com.tencent.mm.protobuf.i.u(26, "finder_forward_source"), com.tencent.mm.protobuf.i.u(27, "src_url"), com.tencent.mm.protobuf.i.r(29, "feeds_preview_live_multi_style_info", r45.jr0.class), com.tencent.mm.protobuf.i.c(30, "only_plus_uv"), com.tencent.mm.protobuf.i.u(31, "joinlive_with_personal_column_id"), com.tencent.mm.protobuf.i.u(32, "func_msg_report_ext_info"), com.tencent.mm.protobuf.i.c(33, "need_check_auto_swipe"), com.tencent.mm.protobuf.i.u(34, "qrcode_url"), com.tencent.mm.protobuf.i.a(38, "out_room_realname_like_info"), com.tencent.mm.protobuf.i.i(40, "mixed_flow"), com.tencent.mm.protobuf.i.a(41, "open_live_h5_buffer"));
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
