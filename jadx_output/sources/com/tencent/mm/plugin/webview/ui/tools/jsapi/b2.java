package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f184943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184944e;

    public b2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent) {
        this.f184944e = c1Var;
        this.f184943d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        o25.t1 t1Var = dw4.a.f244297a;
        ((com.tencent.mm.app.y7) t1Var).l(this.f184943d, this.f184944e.f184975d);
    }
}
