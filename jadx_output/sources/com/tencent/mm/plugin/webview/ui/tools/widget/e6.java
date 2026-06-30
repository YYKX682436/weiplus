package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f187201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187202f;

    public e6(nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f187200d = nVar;
        this.f187201e = wVar;
        this.f187202f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        nw4.n nVar = this.f187200d;
        if (nVar == null || (wVar = this.f187201e) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f187202f, "download_removed");
    }
}
