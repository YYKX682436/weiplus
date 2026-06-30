package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f169878d;

    public lv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f169878d = snsUserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUserUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f169878d;
        com.tencent.mm.plugin.sns.model.d6 c76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI);
        ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUserUI.V6(snsUserUI)).a();
        java.lang.String U6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI);
        boolean Y6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.Long l17 = snsUserUI.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        c76.g(2, U6, 0, Y6, l17.longValue(), com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
        com.tencent.mm.plugin.sns.ui.SnsUserUI.d7(snsUserUI, 0);
        com.tencent.mm.plugin.sns.ui.SnsUserUI.W6(snsUserUI);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUserUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$8");
    }
}
