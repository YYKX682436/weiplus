package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155213d;

    public p0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155213d = rechargeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155213d;
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = rechargeUI.f155137v;
        rechargeUI.U6(new vs3.h(mallRechargeProduct.f155071e, mallRechargeProduct.f155070d, mallRechargeProduct.f155072f, rechargeUI.X6()));
    }
}
