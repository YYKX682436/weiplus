package r45;

/* loaded from: classes2.dex */
public class k13 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k13() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "totalLen"), com.tencent.mm.protobuf.i.i(3, "startPos"), com.tencent.mm.protobuf.i.a(4, "datas"), com.tencent.mm.protobuf.i.u(5, "imgMD5"), com.tencent.mm.protobuf.i.i(6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(7, "finderBaseRequest", r45.kv0.class));
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
