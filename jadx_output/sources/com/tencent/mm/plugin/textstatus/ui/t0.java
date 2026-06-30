package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.h1 f174303d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f174304e;

    public t0(com.tencent.mm.plugin.textstatus.ui.h1 tabMoreView) {
        kotlin.jvm.internal.o.g(tabMoreView, "tabMoreView");
        this.f174303d = tabMoreView;
        this.f174304e = "";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f174304e;
        com.tencent.mm.plugin.textstatus.ui.h1 h1Var = this.f174303d;
        h1Var.f173928m = str;
        h1Var.l(ai4.m0.f5173a.M(str));
        h1Var.s();
        h1Var.t();
        ((cj4.i1) h1Var.T).A1 = h1Var.f173943x1;
    }
}
