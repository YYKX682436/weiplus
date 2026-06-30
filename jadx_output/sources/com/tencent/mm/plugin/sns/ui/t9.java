package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class t9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f170502d;

    public t9(com.tencent.mm.plugin.sns.ui.pa paVar, android.widget.Button button) {
        this.f170502d = button;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f170502d.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$2");
    }
}
