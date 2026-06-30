package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes8.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eq f158004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI f158005e;

    public w1(com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI, r45.eq eqVar) {
        this.f158005e = remittanceBusiResultUI;
        this.f158004d = eqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.eq eqVar = this.f158004d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "app type: %s", java.lang.Integer.valueOf(eqVar.f373661d));
        int i17 = eqVar.f373661d;
        com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI = this.f158005e;
        if (i17 == 1) {
            remittanceBusiResultUI.f157164J = true;
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = eqVar.f373667m;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = eqVar.f373668n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1034;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
        } else if (i17 == 2) {
            remittanceBusiResultUI.f157164J = true;
            com.tencent.mm.wallet_core.ui.r1.V(remittanceBusiResultUI.getContext(), eqVar.f373666i, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
