package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI f157966d;

    public u1(com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI) {
        this.f157966d = remittanceBusiResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI = this.f157966d;
        if (remittanceBusiResultUI.E == 56) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 10, remittanceBusiResultUI.f157177p1, 0);
        }
        if (remittanceBusiResultUI.F == 65 && remittanceBusiResultUI.Q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "mFinishBtn mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS");
            remittanceBusiResultUI.Q.send(-1, null);
        }
        if (remittanceBusiResultUI.E == 71) {
            new com.tencent.mm.autogen.events.BusiF2fPaySuccEvent().e();
        }
        remittanceBusiResultUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
