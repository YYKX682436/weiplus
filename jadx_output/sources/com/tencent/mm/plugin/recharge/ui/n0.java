package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class n0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr4.b1 f155206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f155207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155208f;

    public n0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, vr4.b1 b1Var, int i17) {
        this.f155208f = phoneRechargeUI;
        this.f155206d = b1Var;
        this.f155207e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.U6(this.f155208f, this.f155206d);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17623, java.lang.Integer.valueOf(this.f155207e), 1);
    }
}
