package r45;

/* loaded from: classes.dex */
public class m81 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public m81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "mentionType"), com.tencent.mm.protobuf.i.a(3, "lastBuf"), com.tencent.mm.protobuf.i.u(4, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.i(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(6, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.i(7, "requestScene"), com.tencent.mm.protobuf.i.n(9, "aggregated_root_mention_id"), com.tencent.mm.protobuf.i.u(10, "wx_username"), com.tencent.mm.protobuf.i.i(20, "fetch_mode"), com.tencent.mm.protobuf.i.a(21, "page_buffer"));
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
