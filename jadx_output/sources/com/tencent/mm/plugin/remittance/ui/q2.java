package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n2 f157895e;

    public q2(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.ui.n2 n2Var) {
        this.f157894d = h3Var;
        this.f157895e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.remittance.ui.n2 n2Var = this.f157895e;
        android.widget.LinearLayout linearLayout = n2Var.f157831g;
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157894d;
        h3Var.Q(linearLayout, i65.a.b(h3Var.f157735d, 8) + n2Var.f157837p.getWidth());
    }
}
