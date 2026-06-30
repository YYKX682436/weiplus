package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185468e;

    public v3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent) {
        this.f185468e = c1Var;
        this.f185467d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f185468e.f184975d, "webview", ".ui.tools.WebViewUI", this.f185467d, null);
    }
}
