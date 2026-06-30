package fq4;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f265587d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f265588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265589f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f265590g = 0;

    public e(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cr3();
        lVar.f70665b = new r45.dr3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getvoiceprintresource";
        lVar.f70667d = 611;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f265588e = a17;
        r45.cr3 cr3Var = (r45.cr3) a17.f70710a.f70684a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetVoicePrintResource", "sceneType %d %s", java.lang.Integer.valueOf(i17), str);
        cr3Var.f371798d = i17;
        cr3Var.f371799e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f265587d = u0Var;
        return dispatch(sVar, this.f265588e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 611;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.dr3 dr3Var = (r45.dr3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0 && i19 != 0) {
            this.f265587d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.wr5 wr5Var = dr3Var.f372699d;
        if (wr5Var != null) {
            this.f265589f = new java.lang.String(wr5Var.f389403e.f371841f.f192156a);
            this.f265590g = dr3Var.f372699d.f389402d;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetVoicePrintResource", "resp ResourceData null ");
        }
        this.f265587d.onSceneEnd(i18, i19, str, this);
    }
}
