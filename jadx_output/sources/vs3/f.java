package vs3;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f439893d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f439894e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f439895f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f439896g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f439897h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f439898i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f439899m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f439900n;

    public f(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vk3();
        lVar.f70665b = new r45.wk3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpayfunctionproductlist";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
        lVar.f70668e = 228;
        lVar.f70669f = 1000000228;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f439894e = a17;
        r45.vk3 vk3Var = (r45.vk3) a17.f70710a.f70684a;
        this.f439896g = str;
        vk3Var.f388316d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f439893d = u0Var;
        return dispatch(sVar, this.f439894e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.wk3 wk3Var = (r45.wk3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            java.lang.String str2 = wk3Var.f389227d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                try {
                    this.f439895f = vs3.b.d(this.f439896g, new org.json.JSONObject(str2).getJSONArray("pay_product_list"));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", e17, "", new java.lang.Object[0]);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wk3Var.f389228e)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(wk3Var.f389228e);
                    this.f439897h = jSONObject.optString("balance_link");
                    this.f439899m = jSONObject.optString("recharge_link");
                    this.f439898i = jSONObject.optString("balance_wording");
                    this.f439900n = jSONObject.optString("recharge_wording");
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", e18, "", new java.lang.Object[0]);
                }
            }
        }
        this.f439893d.onSceneEnd(i18, i19, str, this);
    }
}
