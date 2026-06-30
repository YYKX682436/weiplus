package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185297e;

    public n7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185297e = c1Var;
        this.f185296d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185297e;
        android.content.Context context = c1Var.f184975d;
        db5.e1.A(context, j65.q.a(context).getString(com.tencent.mm.R.string.h9b), "", j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.h9d), j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webview.ui.tools.jsapi.l7(this), new com.tencent.mm.plugin.webview.ui.tools.jsapi.m7(this));
    }
}
