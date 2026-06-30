package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class t implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f155224d;

    public t(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f155224d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f155224d);
    }
}
