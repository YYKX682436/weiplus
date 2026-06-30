package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class e5 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157690e;

    public e5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, java.lang.String str) {
        this.f157690e = remittanceDetailUI;
        this.f157689d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.utils.y yVar = (com.tencent.mm.plugin.wallet_core.utils.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157690e;
        long j17 = remittanceDetailUI.f157340c2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (longValue != j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailUI", "unexpected halfpage callback");
        } else {
            remittanceDetailUI.f157340c2 = 0L;
            if (yVar == com.tencent.mm.plugin.wallet_core.utils.y.f181000f) {
                remittanceDetailUI.b7(this.f157689d, "");
            } else if (yVar == com.tencent.mm.plugin.wallet_core.utils.y.f181001g) {
                remittanceDetailUI.finish();
            }
        }
        return f0Var;
    }
}
