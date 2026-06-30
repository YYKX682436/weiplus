package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class v extends com.tencent.mm.xcompat.recyclerview.widget.RecyclerView {

    /* renamed from: i2, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f214785i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2, android.content.Context context) {
        super(context, null);
        this.f214785i2 = viewPager2;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        this.f214785i2.f214751z.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.f214785i2;
        accessibilityEvent.setFromIndex(viewPager2.f214735g);
        accessibilityEvent.setToIndex(viewPager2.f214735g);
        accessibilityEvent.setSource(((com.tencent.mm.xcompat.viewpager2.widget.s) viewPager2.f214751z).f214783d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f214785i2.f214749x && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f214785i2.f214749x && super.onTouchEvent(motionEvent);
    }
}
