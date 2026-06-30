package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f142981d;

    public p3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f142981d = iPCallRechargeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.f142650z;
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f142981d;
        db5.e1.h(iPCallRechargeUI.getContext(), null, null, iPCallRechargeUI.getResources().getString(com.tencent.mm.R.string.g5z), false, new com.tencent.mm.plugin.ipcall.ui.s3(iPCallRechargeUI));
        return true;
    }
}
