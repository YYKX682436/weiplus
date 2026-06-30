package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f187253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187254f;

    public h6(nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f187252d = nVar;
        this.f187253e = wVar;
        this.f187254f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        nw4.n nVar = this.f187252d;
        if (nVar == null || (wVar = this.f187253e) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f187254f, "download_start");
    }
}
