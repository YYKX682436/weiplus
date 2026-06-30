package com.tencent.mm.plugin.finder.live.multistream;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J \u0010\t\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/MultiStreamRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Lkotlin/Function0;", "Ljz5/f0;", "itemClick", "setRecyclerClick", "Lkotlin/Function2;", "", "doubleClick", "setRecyclerDoubleClick", "", "alpha", "setAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MultiStreamRecyclerView extends com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView {
    public yz5.l A2;
    public yz5.a B2;
    public final wj2.k0 C2;
    public kotlinx.coroutines.r2 D2;

    /* renamed from: w2, reason: collision with root package name */
    public int f111751w2;

    /* renamed from: x2, reason: collision with root package name */
    public int f111752x2;

    /* renamed from: y2, reason: collision with root package name */
    public yz5.a f111753y2;

    /* renamed from: z2, reason: collision with root package name */
    public yz5.p f111754z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiStreamRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        if (getContext() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI) {
            wj2.k0 k0Var = new wj2.k0();
            this.C2 = k0Var;
            k0Var.b(this);
        }
    }

    @Override // com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.l lVar = this.A2;
        if (lVar != null) {
            lVar.invoke(motionEvent);
        }
        yz5.a aVar = this.B2;
        if (aVar != null && ((java.lang.Boolean) aVar.invoke()).booleanValue()) {
            return false;
        }
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        kotlinx.coroutines.r2 r2Var = null;
        rk2.b bVar = adapter instanceof rk2.b ? (rk2.b) adapter : null;
        if (bVar != null && bVar.f396445d.size() < 2) {
            wj2.k0 k0Var = this.C2;
            return k0Var != null && k0Var.a(motionEvent);
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f111751w2 = (int) motionEvent.getX();
            this.f111752x2 = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) getRootView().findViewById(com.tencent.mm.R.id.mw9);
            if (draggableConstraintLayout != null) {
                draggableConstraintLayout.setNeedIntercept(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            getParent().requestDisallowInterceptTouchEvent((((double) 180) * java.lang.Math.atan2((double) java.lang.Math.abs(((int) motionEvent.getX()) - this.f111751w2), (double) java.lang.Math.abs(((int) motionEvent.getY()) - this.f111752x2))) / 3.141592653589793d >= 30.0d);
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (java.lang.Math.abs(x17 - this.f111751w2) > scaledTouchSlop || java.lang.Math.abs(y17 - this.f111752x2) > scaledTouchSlop) {
                    kotlinx.coroutines.r2 r2Var2 = this.D2;
                    if (r2Var2 != null) {
                        kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ACTION_UP] doubleClickJob = ");
                    sb6.append(this.D2);
                    sb6.append(", isActive = ");
                    kotlinx.coroutines.r2 r2Var3 = this.D2;
                    sb6.append(r2Var3 != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var3).a()) : null);
                    com.tencent.mars.xlog.Log.i("MultiStreamRecyclerView", sb6.toString());
                    kotlinx.coroutines.r2 r2Var4 = this.D2;
                    if (r2Var4 != null && ((kotlinx.coroutines.a) r2Var4).a()) {
                        kotlinx.coroutines.r2 r2Var5 = this.D2;
                        if (r2Var5 != null) {
                            kotlinx.coroutines.p2.a(r2Var5, null, 1, null);
                        }
                        yz5.p pVar = this.f111754z2;
                        if (pVar != null) {
                            pVar.invoke(java.lang.Integer.valueOf(x17), java.lang.Integer.valueOf(y17));
                        }
                    } else {
                        kotlinx.coroutines.r2 r2Var6 = this.D2;
                        if (r2Var6 != null) {
                            kotlinx.coroutines.p2.a(r2Var6, null, 1, null);
                        }
                        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
                        if (k0Var2 != null) {
                            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                            r2Var = com.tencent.mm.plugin.finder.live.util.y.n(k0Var2, kotlinx.coroutines.internal.b0.f310484a, null, new rk2.s(this, null), 2, null);
                        }
                        this.D2 = r2Var;
                    }
                }
                com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout2 = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) getRootView().findViewById(com.tencent.mm.R.id.mw9);
                if (draggableConstraintLayout2 != null) {
                    draggableConstraintLayout2.setNeedIntercept(true);
                }
            }
        }
        return (motionEvent != null && motionEvent.getPointerCount() == 1) && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        com.tencent.mars.xlog.Log.i("MultiStreamRecyclerView", "setAlpha alpha:" + f17);
    }

    public final void setRecyclerClick(yz5.a itemClick) {
        kotlin.jvm.internal.o.g(itemClick, "itemClick");
        this.f111753y2 = itemClick;
    }

    public final void setRecyclerDoubleClick(yz5.p doubleClick) {
        kotlin.jvm.internal.o.g(doubleClick, "doubleClick");
        this.f111754z2 = doubleClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiStreamRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        if (getContext() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI) {
            wj2.k0 k0Var = new wj2.k0();
            this.C2 = k0Var;
            k0Var.b(this);
        }
    }
}
