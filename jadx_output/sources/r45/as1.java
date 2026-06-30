package r45;

/* loaded from: classes.dex */
public class as1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public as1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "liveId"), com.tencent.mm.protobuf.i.n(4, "objectId"), com.tencent.mm.protobuf.i.u(5, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.i(6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(7, "object_nonce_id"), com.tencent.mm.protobuf.i.a(8, "live_contact_ext_info"), com.tencent.mm.protobuf.i.r(9, "ext_rel_info", r45.yn1.class));
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
