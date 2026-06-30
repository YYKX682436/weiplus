package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsNotInterestUI f168028d;

    public bn(com.tencent.mm.plugin.sns.ui.SnsNotInterestUI snsNotInterestUI) {
        this.f168028d = snsNotInterestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsNotInterestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String[] strArr = com.tencent.mm.plugin.sns.ui.SnsNotInterestUI.f167289v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.plugin.sns.ui.SnsNotInterestUI snsNotInterestUI = this.f168028d;
        android.widget.LinearLayout linearLayout = snsNotInterestUI.f167298m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        linearLayout.requestFocus();
        snsNotInterestUI.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsNotInterestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$2");
    }
}
