package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f187136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f187138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187139g;

    public c6(android.app.Activity activity, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f187136d = activity;
        this.f187137e = nVar;
        this.f187138f = wVar;
        this.f187139g = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        android.app.Activity activity = this.f187136d;
        if (activity == null || activity.isFinishing() || (nVar = this.f187137e) == null || (wVar = this.f187138f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f187139g, "download_succ");
    }
}
