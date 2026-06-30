package pf1;

/* loaded from: classes7.dex */
public final class b0 extends gb1.i {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "sendToHTMLVConsoleView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B((com.tencent.mm.plugin.appbrand.y) lVar, jSONObject, i17, null);
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("htmlId");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void B(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        java.lang.String str;
        java.lang.String str2;
        if (yVar == null || jSONObject == null) {
            return;
        }
        try {
            android.view.KeyEvent.Callback D = D(yVar, jSONObject);
            java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            kotlin.jvm.internal.o.e(D, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webview.vconsole.HTMLVConsoleContract.IView");
            ((pf1.q) ((pf1.e) ((pf1.q) ((pf1.c) D)).getController()).f353771a).f353790f.g("onMiniProgramMessage", optString);
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.d0(i17, u(str2, jSONObject2), c0Var);
        } catch (java.lang.IllegalArgumentException e18) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:" + e18.getMessage() : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.d0(i17, u(str2, jSONObject3), c0Var);
        }
    }
}
