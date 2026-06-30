package r45;

/* loaded from: classes2.dex */
public class sz2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sz2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.i(4, "interaction_type"), com.tencent.mm.protobuf.i.u(5, "wx_username"), com.tencent.mm.protobuf.i.n(6, "mention_id"), com.tencent.mm.protobuf.i.i(7, "op_type"), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.n(9, "object_id"), com.tencent.mm.protobuf.i.r(10, "share_user_info", r45.nv2.class));
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
