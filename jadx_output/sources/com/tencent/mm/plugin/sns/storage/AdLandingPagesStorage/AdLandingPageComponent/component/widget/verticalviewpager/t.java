package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

/* loaded from: classes4.dex */
public class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager f165786d;

    /* renamed from: e, reason: collision with root package name */
    public float f165787e = Float.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public float f165788f = Float.MIN_VALUE;

    public t(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager dummyViewPager) {
        this.f165786d = dummyViewPager;
    }

    public final boolean a(android.view.View view, android.view.MotionEvent motionEvent, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fakeDragVp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager dummyViewPager = this.f165786d;
        dummyViewPager.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFakeDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z17 = dummyViewPager.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFakeDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fakeDragVp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
            return false;
        }
        float scrollX = ((int) (dummyViewPager.getScrollX() - f17)) - dummyViewPager.getBaseScrollX();
        float scrollX2 = dummyViewPager.getScrollX() - dummyViewPager.getBaseScrollX();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDiffSign", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        boolean z18 = java.lang.Math.abs(scrollX + scrollX2) < java.lang.Math.abs(scrollX - scrollX2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDiffSign", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        if (z18) {
            f17 = dummyViewPager.getScrollX() - dummyViewPager.getBaseScrollX();
        }
        dummyViewPager.m(f17);
        dummyViewPager.getScrollX();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustDownMotion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        obtain.setAction(0);
        view.dispatchTouchEvent(obtain);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustDownMotion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fakeDragVp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r0 != 3) goto L39;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.t.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
