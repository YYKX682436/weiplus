package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class j1 implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f153504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153506c;

    public j1(com.tencent.mm.plugin.profile.e0 e0Var, j41.e0 e0Var2, java.lang.String str) {
        this.f153506c = e0Var;
        this.f153504a = e0Var2;
        this.f153505b = str;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        android.content.Intent intent = new android.content.Intent();
        try {
            str = new org.json.JSONObject(this.f153504a.f297623e).optString("url");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewContactWidgetNormal", e17, "loadProfile", new java.lang.Object[0]);
            str = "";
        }
        intent.putExtra("geta8key_scene", 58);
        java.lang.String str2 = this.f153505b;
        intent.putExtra("geta8key_username", str2);
        intent.putExtra("msgUsername", str2);
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f153506c.f153420d, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
