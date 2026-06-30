package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout f171181d;

    public k1(com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout) {
        this.f171181d = snsCommentCollapseLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$2");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout = this.f171181d;
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.b(snsCommentCollapseLayout).setVisibility(0);
        com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView c17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.c(snsCommentCollapseLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        int i17 = snsCommentCollapseLayout.f170856m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        c17.setLines(i17);
        nm0.a config = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.c(snsCommentCollapseLayout).getConfig();
        int measuredWidth = snsCommentCollapseLayout.getMeasuredWidth() - com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.b(snsCommentCollapseLayout).getMeasuredWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        int i18 = snsCommentCollapseLayout.f170855i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        config.f338458h = measuredWidth - i18;
        com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView c18 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.c(snsCommentCollapseLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        java.lang.CharSequence charSequence = snsCommentCollapseLayout.f170854h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        c18.setText(charSequence);
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.c(snsCommentCollapseLayout).setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView snsCommentPreloadTextView = snsCommentCollapseLayout.f170851e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        snsCommentPreloadTextView.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        boolean z17 = snsCommentCollapseLayout.f170857n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.b(snsCommentCollapseLayout).setText(com.tencent.mm.R.string.j_3);
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.b(snsCommentCollapseLayout).setOnClickListener(new com.tencent.mm.plugin.sns.ui.widget.j1(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$2");
    }
}
