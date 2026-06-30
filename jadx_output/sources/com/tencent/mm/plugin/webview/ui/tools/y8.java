package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f187701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f187702h;

    public y8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f187702h = u7Var;
        this.f187698d = str;
        this.f187699e = str2;
        this.f187700f = bundle;
        this.f187701g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f187702h;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing()) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183844p0.O(this.f187698d, this.f187699e, nw4.a.a(this.f187700f), this.f187701g);
    }
}
