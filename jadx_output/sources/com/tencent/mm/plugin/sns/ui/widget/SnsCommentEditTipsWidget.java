package com.tencent.mm.plugin.sns.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsCommentEditTipsWidget;", "Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsCommentEditTipsWidget extends com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget {
    public SnsCommentEditTipsWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("maxInputCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        int m17 = ip.c.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("maxInputCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        return m17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public java.lang.String d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("overCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        java.lang.String valueOf = java.lang.String.valueOf(i17 * (-1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("overCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        return valueOf;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public java.lang.String e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remainCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remainCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        return valueOf;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startShowRemainCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startShowRemainCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEditTipsWidget");
        return 200;
    }

    public SnsCommentEditTipsWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
