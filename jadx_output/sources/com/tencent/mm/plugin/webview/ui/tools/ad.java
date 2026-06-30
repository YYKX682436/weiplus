package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f183913e;

    public ad(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, android.os.Bundle bundle) {
        this.f183913e = ldVar;
        this.f183912d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f183913e;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = ldVar.f185654e;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        boolean z17 = this.f183912d.getBoolean("key_current_info_show");
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.ld.f185649s).get(ldVar.f(ldVar.f185657h));
        if (bundle != null) {
            bundle.putBoolean("key_current_info_show", z17);
        }
        if (z17 || ldVar.i(bundle)) {
            ldVar.q();
        } else {
            ldVar.g();
        }
    }
}
