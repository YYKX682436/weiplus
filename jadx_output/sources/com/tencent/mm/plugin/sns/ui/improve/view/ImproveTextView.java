package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTouchableTextView;", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Ljz5/f0;", "setCustomText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveTextView extends com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView {

    /* renamed from: h, reason: collision with root package name */
    public int f169175h;

    /* renamed from: i, reason: collision with root package name */
    public int f169176i;

    /* renamed from: m, reason: collision with root package name */
    public int f169177m;

    /* renamed from: n, reason: collision with root package name */
    public int f169178n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f169179o;

    public ImproveTextView(android.content.Context context) {
        super(context, null, 0, 6, null);
        this.f169179o = new android.graphics.Paint.FontMetricsInt();
        setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
    }

    public final void b(java.lang.CharSequence charSequence, yz5.l lVar) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        if (charSequence == null || charSequence.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        int textSize = (int) getTextSize();
        if (charSequence instanceof android.text.SpannableStringBuilder) {
            spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
            spannableStringBuilder.setSpan(new cd4.a(textSize), 0, spannableStringBuilder.length(), 33);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(charSequence);
            spannableStringBuilder2.setSpan(new cd4.a(textSize), 0, charSequence.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        if (lVar != null) {
            lVar.invoke(spannableStringBuilder);
        }
        setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.onMeasure(i17, i18);
        if (android.view.View.MeasureSpec.getMode(i18) == 1073741824) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        int maxLines = getMaxLines();
        if (maxLines <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        android.text.Layout layout = getLayout();
        if (layout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        if (layout.getLineCount() <= maxLines) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        int i19 = maxLines - 1;
        android.text.TextPaint paint = getPaint();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f169179o;
        paint.getFontMetricsInt(fontMetricsInt);
        int compoundPaddingTop = getCompoundPaddingTop() + java.lang.Math.min(layout.getLineBottom(i19), layout.getLineBaseline(i19) + fontMetricsInt.bottom) + getCompoundPaddingBottom();
        if (compoundPaddingTop < getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), compoundPaddingTop);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    public final void setCustomText(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        b(charSequence, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        this.f169177m = i18;
        this.f169178n = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.setPadding(i17, this.f169177m - this.f169175h, i19, this.f169178n - this.f169176i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.setTextSize(i17, f17);
        if (yb4.a.f460697a.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int abs = java.lang.Math.abs(fontMetricsInt.top);
        int abs2 = java.lang.Math.abs(fontMetricsInt.ascent);
        int abs3 = java.lang.Math.abs(fontMetricsInt.bottom);
        int abs4 = java.lang.Math.abs(fontMetricsInt.descent);
        if (abs > abs2) {
            this.f169175h = abs - abs2;
        }
        if (abs3 > abs4) {
            this.f169176i = abs3 - abs4;
        }
        fontMetricsInt.toString();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.setPadding(paddingLeft, this.f169177m - this.f169175h, paddingRight, this.f169178n - this.f169176i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    public ImproveTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.f169179o = new android.graphics.Paint.FontMetricsInt();
        setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
    }

    public ImproveTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f169179o = new android.graphics.Paint.FontMetricsInt();
        setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
    }
}
