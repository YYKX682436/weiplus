package nd1;

/* loaded from: classes7.dex */
public final class h0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "initReadyForPrerender";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke appId:");
        sb6.append(v5Var != null ? v5Var.getAppId() : null);
        sb6.append(" webviewId:");
        sb6.append(v5Var != null ? v5Var.getComponentId() : 0);
        sb6.append(", url:");
        sb6.append(v5Var != null ? v5Var.X1() : null);
        com.tencent.mars.xlog.Log.i("Luggage.JsApiPageInitReadyForPreRender", sb6.toString());
        java.lang.String o17 = o("ok");
        kotlin.jvm.internal.o.f(o17, "makeReturnJson(...)");
        return o17;
    }
}
