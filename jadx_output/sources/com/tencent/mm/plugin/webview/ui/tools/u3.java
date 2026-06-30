package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f186924e;

    public u3(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, boolean z17) {
        this.f186923d = c6Var;
        this.f186924e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f186923d.c0(true, this.f186924e);
    }
}
