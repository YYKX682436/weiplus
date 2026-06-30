package nd1;

/* loaded from: classes7.dex */
public final class j0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 955;
    public static final java.lang.String NAME = "preloadWebview";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime;
        com.tencent.mm.plugin.appbrand.page.i3 x07;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke appId:");
        sb6.append(v5Var != null ? v5Var.getAppId() : null);
        sb6.append(", webviewId:");
        sb6.append(v5Var != null ? v5Var.getComponentId() : 0);
        sb6.append(", url:");
        sb6.append(v5Var != null ? v5Var.X1() : null);
        com.tencent.mars.xlog.Log.i("Luggage.JsApiPreloadNextWebview", sb6.toString());
        if (v5Var != null && (runtime = v5Var.getRuntime()) != null && (x07 = runtime.x0()) != null) {
            x07.O(NAME);
        }
        if (v5Var != null) {
            v5Var.a(i17, o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
