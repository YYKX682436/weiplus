package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class z9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f171684d;

    public z9(com.tencent.mm.plugin.sns.ui.aa aaVar, android.widget.Button button) {
        this.f171684d = button;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f171684d.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7$1");
    }
}
