package r61;

/* loaded from: classes2.dex */
public class a1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392814d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392815e;

    /* renamed from: f, reason: collision with root package name */
    public final int f392816f;

    public a1(int i17, java.lang.String str) {
        this.f392816f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mo0();
        lVar.f70665b = new r45.no0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/facebookauth";
        lVar.f70667d = 183;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f392815e = a17;
        r45.mo0 mo0Var = (r45.mo0) a17.f70710a.f70684a;
        mo0Var.f380709e = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str;
        mo0Var.f380708d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392814d = u0Var;
        return dispatch(sVar, this.f392815e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 183;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        if (i18 == 0 && i19 == 0) {
            r45.no0 no0Var = (r45.no0) this.f392815e.f70711b.f70700a;
            int i27 = no0Var.getBaseResponse().f376959d;
            if (i27 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneFaceBookAuth", "baseresponse.ret = " + i27);
                this.f392814d.onSceneEnd(4, i27, str, this);
                return;
            }
            int i28 = this.f392816f;
            if (i28 == 0 || i28 == 1) {
                gm0.j1.u().c().w(65825, "" + no0Var.f381556d);
                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).cj("" + no0Var.f381556d);
                gm0.j1.u().c().w(65826, "" + no0Var.f381557e);
                gm0.j1.u().c().i(true);
            }
        }
        this.f392814d.onSceneEnd(i18, i19, str, this);
    }
}
