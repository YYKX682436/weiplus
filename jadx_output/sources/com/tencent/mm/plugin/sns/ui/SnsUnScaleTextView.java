package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsUnScaleTextView extends android.widget.TextView {
    public SnsUnScaleTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            int baseline = super.getBaseline();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return baseline;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return onPreDraw;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return true;
        }
    }

    public SnsUnScaleTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
