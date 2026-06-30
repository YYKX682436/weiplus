package r45;

/* loaded from: classes2.dex */
public class qd1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public qd1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "objectId"), com.tencent.mm.protobuf.i.n(3, "commentId"), com.tencent.mm.protobuf.i.i(4, "opType"), com.tencent.mm.protobuf.i.n(5, "likeId"), com.tencent.mm.protobuf.i.i(6, "curLikeCount"), com.tencent.mm.protobuf.i.u(7, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(9, "objectNonceId"), com.tencent.mm.protobuf.i.r(10, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(11, "sessionBuffer"), com.tencent.mm.protobuf.i.u(12, "likeUsername"), com.tencent.mm.protobuf.i.i(13, "isPrivate"), com.tencent.mm.protobuf.i.i(14, "visibilityMode"), com.tencent.mm.protobuf.i.l(15, "visibilityLabelIdList"), com.tencent.mm.protobuf.i.i(16, "sourceType"), com.tencent.mm.protobuf.i.u(17, "export_id"), com.tencent.mm.protobuf.i.i(18, "platform_scene"), com.tencent.mm.protobuf.i.r(19, "newlife_report_info", r45.pd1.class), com.tencent.mm.protobuf.i.r(21, "show_milestone_info", r45.bc1.class), com.tencent.mm.protobuf.i.a(100, "bypass_buffer"), com.tencent.mm.protobuf.i.i(101, "bypass_buffer_type"));
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
