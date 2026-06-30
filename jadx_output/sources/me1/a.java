package me1;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 1158;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "openWeAppAuthManageList";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null || (t37 = yVar.t3()) == null || t37.r0() == null || jSONObject == null) {
            return;
        }
        bk1.d dVar = com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t38 = yVar.t3();
        android.app.Activity r07 = t38 != null ? t38.r0() : null;
        kotlin.jvm.internal.o.d(r07);
        dVar.a(r07, com.tencent.mm.plugin.appbrand.ui.privacy.AppBrandPrivacyPageContainerUI.class);
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, u(str, jSONObject2));
    }
}
