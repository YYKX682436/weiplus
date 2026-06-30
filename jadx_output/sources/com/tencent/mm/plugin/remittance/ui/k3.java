package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class k3 implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.l3 f157792a;

    public k3(com.tencent.mm.plugin.remittance.ui.l3 l3Var) {
        this.f157792a = l3Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "resultCode :%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.remittance.ui.l3 l3Var = this.f157792a;
        if (i17 == 2) {
            l3Var.f157802d.a7();
            return true;
        }
        if (i17 == 0 && z17) {
            l3Var.f157802d.a7();
        }
        return true;
    }
}
