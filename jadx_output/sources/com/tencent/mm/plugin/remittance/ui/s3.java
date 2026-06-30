package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class s3 implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.t3 f157931a;

    public s3(com.tencent.mm.plugin.remittance.ui.t3 t3Var) {
        this.f157931a = t3Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "resultCode :%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.remittance.ui.t3 t3Var = this.f157931a;
        if (i17 == 2) {
            t3Var.f157950d.a7();
            return true;
        }
        if (i17 == 0 && z17) {
            t3Var.f157950d.a7();
        }
        return true;
    }
}
