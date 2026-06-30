package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186056f;

    public e5(nw4.k kVar, java.util.ArrayList arrayList, nw4.y2 y2Var) {
        this.f186054d = kVar;
        this.f186055e = arrayList;
        this.f186056f = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.k kVar = this.f186054d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(kVar.f340860a, 1, false);
        java.util.ArrayList arrayList = this.f186055e;
        k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b5(arrayList);
        nw4.y2 y2Var = this.f186056f;
        k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c5(arrayList, kVar, y2Var);
        k0Var.C = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.d5(kVar, y2Var);
        k0Var.v();
    }
}
