package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157777d;

    public j1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157777d = remittanceBaseUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157777d;
        remittanceBaseUI.hideTenpayKB();
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.I1;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(12689, 9, 1);
        int i18 = remittanceBaseUI.f157140m;
        if (i18 == 1 || i18 == 6) {
            java.lang.String string = remittanceBaseUI.getString(com.tencent.mm.R.string.hyd);
            java.lang.String string2 = remittanceBaseUI.getString(com.tencent.mm.R.string.hz8);
            g0Var.d(14074, 1);
            str = string;
            str2 = string2;
        } else {
            java.lang.String string3 = remittanceBaseUI.getString(com.tencent.mm.R.string.hyc);
            java.lang.String string4 = remittanceBaseUI.getString(com.tencent.mm.R.string.hyh);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str = string3;
            str2 = string4;
        }
        gt4.l.b(remittanceBaseUI, str, remittanceBaseUI.H, str2, false, 20, new com.tencent.mm.plugin.remittance.ui.e1(this), new com.tencent.mm.plugin.remittance.ui.g1(this));
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
