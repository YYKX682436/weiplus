package v31;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 1406;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "postMessageToPlayableLib";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("extra") : null;
        if (optString == null) {
            optString = "";
        }
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew mbJsEventOnPlayableCustomEventNew = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew();
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "customEvent");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optString);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        ((a41.k) iVar).Ai(mbJsEventOnPlayableCustomEventNew.f147881d, gVar2);
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        component.a(i17, u(str2, jSONObject2));
    }
}
