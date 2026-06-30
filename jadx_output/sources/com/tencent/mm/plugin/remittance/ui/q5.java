package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class q5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f157898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157899e;

    public q5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, java.util.ArrayList arrayList) {
        this.f157899e = remittanceDetailUI;
        this.f157898d = arrayList;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f157899e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.remittance.ui.o5(this);
        k0Var.f211881s = new com.tencent.mm.plugin.remittance.ui.p5(this);
        k0Var.v();
        return true;
    }
}
