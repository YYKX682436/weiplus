package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public class c implements android.view.View.OnClickListener {
    public c(com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$3");
    }
}
