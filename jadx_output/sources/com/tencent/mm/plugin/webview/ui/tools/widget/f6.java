package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f187221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187222f;

    public f6(nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f187220d = nVar;
        this.f187221e = wVar;
        this.f187222f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        nw4.n nVar = this.f187220d;
        if (nVar == null || (wVar = this.f187221e) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f187222f, "download_pause");
    }
}
