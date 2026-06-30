package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class l1 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout f171199d;

    public l1(com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout) {
        this.f171199d = snsCommentCollapseLayout;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$3", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.f170849q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout = this.f171199d;
        snsCommentCollapseLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        snsCommentCollapseLayout.f170852f.setVisibility(4);
        snsCommentCollapseLayout.post(new com.tencent.mm.plugin.sns.ui.widget.k1(snsCommentCollapseLayout));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$3", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$3");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$3");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.f170849q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        int i18 = this.f171199d.f170859p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        textPaint.setColor(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$3");
    }
}
