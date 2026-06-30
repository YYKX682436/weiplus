package com.tencent.mm.plugin.sns.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsUploadEditTipsWidget;", "Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsUploadEditTipsWidget extends com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget {
    public SnsUploadEditTipsWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("maxInputCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        int n17 = ip.c.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("maxInputCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return n17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public java.lang.String d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("overCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.j_g);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("overCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return format;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public java.lang.String e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remainCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.j_h);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remainCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return format;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget
    public int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startShowRemainCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startShowRemainCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return 200;
    }

    public SnsUploadEditTipsWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
