package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class q8 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.j f157902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceUI f157903b;

    public q8(com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI, com.tencent.mm.plugin.remittance.model.j jVar) {
        this.f157903b = remittanceUI;
        this.f157902a = jVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.remittance.model.j jVar = this.f157902a;
        r45.xx xxVar = jVar.f156861r;
        com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI = this.f157903b;
        if (xxVar == null || com.tencent.mm.sdk.platformtools.t8.K0(xxVar.f390572i)) {
            remittanceUI.I1 = remittanceUI.getString(com.tencent.mm.R.string.k2x);
        } else {
            remittanceUI.I1 = jVar.f156861r.f390572i;
        }
        remittanceUI.j7();
        r45.xx xxVar2 = jVar.f156861r;
        if (xxVar2 == null || xxVar2.f390567d != 268492929) {
            return;
        }
        remittanceUI.p7(remittanceUI, xxVar2.f390568e, false);
    }
}
