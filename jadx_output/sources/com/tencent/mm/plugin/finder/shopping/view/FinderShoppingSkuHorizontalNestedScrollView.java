package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderShoppingSkuHorizontalNestedScrollView;", "Landroid/widget/HorizontalScrollView;", "Ln3/d0;", "", "enabled", "Ljz5/f0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FinderShoppingSkuHorizontalNestedScrollView extends android.widget.HorizontalScrollView implements n3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f126343d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.f0 f126344e;

    /* renamed from: f, reason: collision with root package name */
    public float f126345f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f126346g;

    public FinderShoppingSkuHorizontalNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f126343d = "FinderShoppingSkuHorizontalNestedScrollView";
        this.f126344e = new n3.f0(this);
        this.f126346g = new int[2];
        android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f126344e.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f126344e.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.f126344e.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.f126344e.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f126344e.h(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f126344e.f334334d;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f126345f = ev6.getX();
            this.f126344e.j(1, 0);
        } else if (actionMasked == 1) {
            p(0);
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int scrollX = getScrollX();
        boolean onTouchEvent = super.onTouchEvent(ev6);
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f126345f = ev6.getX();
            this.f126344e.j(1, 0);
        } else if (actionMasked == 1) {
            p(0);
        } else if (actionMasked == 2) {
            float x17 = this.f126345f - ev6.getX();
            com.tencent.mars.xlog.Log.i(this.f126343d, "on move lastX = " + this.f126345f + ", curX = " + ev6.getX() + ", oldX = " + scrollX + ", scrollX = " + getScrollX());
            this.f126345f = ev6.getX();
            int scrollX2 = getScrollX() - scrollX;
            this.f126344e.f(scrollX2, 0, (int) (x17 - ((float) scrollX2)), 0, this.f126346g, 0, null);
        }
        return onTouchEvent;
    }

    @Override // n3.d0
    public void p(int i17) {
        this.f126344e.k(i17);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.f126344e.i(z17);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.f126344e.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f126344e.k(0);
    }

    public FinderShoppingSkuHorizontalNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126343d = "FinderShoppingSkuHorizontalNestedScrollView";
        this.f126344e = new n3.f0(this);
        this.f126346g = new int[2];
        android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setNestedScrollingEnabled(true);
    }
}
