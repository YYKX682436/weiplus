package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ra implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186817b;

    public ra(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.view.View view) {
        this.f186817b = webViewUI;
        this.f186816a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0 && this.f186817b.B) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI.Z6(this.f186816a, 5894);
        }
    }
}
