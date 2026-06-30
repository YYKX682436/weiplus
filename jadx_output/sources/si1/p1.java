package si1;

/* loaded from: classes7.dex */
public final class p1 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.j f408282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f408283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f408284c;

    public p1(com.tencent.mm.plugin.appbrand.jsapi.j jVar, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        this.f408282a = jVar;
        this.f408283b = k0Var;
        this.f408284c = d0Var;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.d9 d9Var = (com.tencent.mm.sdk.platformtools.d9) obj;
        com.tencent.mm.plugin.appbrand.jsapi.j jVar = this.f408282a;
        if (jVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f408283b;
            k0Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty("fail limited use") ? "fail:limited use" : "fail limited use";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 700001);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            jVar.b(k0Var.u(str, jSONObject));
        }
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f408284c;
        d0Var.m(new si1.o1(d0Var, d9Var));
    }
}
