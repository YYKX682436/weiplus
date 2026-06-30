package r45;

/* loaded from: classes2.dex */
public class sj4 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sj4() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "megaBaseRequest", r45.pj4.class), com.tencent.mm.protobuf.i.n(3, "videoId"), com.tencent.mm.protobuf.i.u(4, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(5, "videoNonceId"), com.tencent.mm.protobuf.i.u(6, "encryptedVideoId"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
