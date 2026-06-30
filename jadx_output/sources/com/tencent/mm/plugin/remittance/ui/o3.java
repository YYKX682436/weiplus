package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o3 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157857a;

    public o3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157857a = remittanceDetailUI;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157857a;
        java.lang.String string = remittanceDetailUI.getString(com.tencent.mm.R.string.hzl, remittanceDetailUI.i7(remittanceDetailUI.C1, false));
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI2 = this.f157857a;
        db5.e1.A(remittanceDetailUI, string, remittanceDetailUI2.getString(com.tencent.mm.R.string.f490539xy), remittanceDetailUI2.getString(com.tencent.mm.R.string.hzq), remittanceDetailUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.remittance.ui.m3(this), new com.tencent.mm.plugin.remittance.ui.n3(this));
    }
}
