package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes3.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f155218d;

    public q0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f155218d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f155218d);
    }
}
