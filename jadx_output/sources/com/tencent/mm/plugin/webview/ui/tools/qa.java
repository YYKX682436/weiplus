package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class qa implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186778a;

    public qa(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186778a = webViewUI;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186778a;
        com.tencent.mm.plugin.webview.permission.w wVar = webViewUI.f183876z1;
        if (wVar == null || wVar.c() == null || !webViewUI.f183876z1.c().f(413)) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isAccessibilityMode", java.lang.Boolean.valueOf(z17));
        webViewUI.L1.g0().o("onAccessibilityStateChange", hashMap);
    }
}
