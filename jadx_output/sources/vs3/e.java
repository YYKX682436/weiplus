package vs3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f439884d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f439885e;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f439888h;

    /* renamed from: m, reason: collision with root package name */
    public final int f439890m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f439891n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f439892o;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.model.MallRechargeProduct f439886f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f439887g = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f439889i = null;

    public e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f439888h = str;
        this.f439890m = i17;
        this.f439891n = str5;
        this.f439892o = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qh3();
        lVar.f70665b = new r45.rh3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlatestpayproductinfo";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.storage.l.CTRL_INDEX;
        lVar.f70668e = 229;
        lVar.f70669f = 1000000229;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f439885e = a17;
        r45.qh3 qh3Var = (r45.qh3) a17.f70710a.f70684a;
        qh3Var.f383990d = str;
        qh3Var.f383992f = str3;
        qh3Var.f383991e = str2;
        qh3Var.f383993g = str4;
        qh3Var.f383994h = bt4.f.b().c(str);
        java.lang.String.format("funcId:%s, appId:%s, productId:%s, remark:%s", str, str3, str2, str4);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f439884d = u0Var;
        return dispatch(sVar, this.f439885e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.storage.l.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String[] split;
        r45.rh3 rh3Var = (r45.rh3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.String str2 = rh3Var.f384867g;
        this.f439889i = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (split = str2.split("&")) != null && split.length > 0) {
            boolean z17 = true;
            for (java.lang.String str3 : split) {
                java.lang.String[] split2 = str3.split("=");
                if (split2.length == 2) {
                    if (z17) {
                        z17 = false;
                    } else {
                        this.f439889i += " ";
                    }
                    this.f439889i += split2[1];
                }
            }
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(rh3Var.f384870m);
        java.lang.String str4 = this.f439888h;
        if (!K0) {
            try {
                this.f439887g = vs3.b.d(str4, new org.json.JSONObject(rh3Var.f384870m).optJSONArray("product_info"));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", e17, "", new java.lang.Object[0]);
            }
        }
        if (i18 == 0 && i19 == 0) {
            java.lang.String str5 = rh3Var.f384864d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                try {
                    com.tencent.mm.plugin.recharge.model.MallRechargeProduct c17 = vs3.b.c(str4, new org.json.JSONObject(str5));
                    this.f439886f = c17;
                    c17.f155074h = this.f439889i;
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", e18, "", new java.lang.Object[0]);
                }
            }
        }
        java.lang.String.format("OutErrCode : %d ,OutErrMsg : %s , WxErrCode : %d , WxErrMsg : %s", java.lang.Integer.valueOf(rh3Var.f384865e), rh3Var.f384866f, java.lang.Integer.valueOf(rh3Var.f384868h), rh3Var.f384869i);
        if (i19 == 0 && (i19 = rh3Var.f384868h) == 0) {
            i19 = rh3Var.f384865e;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = !com.tencent.mm.sdk.platformtools.t8.K0(rh3Var.f384869i) ? rh3Var.f384869i : rh3Var.f384866f;
        }
        this.f439884d.onSceneEnd(i18, i19, str, this);
    }
}
