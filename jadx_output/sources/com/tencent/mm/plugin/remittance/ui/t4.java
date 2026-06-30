package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f157951d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zg5 f157952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.u4 f157953f;

    public t4(com.tencent.mm.plugin.remittance.ui.u4 u4Var, r45.zg5 zg5Var) {
        this.f157953f = u4Var;
        this.f157952e = zg5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f157951d));
        if (!this.f157951d) {
            com.tencent.mm.plugin.remittance.ui.u4 u4Var = this.f157953f;
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.X6(u4Var.f157974d, this.f157952e, u4Var.f157972b, u4Var.f157973c);
        }
        this.f157951d = true;
    }
}
