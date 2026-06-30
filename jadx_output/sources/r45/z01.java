package r45;

/* loaded from: classes.dex */
public class z01 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public z01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, dm.i4.COL_ID), com.tencent.mm.protobuf.i.u(3, "postUsername"), com.tencent.mm.protobuf.i.u(4, "objectNonceId"), com.tencent.mm.protobuf.i.r(5, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(6, "client_id"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
