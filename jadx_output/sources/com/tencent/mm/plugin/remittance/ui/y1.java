package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes4.dex */
public class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f158044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI f158045e;

    public y1(com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI, android.view.View view) {
        this.f158045e = remittanceBusiResultUI;
        this.f158044d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI remittanceBusiResultUI = this.f158045e;
        if (remittanceBusiResultUI.f157190y1) {
            android.view.View view2 = this.f158044d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            remittanceBusiResultUI.f157176p0.setVisibility(0);
            remittanceBusiResultUI.Z6(remittanceBusiResultUI.f157186x0);
        } else {
            android.view.View view3 = this.f158044d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            remittanceBusiResultUI.f157176p0.setVisibility(8);
            remittanceBusiResultUI.Z6(this.f158044d);
        }
        remittanceBusiResultUI.f157190y1 = !remittanceBusiResultUI.f157190y1;
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
