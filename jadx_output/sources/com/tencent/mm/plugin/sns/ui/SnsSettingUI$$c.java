package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class SnsSettingUI$$c implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        java.lang.Object obj = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onCreate$2", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array2 = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
        java.util.Iterator it = t21.d3.o("14360046971871564303").iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            dw3.c0.f244182a.j(v2Var.C);
            t21.d3.e(v2Var.d());
        }
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "重置完成", 1).show();
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onCreate$2", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
