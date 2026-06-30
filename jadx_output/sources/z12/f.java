package z12;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469286d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469287e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f469288f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.uj0 f469289g;

    /* renamed from: h, reason: collision with root package name */
    public final int f469290h;

    /* renamed from: i, reason: collision with root package name */
    public final int f469291i;

    public f(java.lang.String str, r45.uj0 uj0Var, int i17, int i18) {
        this.f469290h = i17;
        this.f469291i = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.eb();
        lVar.f70665b = new r45.fb();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmaskforreward";
        lVar.f70667d = 830;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469286d = lVar.a();
        this.f469288f = str;
        this.f469289g = uj0Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469287e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469286d;
        r45.eb ebVar = (r45.eb) oVar.f70710a.f70684a;
        int i17 = this.f469290h;
        ebVar.f373209g = i17;
        int i18 = this.f469291i;
        ebVar.f373210h = i18;
        ebVar.f373206d = this.f469288f;
        r45.uj0 uj0Var = new r45.uj0();
        r45.uj0 uj0Var2 = this.f469289g;
        uj0Var.f387410d = uj0Var2.f387410d;
        uj0Var.f387412f = uj0Var2.f387412f;
        try {
            uj0Var.f387411e = new java.text.DecimalFormat("0.00").format(java.lang.Float.valueOf(uj0Var2.f387411e));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.NetSceneAskForReward", e17, "format error %s", uj0Var2.f387411e);
            uj0Var.f387411e = "0.00";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneAskForReward", "doScene scene:%s, enterScene:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ebVar.f373207e = uj0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 830;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f469287e.onSceneEnd(i18, i19, str, this);
    }
}
