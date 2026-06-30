package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185043e;

    public d1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent) {
        this.f185043e = c1Var;
        this.f185042d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f185043e.f184975d, "webview", ".ui.tools.WebViewUI", this.f185042d, null);
    }
}
