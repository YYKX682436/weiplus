package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171129d;

    public f2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171129d = snsCommentEmoticonDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$onCreate$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.f170868m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$runExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        this.f171129d.Y6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$runExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$onCreate$4");
    }
}
