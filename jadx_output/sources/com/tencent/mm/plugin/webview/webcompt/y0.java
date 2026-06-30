package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class y0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f187949a;

    public y0(yz5.l lVar) {
        this.f187949a = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f187949a.invoke((java.lang.String) obj);
    }
}
