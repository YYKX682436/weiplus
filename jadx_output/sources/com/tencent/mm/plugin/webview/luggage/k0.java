package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class k0 implements android.webkit.WebView.FindListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182545a;

    public k0(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182545a = e0Var;
    }

    @Override // android.webkit.WebView.FindListener
    public void onFindResultReceived(int i17, int i18, boolean z17) {
        this.f182545a.f182189w.d(i17, i18, z17);
    }
}
