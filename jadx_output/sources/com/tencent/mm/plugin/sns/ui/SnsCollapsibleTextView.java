package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsCollapsibleTextView;", "Lcom/tencent/mm/ui/widget/MMCollapsibleTextView;", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Ljz5/f0;", "setCustomText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class SnsCollapsibleTextView extends com.tencent.mm.ui.widget.MMCollapsibleTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCollapsibleTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.widget.MMCollapsibleTextView
    public void F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rightCollapse", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        super.F();
        get_contentText().j(android.text.TextUtils.TruncateAt.END, C(1.0f) + getCollapseButton().getMeasuredWidth());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rightCollapse", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    @Override // com.tencent.mm.ui.widget.MMCollapsibleTextView
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rightExpand", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        super.G();
        get_contentText().setEllipsize(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rightExpand", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    @Override // com.tencent.mm.ui.widget.MMCollapsibleTextView
    public void I(java.lang.CharSequence text, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        kotlin.jvm.internal.o.g(text, "text");
        if (z17) {
            E();
        }
        super.I(text, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    public final void setCustomText(java.lang.CharSequence charSequence) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        if (charSequence == null || charSequence.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        } else {
            int textSize = (int) getTextSize();
            if (charSequence instanceof android.text.SpannableStringBuilder) {
                spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
                spannableStringBuilder.setSpan(new cd4.a(textSize), 0, spannableStringBuilder.length(), 33);
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(charSequence);
                spannableStringBuilder2.setSpan(new cd4.a(textSize), 0, charSequence.length(), 33);
                spannableStringBuilder = spannableStringBuilder2;
            }
            I(spannableStringBuilder, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCollapsibleTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
