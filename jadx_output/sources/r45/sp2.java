package r45;

/* loaded from: classes.dex */
public class sp2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sp2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.r(4, "msg", r45.ch1.class), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.u(7, "object_nonce_id"), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(9, "finder_username"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6888;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpostliveappmsg";
        lVar.f70664a = this;
        lVar.f70665b = new r45.tp2();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
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
