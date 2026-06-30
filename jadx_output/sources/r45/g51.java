package r45;

/* loaded from: classes2.dex */
public class g51 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "objectId"), com.tencent.mm.protobuf.i.n(3, "maxCommentId"), com.tencent.mm.protobuf.i.i(4, "needObject"), com.tencent.mm.protobuf.i.a(5, "lastBuffer"), com.tencent.mm.protobuf.i.n(6, "rootCommentId"), com.tencent.mm.protobuf.i.u(7, "finderUsername"), com.tencent.mm.protobuf.i.n(8, "refCommentId"), com.tencent.mm.protobuf.i.i(9, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(10, com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION), com.tencent.mm.protobuf.i.u(11, "encryptedObjectid"), com.tencent.mm.protobuf.i.u(12, "objectNonceId"), com.tencent.mm.protobuf.i.r(13, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.i(14, "identityScene"), com.tencent.mm.protobuf.i.i(15, "pullScene"), com.tencent.mm.protobuf.i.a(16, "likeBuffer"), com.tencent.mm.protobuf.i.i(17, "platform_scene"), com.tencent.mm.protobuf.i.i(18, "need_selection"), com.tencent.mm.protobuf.i.g(19, "longitude"), com.tencent.mm.protobuf.i.g(20, "latitude"), com.tencent.mm.protobuf.i.r(21, "status", r45.dx0.class), com.tencent.mm.protobuf.i.r(22, "vertifyInfo", r45.u32.class), com.tencent.mm.protobuf.i.a(23, "trace_buffer"), com.tencent.mm.protobuf.i.u(24, "session_buffer"), com.tencent.mm.protobuf.i.i(25, "share_time"), com.tencent.mm.protobuf.i.r(29, "tab_tips_info", r45.sf6.class), com.tencent.mm.protobuf.i.n(31, "request_scene"), com.tencent.mm.protobuf.i.r(34, "share_user_info", r45.nv2.class), com.tencent.mm.protobuf.i.i(35, "related_scene"), com.tencent.mm.protobuf.i.u(36, "from_session_id"));
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
