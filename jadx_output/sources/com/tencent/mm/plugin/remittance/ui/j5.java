package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.b1 f157783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157784f;

    public j5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, java.lang.String str, com.tencent.mm.plugin.remittance.model.b1 b1Var) {
        this.f157784f = remittanceDetailUI;
        this.f157782d = str;
        this.f157783e = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29405, 2, this.f157782d);
        com.tencent.mm.plugin.remittance.model.b1 b1Var = this.f157783e;
        com.tencent.mm.plugin.remittance.model.v0 v0Var = b1Var.f156796f;
        int i17 = v0Var.f157036a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.url ：%s", v0Var.f157037b);
            com.tencent.mm.wallet_core.ui.r1.V(this.f157784f.getContext(), b1Var.f156796f.f157037b, false);
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailUI", "unsupported jump type");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.username ：%s", v0Var.f157038c);
            com.tencent.mm.plugin.remittance.model.v0 v0Var2 = b1Var.f156796f;
            com.tencent.mm.wallet_core.ui.r1.b0(v0Var2.f157038c, v0Var2.f157039d, 0, 1000);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
