package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes13.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.QTextView f167696d;

    public a(com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse activityTestMultilineEllipse, com.tencent.mm.plugin.sns.ui.QTextView qTextView) {
        this.f167696d = qTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ActivityTestMultilineEllipse$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.QTextView qTextView = this.f167696d;
        if (qTextView.getIsExpanded()) {
            qTextView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collapse", "com.tencent.mm.plugin.sns.ui.QTextView");
            qTextView.f166592p = false;
            qTextView.requestLayout();
            qTextView.invalidate();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collapse", "com.tencent.mm.plugin.sns.ui.QTextView");
        } else {
            qTextView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("expand", "com.tencent.mm.plugin.sns.ui.QTextView");
            qTextView.f166592p = true;
            qTextView.requestLayout();
            qTextView.invalidate();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("expand", "com.tencent.mm.plugin.sns.ui.QTextView");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ActivityTestMultilineEllipse$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$1");
    }
}
