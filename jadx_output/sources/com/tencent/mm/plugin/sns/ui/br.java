package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class br implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI f168033d;

    public br(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f168033d = snsStrangerCommentDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.f167423y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            com.tencent.mm.plugin.sns.ui.kj kjVar = this.f168033d.f167433p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            kjVar.d(view, 2, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$7");
    }
}
