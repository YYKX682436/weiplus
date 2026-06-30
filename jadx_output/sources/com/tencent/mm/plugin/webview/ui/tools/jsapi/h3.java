package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185162e;

    public h3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent) {
        this.f185162e = c1Var;
        this.f185161d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f185162e.f184975d, "webview", ".ui.tools.WebViewUI", this.f185161d, null);
    }
}
