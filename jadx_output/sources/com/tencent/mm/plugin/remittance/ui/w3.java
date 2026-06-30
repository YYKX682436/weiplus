package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class w3 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.g1 f158008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158009b;

    public w3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.g1 g1Var) {
        this.f158009b = remittanceDetailUI;
        this.f158008a = g1Var;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158009b;
        java.lang.String string = remittanceDetailUI.getString(com.tencent.mm.R.string.hzl, remittanceDetailUI.i7(this.f158008a.f156833m, false));
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI2 = this.f158009b;
        db5.e1.A(remittanceDetailUI, string, remittanceDetailUI2.getString(com.tencent.mm.R.string.f490539xy), remittanceDetailUI2.getString(com.tencent.mm.R.string.hzq), remittanceDetailUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.remittance.ui.u3(this), new com.tencent.mm.plugin.remittance.ui.v3(this));
    }
}
