package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class k6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI f157795d;

    public k6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        this.f157795d = remittanceF2fDynamicCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI.I;
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f157795d;
        if (remittanceF2fDynamicCodeUI.needConfirmFinish()) {
            remittanceF2fDynamicCodeUI.hideVKB();
            remittanceF2fDynamicCodeUI.showDialog(1000);
            return true;
        }
        remittanceF2fDynamicCodeUI.setResult(0, new android.content.Intent().putExtra("key_pay_reslut_type", 4));
        remittanceF2fDynamicCodeUI.finish();
        return true;
    }
}
