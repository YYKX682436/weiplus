package su4;

/* loaded from: classes.dex */
public class o1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413023d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413024e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.z97 f413025f;

    /* renamed from: g, reason: collision with root package name */
    public r45.aa7 f413026g;

    /* renamed from: h, reason: collision with root package name */
    public final su4.r1 f413027h;

    public o1(su4.r1 r1Var) {
        this.f413027h = r1Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1161;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchsuggestion";
        lVar.f70664a = new r45.z97();
        lVar.f70665b = new r45.aa7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413024e = a17;
        r45.z97 z97Var = (r45.z97) a17.f70710a.f70684a;
        this.f413025f = z97Var;
        z97Var.f391822e = r1Var.f413062b;
        z97Var.f391824g = r1Var.f413064d;
        int i17 = r1Var.H;
        z97Var.f391825h = i17 == 0 ? com.tencent.mm.plugin.websearch.l2.a(6) : i17;
        z97Var.f391821d = r1Var.f413061a;
        z97Var.f391826i = su4.r2.i();
        z97Var.f391828n = r1Var.f413066f;
        z97Var.A = r1Var.f413082v;
        z97Var.G = su4.r2.g();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) r1Var.f413072l);
            z97Var.f391834t = new java.util.LinkedList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                this.f413025f.f391834t.add(java.net.URLDecoder.decode(jSONArray.getString(i18), com.tencent.mapsdk.internal.rv.f51270c));
            }
        } catch (java.lang.Exception e17) {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.NetSceneMMWebSuggest", e17, "decode json error", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413023d = u0Var;
        return dispatch(sVar, this.f413024e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1161;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneMMWebSuggest", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f413026g = (r45.aa7) this.f413024e.f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f413023d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
