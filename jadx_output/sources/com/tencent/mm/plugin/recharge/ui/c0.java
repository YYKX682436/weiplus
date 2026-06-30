package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155147d;

    public c0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155147d = phoneRechargeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155147d;
        phoneRechargeUI.hideVKB();
        phoneRechargeUI.finish();
        return true;
    }
}
