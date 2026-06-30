package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI f156642d;

    public b(com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        this.f156642d = bankMobileRemittanceChooseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f156642d.finish();
        return true;
    }
}
