package r45;

/* loaded from: classes2.dex */
public class hu2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public hu2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(4, "hotwordLastBuffer"), com.tencent.mm.protobuf.i.a(5, "hotwordSessionBuffer"), com.tencent.mm.protobuf.i.a(6, "objHotwordInfoBuff"), com.tencent.mm.protobuf.i.i(7, "limit"));
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
