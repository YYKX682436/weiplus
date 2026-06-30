package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class j0 implements com.tencent.mm.plugin.recharge.ui.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155194a;

    public j0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155194a = phoneRechargeUI;
    }

    @Override // com.tencent.mm.plugin.recharge.ui.p
    public void a(vr4.b1 b1Var) {
        if (b1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: no product item");
            return;
        }
        java.lang.String str = b1Var.f439701r;
        java.lang.String str2 = b1Var.f439702s;
        java.lang.String str3 = b1Var.f439691e;
        java.lang.String str4 = b1Var.f439692f;
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155194a;
        if (com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.V6(phoneRechargeUI, str, str2, str3, str4)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f439694h)) {
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.X6(phoneRechargeUI, com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.W6(phoneRechargeUI, b1Var.f439694h), b1Var.f439691e, b1Var.f439692f);
        } else if (com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.T6(phoneRechargeUI, b1Var)) {
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.U6(phoneRechargeUI, b1Var);
        }
    }
}
