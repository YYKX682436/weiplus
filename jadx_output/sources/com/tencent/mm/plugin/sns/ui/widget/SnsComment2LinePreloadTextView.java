package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsComment2LinePreloadTextView extends com.tencent.mm.kiss.widget.textview.PLTextView {

    /* renamed from: f, reason: collision with root package name */
    public static nm0.a f170848f;

    public SnsComment2LinePreloadTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static nm0.a getTextViewConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        if (f170848f == null) {
            com.tencent.mm.plugin.sns.ui.widget.h1.a();
            f170848f = com.tencent.mm.plugin.sns.ui.widget.h1.f171147c.b();
        }
        nm0.a aVar = f170848f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        return aVar;
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public nm0.a b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        if (f170848f == null) {
            com.tencent.mm.plugin.sns.ui.widget.h1.a();
            f170848f = com.tencent.mm.plugin.sns.ui.widget.h1.f171147c.b();
        }
        nm0.a aVar = f170848f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        return aVar;
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView
    public void g(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView
    public void h(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        f(charSequence, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView, com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
    }

    public SnsComment2LinePreloadTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
