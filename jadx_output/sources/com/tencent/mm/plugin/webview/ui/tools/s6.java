package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class s6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f186841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f186842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.d f186845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186846i;

    public s6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, android.content.Intent intent, boolean z17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.permission.d dVar) {
        this.f186846i = c6Var;
        this.f186841d = intent;
        this.f186842e = z17;
        this.f186843f = str;
        this.f186844g = str2;
        this.f186845h = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f186846i;
        try {
            com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(c6Var.c().getDir("expose", 0));
            j17.J();
            com.tencent.mm.ui.widget.MMWebView mMWebView = c6Var.c().f183815f;
            android.graphics.Bitmap c17 = (mMWebView == null || !mMWebView.isXWalkKernel()) ? com.tencent.mm.sdk.platformtools.m7.c(c6Var.c()) : mMWebView.f();
            java.lang.String str = j17.o() + "/screenshot.jpg";
            android.content.Intent intent = this.f186841d;
            if (c17 != null) {
                com.tencent.mm.sdk.platformtools.x.D0(c17, 75, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                intent.putExtra("k_webview_img", str);
            }
            if (!this.f186842e) {
                j45.l.j(c6Var.c(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            if (!j62.e.g().l("clicfg_webview_expose_config_switch_android", false, false, true)) {
                j45.l.j(c6Var.c(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":34}");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("k_expose_url", this.f186843f);
            bundle2.putString("k_expose_raw_url", c6Var.c().F7());
            bundle2.putInt("k_expose_web_scene", c6Var.c().L1.k0(this.f186844g));
            bundle2.putString("k_webview_img", str);
            bundle2.putInt("lastGetA8KeyRequestId", this.f186845h.f183390j);
            bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(c6Var.c(), bundle, true, false, new com.tencent.mm.plugin.webview.ui.tools.r6(this));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "[oneliang]save screen shot to file error, ex = " + e17.getMessage());
        }
    }
}
