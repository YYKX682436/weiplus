package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187264e;

    public i3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, android.os.Bundle bundle) {
        this.f187264e = p3Var;
        this.f187263d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var = this.f187264e;
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = p3Var.f187495f;
        if (u3Var.f187554g == null || (wVar = u3Var.f187552e) == null || !wVar.c().f(42)) {
            return;
        }
        p3Var.f187495f.f187554g.D(this.f187263d, "download_removed");
    }
}
