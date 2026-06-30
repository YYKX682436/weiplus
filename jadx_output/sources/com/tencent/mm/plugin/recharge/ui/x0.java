package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155252d;

    public x0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155252d = rechargeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155252d;
        rechargeUI.hideVKB();
        rechargeUI.finish();
        return true;
    }
}
