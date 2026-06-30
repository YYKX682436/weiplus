package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class e4 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.f4 f157688a;

    public e4(com.tencent.mm.plugin.remittance.ui.f4 f4Var) {
        this.f157688a = f4Var;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.f4 f4Var = this.f157688a;
        f4Var.f157710e.X.setVisibility(0);
        f4Var.f157710e.Y.setVisibility(8);
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = f4Var.f157710e;
        com.tencent.mm.ui.tools.k8.a(remittanceDetailUI, (android.view.ViewGroup) remittanceDetailUI.findViewById(com.tencent.mm.R.id.root_view), f4Var.f157710e.findViewById(com.tencent.mm.R.id.f486263kp4), f4Var.f157710e.findViewById(com.tencent.mm.R.id.lva), f4Var.f157710e.findViewById(com.tencent.mm.R.id.lvx), 72);
    }
}
