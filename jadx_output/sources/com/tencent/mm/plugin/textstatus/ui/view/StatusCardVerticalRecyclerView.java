package com.tencent.mm.plugin.textstatus.ui.view;

/* loaded from: classes10.dex */
public class StatusCardVerticalRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name */
    public int f174377j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f174378k2;

    /* renamed from: l2, reason: collision with root package name */
    public int f174379l2;

    /* renamed from: m2, reason: collision with root package name */
    public final android.view.ViewConfiguration f174380m2;

    /* renamed from: n2, reason: collision with root package name */
    public int f174381n2;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f174382o2;

    public StatusCardVerticalRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void L0(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f174382o2 = true;
        } else {
            this.f174382o2 = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f174382o2) {
            motionEvent.getAction();
            return true;
        }
        boolean z17 = false;
        if (action != 2) {
            int scrollState = getScrollState();
            this.f174381n2 = motionEvent.getPointerId(0);
            this.f174377j2 = (int) (motionEvent.getX() + 0.0f);
            this.f174378k2 = (int) (motionEvent.getY() + 0.0f);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if (scrollState != 2 && scrollState != 1) {
                z17 = onInterceptTouchEvent;
            }
            motionEvent.getAction();
            return z17;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f174381n2);
        if (findPointerIndex < 0 || getLayoutManager() == null) {
            return false;
        }
        int x17 = (int) (motionEvent.getX(findPointerIndex) + 0.0f);
        int y17 = ((int) (motionEvent.getY(findPointerIndex) + 0.0f)) - this.f174378k2;
        boolean f123307r = getLayoutManager().getF123307r();
        double atan2 = java.lang.Math.atan2(r0 - this.f174378k2, x17 - this.f174377j2) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return (f123307r && java.lang.Math.abs(y17) > this.f174379l2 && (((atan2 > 75.0d ? 1 : (atan2 == 75.0d ? 0 : -1)) >= 0 && (atan2 > 105.0d ? 1 : (atan2 == 105.0d ? 0 : -1)) <= 0) || ((atan2 > 255.0d ? 1 : (atan2 == 255.0d ? 0 : -1)) >= 0 && (atan2 > 285.0d ? 1 : (atan2 == 285.0d ? 0 : -1)) <= 0))) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i17) {
        super.setScrollingTouchSlop(i17);
        android.view.ViewConfiguration viewConfiguration = this.f174380m2;
        if (i17 == 0) {
            this.f174379l2 = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i17 != 1) {
                return;
            }
            this.f174379l2 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public StatusCardVerticalRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f174381n2 = -1;
        this.f174382o2 = false;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f174380m2 = viewConfiguration;
        this.f174379l2 = viewConfiguration.getScaledTouchSlop();
    }
}
