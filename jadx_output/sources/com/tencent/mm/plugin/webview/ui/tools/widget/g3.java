package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187231e;

    public g3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, android.os.Bundle bundle) {
        this.f187231e = p3Var;
        this.f187230d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var = this.f187231e;
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = p3Var.f187495f;
        if (u3Var.f187554g == null || (wVar = u3Var.f187552e) == null || !wVar.c().f(42)) {
            return;
        }
        p3Var.f187495f.f187554g.D(this.f187230d, "download_succ");
    }
}
