package nd1;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f336416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f336418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd1.y0 f336421i;

    public x0(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.e9 e9Var, kotlin.jvm.internal.c0 c0Var, java.util.ArrayList arrayList, int i17, nd1.y0 y0Var) {
        this.f336416d = w2Var;
        this.f336417e = e9Var;
        this.f336418f = c0Var;
        this.f336419g = arrayList;
        this.f336420h = i17;
        this.f336421i = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f336416d;
        java.lang.String currentUrl = w2Var != null ? w2Var.getCurrentUrl() : null;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336417e;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.getRuntime().x0().getCurrentPage();
        if (android.text.TextUtils.equals(currentUrl, currentPage != null ? currentPage.getCurrentUrl() : null)) {
            com.tencent.mm.plugin.appbrand.page.w2 currentPage2 = e9Var.getRuntime().x0().getCurrentPage();
            if (currentPage2 != null) {
                currentPage2.K(oi1.n.f345607d, this.f336418f.f310112d ? new oi1.l("", this.f336419g) : null);
            }
            nd1.y0 y0Var = this.f336421i;
            y0Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            java.lang.String str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(this.f336420h, y0Var.u(str2, jSONObject));
        }
    }
}
