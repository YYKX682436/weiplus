package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes14.dex */
public class SnsAdNativeLandingPagesScrollView extends androidx.core.widget.NestedScrollView {
    public int K;
    public final int L;
    public final java.lang.Runnable M;

    public SnsAdNativeLandingPagesScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = 0;
        this.L = 50;
        java.lang.System.currentTimeMillis();
        this.M = new com.tencent.mm.plugin.sns.ui.ab(this);
    }

    public static /* synthetic */ int w(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        int i17 = snsAdNativeLandingPagesScrollView.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return i17;
    }

    @Override // androidx.core.widget.NestedScrollView
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fling", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.d(i17 / 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fling", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return onInterceptTouchEvent;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.onScrollChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.w("SnsAdNativeLandingPagesScrollView", "onScrollChanged x %d,y %d,oldx %d,oldy %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollBy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.scrollBy(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollBy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void scrollTo(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.scrollTo(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public void setScrollViewListener(com.tencent.mm.plugin.sns.ui.bb bbVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollViewListener", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollViewListener", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public SnsAdNativeLandingPagesScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = 0;
        this.L = 50;
        java.lang.System.currentTimeMillis();
        this.M = new com.tencent.mm.plugin.sns.ui.ab(this);
    }
}
