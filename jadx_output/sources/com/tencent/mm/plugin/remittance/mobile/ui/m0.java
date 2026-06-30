package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156692d;

    public m0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f156692d = mobileRemitNumberInputUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f156692d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.remittance.mobile.ui.j0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.remittance.mobile.ui.l0(this);
        k0Var.v();
        return false;
    }
}
