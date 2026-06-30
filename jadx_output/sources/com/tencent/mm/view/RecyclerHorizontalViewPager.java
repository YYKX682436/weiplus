package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0006&B\u001b\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00064"}, d2 = {"Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/f2;", "adapter", "Ljz5/f0;", "setAdapter", "Lym5/m3;", "b2", "Lym5/m3;", "getPageChangeListener", "()Lym5/m3;", "setPageChangeListener", "(Lym5/m3;)V", "pageChangeListener", "Landroidx/recyclerview/widget/r3;", "c2", "Landroidx/recyclerview/widget/r3;", "getSnapHelper", "()Landroidx/recyclerview/widget/r3;", "setSnapHelper", "(Landroidx/recyclerview/widget/r3;)V", "snapHelper", "", "d2", "Z", "getFrozeTouch", "()Z", "setFrozeTouch", "(Z)V", "frozeTouch", "e2", "getCanMakeCancelAsUp", "setCanMakeCancelAsUp", "canMakeCancelAsUp", "f2", "getDisallowInterceptWhenHorizontalScroll", "setDisallowInterceptWhenHorizontalScroll", "disallowInterceptWhenHorizontalScroll", "Lym5/n3;", "g2", "Lym5/n3;", "getOnInterceptTouchEvent", "()Lym5/n3;", "setOnInterceptTouchEvent", "(Lym5/n3;)V", "onInterceptTouchEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class RecyclerHorizontalViewPager extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public ym5.m3 pageChangeListener;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public androidx.recyclerview.widget.r3 snapHelper;

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public boolean frozeTouch;

    /* renamed from: e2, reason: collision with root package name and from kotlin metadata */
    public boolean canMakeCancelAsUp;

    /* renamed from: f2, reason: collision with root package name and from kotlin metadata */
    public boolean disallowInterceptWhenHorizontalScroll;

    /* renamed from: g2, reason: collision with root package name and from kotlin metadata */
    public ym5.n3 onInterceptTouchEvent;

    /* renamed from: h2, reason: collision with root package name */
    public float f213426h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerHorizontalViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.canMakeCancelAsUp = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.getActionMasked() == 3 && this.canMakeCancelAsUp) {
            return super.dispatchTouchEvent(android.view.MotionEvent.obtain(ev6.getDownTime(), ev6.getEventTime(), 1, ev6.getX(), ev6.getY(), ev6.getMetaState()));
        }
        if (ev6.getAction() == 0 && this.disallowInterceptWhenHorizontalScroll) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        ym5.n3 n3Var = this.onInterceptTouchEvent;
        if (n3Var != null) {
            n3Var.a(ev6);
        }
        return super.dispatchTouchEvent(ev6);
    }

    public void g1(int i17, boolean z17, boolean z18) {
        ym5.m3 m3Var = this.pageChangeListener;
        if (m3Var != null) {
            m3Var.a(i17, z17, false);
        }
    }

    public final boolean getCanMakeCancelAsUp() {
        return this.canMakeCancelAsUp;
    }

    public final boolean getDisallowInterceptWhenHorizontalScroll() {
        return this.disallowInterceptWhenHorizontalScroll;
    }

    public final boolean getFrozeTouch() {
        return this.frozeTouch;
    }

    public final ym5.n3 getOnInterceptTouchEvent() {
        return this.onInterceptTouchEvent;
    }

    public final ym5.m3 getPageChangeListener() {
        return this.pageChangeListener;
    }

    public final androidx.recyclerview.widget.r3 getSnapHelper() {
        return this.snapHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (this.frozeTouch) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(event);
        ym5.n3 n3Var = this.onInterceptTouchEvent;
        if (n3Var != null) {
            if (event.getAction() == 0) {
                this.f213426h2 = event.getX();
            }
            onInterceptTouchEvent = n3Var.b(-((int) (event.getX(0) - this.f213426h2)), event, onInterceptTouchEvent);
            if (!onInterceptTouchEvent) {
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(event);
                obtain.setAction(3);
                onTouchEvent(obtain);
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.frozeTouch) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        if (this.snapHelper == null) {
            this.snapHelper = new androidx.recyclerview.widget.y1();
        }
        androidx.recyclerview.widget.r3 r3Var = this.snapHelper;
        if (r3Var != null) {
            r3Var.b(this);
        }
        super.setAdapter(f2Var);
        i(new ym5.p3(this));
    }

    public final void setCanMakeCancelAsUp(boolean z17) {
        this.canMakeCancelAsUp = z17;
    }

    public final void setDisallowInterceptWhenHorizontalScroll(boolean z17) {
        this.disallowInterceptWhenHorizontalScroll = z17;
    }

    public final void setFrozeTouch(boolean z17) {
        this.frozeTouch = z17;
    }

    public final void setOnInterceptTouchEvent(ym5.n3 n3Var) {
        this.onInterceptTouchEvent = n3Var;
    }

    public final void setPageChangeListener(ym5.m3 m3Var) {
        this.pageChangeListener = m3Var;
    }

    public final void setSnapHelper(androidx.recyclerview.widget.r3 r3Var) {
        this.snapHelper = r3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerHorizontalViewPager(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.canMakeCancelAsUp = true;
    }
}
