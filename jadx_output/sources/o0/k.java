package o0;

/* loaded from: classes16.dex */
public class k extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.a(4, "live_cookies"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.n(6, "live_id"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(8, "last_buffer"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i a() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11572;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliveglorylist";
        lVar.f70664a = this;
        lVar.f70665b = new o0.l();
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
