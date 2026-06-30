package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171122e;

    public e2(java.lang.String str, com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171121d = str;
        this.f171122e = snsCommentEmoticonDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$onCreate$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.f170868m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getIEmojiInfo$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI = this.f171122e;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = snsCommentEmoticonDetailUI.f170874i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getIEmojiInfo$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        kotlin.jvm.internal.o.d(iEmojiInfo);
        qk.u uVar = new qk.u(this.f171121d, iEmojiInfo);
        uVar.f364155a = 79;
        ((com.tencent.mm.feature.emoji.f4) ((com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class))).wi(snsCommentEmoticonDetailUI.getContext(), uVar);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$onCreate$3");
    }
}
