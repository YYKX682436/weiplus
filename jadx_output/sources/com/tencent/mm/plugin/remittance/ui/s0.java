package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157929d;

    public s0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157929d = remittanceBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157929d;
        int i17 = remittanceBaseUI.f157140m;
        if (i17 == 1 || i17 == 6) {
            remittanceBaseUI.Y6();
            remittanceBaseUI.finish();
        } else if (i17 == 2 || i17 == 5) {
            remittanceBaseUI.finish();
        } else {
            remittanceBaseUI.d7();
        }
        remittanceBaseUI.W6();
        return true;
    }
}
