package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155256e;

    public z(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, java.lang.String str) {
        this.f155256e = phoneRechargeUI;
        this.f155255d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f155255d;
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155256e;
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.X6(phoneRechargeUI, com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.W6(phoneRechargeUI, str), phoneRechargeUI.getString(com.tencent.mm.R.string.f493609ky3), "");
    }
}
