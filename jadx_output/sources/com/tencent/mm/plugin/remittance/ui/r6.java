package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI f157920d;

    public r6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI) {
        this.f157920d = remittanceF2fLargeMoneyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f157920d.finish();
        return true;
    }
}
