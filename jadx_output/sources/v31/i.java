package v31;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 1402;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "predownloadPlayablePackage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("extra") : null;
        if (optString == null) {
            optString = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "playableService invoke");
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Di(null, new v31.f(component));
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        java.lang.String str = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew().f147881d;
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "downloadPlayablePackage");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optString);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        ((a41.k) iVar).Ai(str, gVar2);
        ((com.tencent.mm.plugin.appbrand.y) component).getRuntime().N.a(new v31.h(component));
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        component.a(i17, u(str3, jSONObject2));
    }
}
