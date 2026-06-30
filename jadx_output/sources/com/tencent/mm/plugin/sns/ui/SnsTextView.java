package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public char f167458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167459e;

    public SnsTextView(android.content.Context context) {
        super(context);
        this.f167458d = (char) 0;
        this.f167459e = "";
    }

    public final void a(java.lang.CharSequence charSequence, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryToFix", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), android.text.style.MetricAffectingSpan.class);
        if (metricAffectingSpanArr == null || metricAffectingSpanArr.length <= 0) {
            this.f167458d = 'd';
        } else {
            spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(metricAffectingSpanArr[0]) - 1, (java.lang.CharSequence) " ");
            this.f167458d = (char) (this.f167458d + 1);
        }
        setText(spannableStringBuilder);
        onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryToFix", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            int baseline = super.getBaseline();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return baseline;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsTextView", th6, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsTextView", th6, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        int i19 = wo.v1.f447833m.f447758p;
        if (i19 == 1 || i19 == -1) {
            try {
                super.onMeasure(i17, i18);
                this.f167458d = (char) 0;
            } catch (java.lang.IndexOutOfBoundsException e17) {
                char c17 = this.f167458d;
                if (c17 < 3) {
                    try {
                        a(getText(), i17, i18);
                    } catch (java.lang.IndexOutOfBoundsException unused) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTextView", "tryToFix error set origintext " + com.tencent.mm.sdk.platformtools.t8.K0(this.f167459e));
                        setText(this.f167459e);
                        onMeasure(i17, i18);
                        this.f167458d = (char) (this.f167458d + 1);
                    }
                } else {
                    if (c17 != 3) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
                        throw e17;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTextView", "fix error set origintext " + com.tencent.mm.sdk.platformtools.t8.K0(this.f167459e));
                    setText(this.f167459e);
                    onMeasure(i17, i18);
                    this.f167458d = (char) (this.f167458d + 1);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
                return;
            }
        } else {
            super.onMeasure(i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return onPreDraw;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return true;
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        return onTextContextMenuItem;
    }

    public void setOriginText(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginText", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        this.f167459e = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginText", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public SnsTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167458d = (char) 0;
        this.f167459e = "";
    }
}
