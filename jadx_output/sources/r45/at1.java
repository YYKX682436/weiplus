package r45;

/* loaded from: classes.dex */
public class at1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public at1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finderUsername"), com.tencent.mm.protobuf.i.i(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.n(5, "liveId"), com.tencent.mm.protobuf.i.n(6, "objectId"), com.tencent.mm.protobuf.i.u(7, "objectNonceId"), com.tencent.mm.protobuf.i.a(8, "lastBuffer"), com.tencent.mm.protobuf.i.i(9, "get_type"), com.tencent.mm.protobuf.i.i(10, "support_multi_type"));
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
