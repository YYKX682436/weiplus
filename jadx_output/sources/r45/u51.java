package r45;

/* loaded from: classes.dex */
public class u51 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public u51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "finderUsername"), com.tencent.mm.protobuf.i.n(3, "lastId"), com.tencent.mm.protobuf.i.a(4, "lastBuff"), com.tencent.mm.protobuf.i.r(5, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.n(6, "onlyDuringLiveId"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
