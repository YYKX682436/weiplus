package r45;

/* loaded from: classes.dex */
public class ex0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ex0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "liveId"), com.tencent.mm.protobuf.i.u(3, "finderUsername"), com.tencent.mm.protobuf.i.n(4, "objectId"), com.tencent.mm.protobuf.i.u(5, "objcetNonceId"), com.tencent.mm.protobuf.i.i(6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
