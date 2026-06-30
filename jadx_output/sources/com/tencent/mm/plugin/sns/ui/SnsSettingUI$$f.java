package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class SnsSettingUI$$f implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        java.lang.Object obj = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onCreate$5", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array2 = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
        if (xa4.g.f()) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "可以出红点", 1).show();
        } else if (xa4.g.v()) {
            xa4.g gVar = xa4.g.f452830d;
            if (gVar.u()) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "红点已经曝光", 1).show();
            } else if (!gVar.j()) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "后台配置不支持", 1).show();
            }
        } else {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "没有发表入口", 1).show();
        }
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onCreate$5", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsSettingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
