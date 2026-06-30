package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157801d;

    public l1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157801d = remittanceBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157801d;
        com.tencent.mm.wallet_core.ui.r1.V(remittanceBaseUI.getContext(), remittanceBaseUI.S, false);
        return false;
    }
}
