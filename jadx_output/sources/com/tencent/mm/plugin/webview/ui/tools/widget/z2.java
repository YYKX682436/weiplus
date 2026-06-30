package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187620e;

    public z2(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, android.os.Bundle bundle) {
        this.f187620e = p3Var;
        this.f187619d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var = this.f187620e;
        if (p3Var.f187495f.f187554g != null) {
            p3Var.f187495f.f187554g.X(this.f187619d.getString("webview_network_type"));
        }
    }
}
