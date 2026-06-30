package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i6 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.v f157766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI f157767b;

    public i6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI, com.tencent.mm.plugin.remittance.model.v vVar) {
        this.f157767b = remittanceF2fDynamicCodeUI;
        this.f157766a = vVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        r45.vv vvVar = this.f157766a.f157035r;
        java.lang.String str2 = vvVar.f388596g;
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f157767b;
        remittanceF2fDynamicCodeUI.f157403s = str2;
        int i27 = vvVar.f388598i;
        if (i27 != 0) {
            i19 = 1;
            if (i27 != 1) {
                i19 = 2;
                if (i27 != 2) {
                    i19 = 3;
                }
            }
        } else {
            i19 = 0;
        }
        remittanceF2fDynamicCodeUI.f157404t = i19;
        remittanceF2fDynamicCodeUI.f157405u = vvVar.f388595f;
        remittanceF2fDynamicCodeUI.f157406v = vvVar.f388597h;
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI.U6(remittanceF2fDynamicCodeUI);
    }
}
