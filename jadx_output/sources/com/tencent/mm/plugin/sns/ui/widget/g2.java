package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171141d;

    public g2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171141d = snsCommentEmoticonDetailUI;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$onCreate$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$onCreate$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.f170868m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$longClickToShowAddEmoticonSheet", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI = this.f171141d;
        snsCommentEmoticonDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("longClickToShowAddEmoticonSheet", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) snsCommentEmoticonDetailUI, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.widget.c2(snsCommentEmoticonDetailUI);
        k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.widget.d2(snsCommentEmoticonDetailUI);
        k0Var.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickToShowAddEmoticonSheet", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$longClickToShowAddEmoticonSheet", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$onCreate$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$onCreate$5");
        return true;
    }
}
