package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class WrapScollview extends androidx.core.widget.NestedScrollView {
    public boolean K;
    public boolean L;
    public int M;
    public android.view.View N;

    public WrapScollview(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = true;
        this.L = true;
        this.M = -1;
    }

    @Override // androidx.core.widget.NestedScrollView
    public int b(android.graphics.Rect rect) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        int b17 = super.b(rect);
        if (!this.K) {
            b17 = 0;
        }
        int i17 = this.M;
        if (i17 != -1) {
            this.M = 0;
            b17 = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        return b17;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        if (this.L && (view = this.N) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int width = view.getWidth() + i17;
            boolean z17 = true;
            int i18 = iArr[1];
            int height = view.getHeight() + i18;
            if (i17 >= rawX || rawX >= width || i18 >= rawY || rawY >= height) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
                z17 = false;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
                return false;
            }
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        return onInterceptTouchEvent;
    }

    public void setCheckInterceptTouchEventByCheckArea(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCheckInterceptTouchEventByCheckArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.L = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCheckInterceptTouchEventByCheckArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public void setContentView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentView", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.N = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentView", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public void setDoComputeScrollDeltaToGetChildRectOnScreen(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDoComputeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.K = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDoComputeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public void setScrollDeltaOnFocusLocationChange(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollDeltaOnFocusLocationChange", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.M = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollDeltaOnFocusLocationChange", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public WrapScollview(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = true;
        this.L = true;
        this.M = -1;
    }
}
