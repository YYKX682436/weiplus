package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185018e;

    public c4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent) {
        this.f185018e = c1Var;
        this.f185017d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.k(this.f185018e.f184975d, "scanner", ".ui.BaseScanUI", this.f185017d, false);
    }
}
