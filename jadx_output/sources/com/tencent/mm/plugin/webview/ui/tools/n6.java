package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f185859e;

    public n6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, boolean z17) {
        this.f185859e = c6Var;
        this.f185858d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f185859e.F(this.f185858d);
    }
}
