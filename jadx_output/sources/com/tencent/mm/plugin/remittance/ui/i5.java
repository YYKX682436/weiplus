package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.e1 f157764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157765e;

    public i5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.e1 e1Var) {
        this.f157765e = remittanceDetailUI;
        this.f157764d = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.remittance.model.e1 e1Var = this.f157764d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "click customer info item: %s ,type:%s", e1Var.f156811a, java.lang.Integer.valueOf(e1Var.f156812b.f157036a));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29405, 2, e1Var.f156811a);
        com.tencent.mm.plugin.remittance.model.v0 v0Var = e1Var.f156812b;
        int i17 = v0Var.f157036a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.url ：%s", v0Var.f157037b);
            com.tencent.mm.wallet_core.ui.r1.V(this.f157765e.getContext(), e1Var.f156812b.f157037b, false);
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailUI", "unsupported jump type");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.username ：%s", v0Var.f157038c);
            com.tencent.mm.plugin.remittance.model.v0 v0Var2 = e1Var.f156812b;
            com.tencent.mm.wallet_core.ui.r1.b0(v0Var2.f157038c, v0Var2.f157039d, 0, 1000);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
