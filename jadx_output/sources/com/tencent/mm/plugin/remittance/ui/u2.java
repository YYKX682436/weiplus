package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n2 f157968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n2 f157969f;

    public u2(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.ui.n2 n2Var, com.tencent.mm.plugin.remittance.ui.n2 n2Var2) {
        this.f157967d = h3Var;
        this.f157968e = n2Var;
        this.f157969f = n2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout linearLayout = this.f157968e.f157831g;
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157967d;
        h3Var.Q(linearLayout, i65.a.b(h3Var.f157735d, 8) + this.f157969f.f157837p.getWidth());
    }
}
