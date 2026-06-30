package com.tencent.mm.plugin.finder.live.box.viewpager;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b)\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR2\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/box/viewpager/FinderLiveBoxViewPager;", "Landroidx/viewpager/widget/ViewPager;", "", "height", "Ljz5/f0;", "setMaxHeight", "", "b", "setCanScroll", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "onInterceptTouchEvent", "onTouchEvent", "maxHeight", "I", "canScroll", "Z", "", "mDownY", "F", "mDownX", "Lkotlin/Function0;", "onSingleTouListener", "Lyz5/a;", "getOnSingleTouListener", "()Lyz5/a;", "setOnSingleTouListener", "(Lyz5/a;)V", "Lkotlin/Function1;", "eventTransferOnCantScroll", "Lyz5/l;", "getEventTransferOnCantScroll", "()Lyz5/l;", "setEventTransferOnCantScroll", "(Lyz5/l;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "he2/a", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveBoxViewPager extends androidx.viewpager.widget.ViewPager {
    public static final he2.a Companion = new he2.a(null);
    public static final java.lang.String TAG = "FinderLiveBoxViewPager";
    private boolean canScroll;
    private yz5.l eventTransferOnCantScroll;
    private float mDownX;
    private float mDownY;
    private int maxHeight;
    private yz5.a onSingleTouListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveBoxViewPager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.canScroll = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout;
        yz5.l lVar;
        java.lang.Integer valueOf = ev6 != null ? java.lang.Integer.valueOf(ev6.getAction()) : null;
        boolean z17 = false;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout2 = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) getRootView().findViewById(com.tencent.mm.R.id.mw9);
            if (draggableConstraintLayout2 != null) {
                draggableConstraintLayout2.setNeedIntercept(false);
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                z17 = true;
            }
            if (z17 && (draggableConstraintLayout = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) getRootView().findViewById(com.tencent.mm.R.id.mw9)) != null) {
                draggableConstraintLayout.setNeedIntercept(true);
            }
        }
        if (!this.canScroll && (lVar = this.eventTransferOnCantScroll) != null) {
            lVar.invoke(ev6);
        }
        return super.dispatchTouchEvent(ev6);
    }

    public final yz5.l getEventTransferOnCantScroll() {
        return this.eventTransferOnCantScroll;
    }

    public final yz5.a getOnSingleTouListener() {
        return this.onSingleTouListener;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        return this.canScroll && super.onInterceptTouchEvent(ev6);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.maxHeight;
        if (i19 > 0) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE));
            return;
        }
        int childCount = getChildCount();
        int i27 = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            measureChild(childAt, i17, i18);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i27) {
                i27 = measuredHeight;
            }
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        boolean z17;
        yz5.a aVar;
        java.lang.Integer valueOf = ev6 != null ? java.lang.Integer.valueOf(ev6.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.mDownX = ev6.getRawX();
            this.mDownY = ev6.getRawY();
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                float abs = java.lang.Math.abs(ev6.getRawY() - this.mDownY);
                float abs2 = java.lang.Math.abs(ev6.getRawX() - this.mDownX);
                if (((float) java.lang.Math.sqrt((abs * abs) + (abs2 * abs2))) < android.view.ViewConfiguration.getTouchSlop()) {
                    z17 = true;
                    if (z17 && (aVar = this.onSingleTouListener) != null) {
                        aVar.invoke();
                    }
                    return this.canScroll && super.onTouchEvent(ev6);
                }
            }
        }
        z17 = false;
        if (z17) {
            aVar.invoke();
        }
        if (this.canScroll) {
            return false;
        }
    }

    public final void setCanScroll(boolean z17) {
        this.canScroll = z17;
    }

    public final void setEventTransferOnCantScroll(yz5.l lVar) {
        this.eventTransferOnCantScroll = lVar;
    }

    public final void setMaxHeight(int i17) {
        this.maxHeight = i17;
    }

    public final void setOnSingleTouListener(yz5.a aVar) {
        this.onSingleTouListener = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveBoxViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.canScroll = true;
    }
}
