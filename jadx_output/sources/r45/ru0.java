package r45;

/* loaded from: classes2.dex */
public class ru0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ru0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "anchorFinderUsername"), com.tencent.mm.protobuf.i.u(3, "noticeId"), com.tencent.mm.protobuf.i.i(4, "opType"), com.tencent.mm.protobuf.i.n(5, "ref_object_id"), com.tencent.mm.protobuf.i.r(6, "verify_info", r45.u32.class), com.tencent.mm.protobuf.i.u(7, "promoter_token"), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(9, "user_page_enter_type"), com.tencent.mm.protobuf.i.u(10, "session_buffer"), com.tencent.mm.protobuf.i.u(11, "client_info"), com.tencent.mm.protobuf.i.i(12, "notice_aggregate_type"), com.tencent.mm.protobuf.i.u(13, "qrcode_url"), com.tencent.mm.protobuf.i.l(14, "notice_aggregate_type_list"), com.tencent.mm.protobuf.i.a(15, "live_cookies"), com.tencent.mm.protobuf.i.u(16, "my_finder_username"), com.tencent.mm.protobuf.i.r(17, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(18, "gmsg_id"));
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
