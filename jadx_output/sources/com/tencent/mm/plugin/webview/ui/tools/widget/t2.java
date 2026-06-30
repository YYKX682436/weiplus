package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.u3 f187540d;

    public t2(com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var) {
        this.f187540d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187540d;
        nw4.v2 v2Var = u3Var.f187553f;
        if (v2Var == null) {
            return;
        }
        v2Var.b();
        u3Var.f187553f.d();
    }
}
