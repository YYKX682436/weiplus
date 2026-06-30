package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r3 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.g1 f157915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157916b;

    public r3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.g1 g1Var) {
        this.f157916b = remittanceDetailUI;
        this.f157915a = g1Var;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        new com.tencent.mm.plugin.remittance.ui.d0(this.f157916b).a(this.f157915a.f156845y, new com.tencent.mm.plugin.remittance.ui.q3(this));
    }
}
