package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185086e;

    public f(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17) {
        this.f185085d = c1Var;
        this.f185086e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f185085d.mmOnActivityResult(this.f185086e, 1, new android.content.Intent());
    }
}
