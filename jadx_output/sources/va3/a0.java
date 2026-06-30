package va3;

/* loaded from: classes4.dex */
public class a0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f434257d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.ui.impl.d0 f434258e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.e0 f434259f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f434260g;

    public a0(com.tencent.mm.plugin.location.ui.impl.d0 d0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jl3();
        lVar.f70665b = new r45.kl3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpoidetail";
        lVar.f70667d = 11363;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f434260g = a17;
        this.f434258e = d0Var;
        r45.jl3 jl3Var = (r45.jl3) a17.f70710a.f70684a;
        java.lang.String str = d0Var.f144779e;
        if (str != null && str.contains("nearby_")) {
            str = str.replaceAll("nearby_", "qqmap_");
        }
        jl3Var.f377918d = str;
        jl3Var.f377919e = com.tencent.mm.sdk.platformtools.m2.d();
        jl3Var.f377920f = 2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPoiList", "NetSceneGetPoiDetail done.");
        this.f434257d = u0Var;
        return dispatch(sVar, this.f434260g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11363;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.kl3 kl3Var = (r45.kl3) this.f434260g.f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            this.f434259f = new com.tencent.mm.plugin.location.ui.impl.e0(kl3Var);
        }
        this.f434257d.onSceneEnd(i18, i19, str, this);
    }
}
