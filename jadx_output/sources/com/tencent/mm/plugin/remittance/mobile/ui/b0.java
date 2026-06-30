package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156643d;

    public b0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f156643d = mobileRemitNumberInputUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI.f156574v;
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f156643d;
        mobileRemitNumberInputUI.getClass();
        mobileRemitNumberInputUI.hideVKB();
        mobileRemitNumberInputUI.finish();
        return true;
    }
}
