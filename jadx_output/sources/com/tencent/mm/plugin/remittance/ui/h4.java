package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h4 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.i4 f157748a;

    public h4(com.tencent.mm.plugin.remittance.ui.i4 i4Var) {
        this.f157748a = i4Var;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.i4 i4Var = this.f157748a;
        i4Var.f157763e.A.setVisibility(0);
        i4Var.f157763e.B.setVisibility(8);
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = i4Var.f157763e;
        com.tencent.mm.ui.tools.k8.a(remittanceDetailUI, (android.view.ViewGroup) remittanceDetailUI.findViewById(com.tencent.mm.R.id.root_view), i4Var.f157763e.findViewById(com.tencent.mm.R.id.f486263kp4), i4Var.f157763e.findViewById(com.tencent.mm.R.id.lva), i4Var.f157763e.findViewById(com.tencent.mm.R.id.lvx), 72);
    }
}
