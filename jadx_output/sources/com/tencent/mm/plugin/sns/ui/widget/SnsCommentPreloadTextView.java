package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsCommentPreloadTextView extends com.tencent.mm.kiss.widget.textview.PLTextView {

    /* renamed from: f, reason: collision with root package name */
    public static nm0.a f170875f;

    /* renamed from: g, reason: collision with root package name */
    public static int f170876g;

    public SnsCommentPreloadTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static nm0.a getTextViewConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        if (f170875f == null) {
            com.tencent.mm.plugin.sns.ui.widget.s2.a();
            f170875f = com.tencent.mm.plugin.sns.ui.widget.s2.f171265d.b();
        }
        nm0.a aVar = f170875f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        return aVar;
    }

    public static int getViewWidth() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        if (f170876g == 0) {
            com.tencent.mm.plugin.sns.ui.widget.s2.a();
            f170876g = com.tencent.mm.plugin.sns.ui.widget.s2.f171265d.c();
        }
        int i17 = f170876g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        return i17;
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public nm0.a b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        if (f170875f == null) {
            com.tencent.mm.plugin.sns.ui.widget.s2.a();
            f170875f = com.tencent.mm.plugin.sns.ui.widget.s2.f171265d.b();
        }
        nm0.a aVar = f170875f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        return aVar;
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView
    public void g(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView
    public void h(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        f(charSequence, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView, com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
    }

    public SnsCommentPreloadTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
