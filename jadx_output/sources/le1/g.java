package le1;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f318131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f318132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f318133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f318134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ le1.h f318135h;

    public g(com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z17, com.tencent.mm.plugin.appbrand.y yVar, int i17, le1.h hVar) {
        this.f318131d = o6Var;
        this.f318132e = z17;
        this.f318133f = yVar;
        this.f318134g = i17;
        this.f318135h = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f318131d;
        if (o6Var.u0().L1.f77369s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetHalfScreenState", "skip, halfScreenConfig.forbidSlidingUpGesture=true");
        } else {
            boolean z17 = this.f318132e;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetHalfScreenState", "call forceForbidDragExpand=%b", java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
            l0Var.f91201g = z17;
            com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
            if (f0Var != null) {
                f0Var.c0(z17);
            }
        }
        le1.h hVar = this.f318135h;
        hVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f318133f.a(this.f318134g, hVar.u(str, jSONObject));
    }
}
