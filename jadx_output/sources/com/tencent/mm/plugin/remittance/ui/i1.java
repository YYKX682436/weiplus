package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157759f;

    public i1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, java.lang.String str, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157759f = remittanceBaseUI;
        this.f157757d = str;
        this.f157758e = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157759f;
        remittanceBaseUI.showLoading();
        remittanceBaseUI.i7(this.f157757d, remittanceBaseUI.f157135f, remittanceBaseUI.Q, this.f157758e);
    }
}
