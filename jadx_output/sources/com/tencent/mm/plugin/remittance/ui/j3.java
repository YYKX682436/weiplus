package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j3 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.p1 f157778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157779b;

    public j3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.p1 p1Var) {
        this.f157779b = remittanceDetailUI;
        this.f157778a = p1Var;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        new com.tencent.mm.plugin.remittance.ui.d0(this.f157779b).a(this.f157778a.P(), new com.tencent.mm.plugin.remittance.ui.i3(this));
    }
}
