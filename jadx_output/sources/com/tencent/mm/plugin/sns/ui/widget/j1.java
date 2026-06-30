package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.k1 f171172d;

    public j1(com.tencent.mm.plugin.sns.ui.widget.k1 k1Var) {
        this.f171172d = k1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$2$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.d(this.f171172d.f171181d);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$2$1");
    }
}
