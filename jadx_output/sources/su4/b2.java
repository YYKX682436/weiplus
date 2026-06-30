package su4;

/* loaded from: classes.dex */
public class b2 extends su4.b implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412818f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412819g;

    /* renamed from: h, reason: collision with root package name */
    public r45.aa7 f412820h;

    public b2(su4.r1 r1Var) {
        java.lang.String str = r1Var.f413062b;
        this.f412814d = str;
        this.f412815e = r1Var.f413077q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.NetSceneWebSuggest", "keyword is unavailable");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSuggest", "Constructors: query=%s", r1Var.f413062b);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        if (r1Var.f413079s == 1) {
            lVar.f70667d = 1747;
            lVar.f70666c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsuggestion";
        } else {
            lVar.f70667d = 1161;
            lVar.f70666c = "/cgi-bin/mmsearch-bin/searchsuggestion";
        }
        lVar.f70664a = new r45.z97();
        lVar.f70665b = new r45.aa7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412819g = a17;
        r45.z97 z97Var = (r45.z97) a17.f70710a.f70684a;
        z97Var.f391822e = r1Var.f413062b;
        z97Var.f391824g = r1Var.f413064d;
        int i17 = r1Var.H;
        z97Var.f391825h = i17 == 0 ? com.tencent.mm.plugin.websearch.l2.a(0) : i17;
        z97Var.f391821d = r1Var.f413061a;
        z97Var.f391826i = su4.r2.i();
        z97Var.f391828n = r1Var.f413066f;
        z97Var.A = r1Var.f413082v;
        z97Var.G = su4.r2.g();
        z97Var.f391837w = r1Var.f413075o;
        if (r1Var.f413081u != null) {
            try {
                z97Var.B = new com.tencent.mm.protobuf.g(r1Var.f413081u.toByteArray());
            } catch (java.lang.Exception unused) {
            }
        }
        if (r1Var.f413080t != null) {
            try {
                z97Var.f391840z = new com.tencent.mm.protobuf.g(r1Var.f413080t.toByteArray());
            } catch (java.io.IOException unused2) {
            }
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) r1Var.f413072l);
            z97Var.f391834t = new java.util.LinkedList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                z97Var.f391834t.add(java.net.URLDecoder.decode(jSONArray.getString(i18), com.tencent.mapsdk.internal.rv.f51270c));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.NetSceneWebSuggest", e17, "decode json error", new java.lang.Object[0]);
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(r1Var.f413064d);
        objArr[1] = java.lang.Boolean.valueOf(z97Var.f391826i != null);
        objArr[2] = java.lang.Integer.valueOf(r1Var.f413066f);
        objArr[3] = java.lang.Integer.valueOf(r1Var.f413064d);
        objArr[4] = java.lang.Integer.valueOf(r1Var.f413061a);
        objArr[5] = java.lang.Integer.valueOf(r1Var.f413077q);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSuggest", "businessTypeList is %d | contains location = %b | scene=%d | businessType=%d | isHomePage=%b | webViewId=%d", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412818f = u0Var;
        return dispatch(sVar, this.f412819g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1161;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSuggest", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f412818f.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.aa7 aa7Var = (r45.aa7) this.f412819g.f70711b.f70700a;
        this.f412820h = aa7Var;
        if (aa7Var != null) {
            java.lang.String str2 = aa7Var.f369877f;
        }
        this.f412818f.onSceneEnd(i18, i19, str, this);
    }
}
