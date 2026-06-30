package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class AutoPlayViewPager extends androidx.viewpager.widget.ViewPager {
    private static final java.lang.String TAG = "AutoPlayViewPager";
    private android.animation.ValueAnimator animator;
    private boolean autoCarousel;
    boolean enableTouchScroll;
    protected int mLastOffset;
    private com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView pagerControlView;
    protected int scrollTime;
    protected int scrollTimeInterval;

    public AutoPlayViewPager(android.content.Context context) {
        this(context, null);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView access$000(com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView viewPagerControlView = autoPlayViewPager.pagerControlView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        return viewPagerControlView;
    }

    public void bindViewPagerControlView(com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView viewPagerControlView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindViewPagerControlView", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.pagerControlView = viewPagerControlView;
        this.autoCarousel = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindViewPagerControlView", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void enableTouchScroll(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableTouchScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.enableTouchScroll = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTouchScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (!this.enableTouchScroll) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        return onInterceptTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2 != 3) goto L17;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "onTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r4.enableTouchScroll
            if (r2 != 0) goto L11
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r5 = 0
            return r5
        L11:
            int r2 = r5.getActionMasked()
            if (r2 == 0) goto L25
            r3 = 1
            if (r2 == r3) goto L21
            r3 = 2
            if (r2 == r3) goto L25
            r3 = 3
            if (r2 == r3) goto L21
            goto L28
        L21:
            r4.startAutoPlay()
            goto L28
        L25:
            r4.pauseAutoPlay()
        L28:
            boolean r5 = super.onTouchEvent(r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void pauseAutoPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (this.autoCarousel) {
            android.animation.ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.pause();
            } else {
                com.tencent.mars.xlog.Log.e(TAG, "animator is null when pauseAutoPlay");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void scrollToNextPage() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (isFakeDragging()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
            return;
        }
        beginFakeDrag();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, getWidth());
        ofInt.setDuration(this.scrollTime);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.x0(this));
        ofInt.addListener(new com.tencent.mm.plugin.sns.ui.widget.ad.y0(this));
        ofInt.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void setScrollTime(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollTime", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.scrollTime = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollTime", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void setScrollTimeInterval(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollTimeInterval", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.scrollTimeInterval = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollTimeInterval", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void startAutoPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (this.autoCarousel) {
            if (this.animator == null) {
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.setDuration(this.scrollTimeInterval);
                this.animator.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.z0(this));
                this.animator.addListener(new com.tencent.mm.plugin.sns.ui.widget.ad.a1(this));
            }
            this.animator.start();
        } else {
            com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView viewPagerControlView = this.pagerControlView;
            if (viewPagerControlView != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
                viewPagerControlView.f170971z = 1.0f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
                this.pagerControlView.invalidate();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public AutoPlayViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastOffset = 0;
        this.scrollTime = 1000;
        this.scrollTimeInterval = 4000;
        this.autoCarousel = false;
        this.enableTouchScroll = true;
    }
}
