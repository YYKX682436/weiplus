package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lrx2/x;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderLiveLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager implements rx2.x {
    public static final int E = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
    public yz5.a A;
    public final boolean B;
    public final int C;
    public yz5.p D;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f115988v;

    /* renamed from: w, reason: collision with root package name */
    public int f115989w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f115990x;

    /* renamed from: y, reason: collision with root package name */
    public int f115991y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.r f115992z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115988v = context;
        this.f115991y = -1;
        ae2.in inVar = ae2.in.f3688a;
        this.B = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.W2).getValue()).r()).intValue() == 0;
        this.C = E + ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 1.0f);
    }

    public static void Y(com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager, boolean z17, boolean z18, com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelectedChild");
        }
        int i18 = 0;
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            feedUpdateEvent = null;
        }
        if (finderLiveLayoutManager.getChildCount() != 1) {
            if (super.canScrollHorizontally()) {
                int width = finderLiveLayoutManager.getWidth() / 2;
                int childCount = finderLiveLayoutManager.getChildCount();
                while (i18 < childCount) {
                    android.view.View childAt = finderLiveLayoutManager.getChildAt(i18);
                    kotlin.jvm.internal.o.d(childAt);
                    int left = childAt.getLeft();
                    android.view.View childAt2 = finderLiveLayoutManager.getChildAt(i18);
                    kotlin.jvm.internal.o.d(childAt2);
                    if ((left + childAt2.getRight()) / 2 == width) {
                        break;
                    } else {
                        i18++;
                    }
                }
                i18 = -1;
            } else {
                int height = finderLiveLayoutManager.getHeight() / 2;
                int childCount2 = finderLiveLayoutManager.getChildCount();
                while (i18 < childCount2) {
                    android.view.View childAt3 = finderLiveLayoutManager.getChildAt(i18);
                    kotlin.jvm.internal.o.d(childAt3);
                    int top = childAt3.getTop();
                    android.view.View childAt4 = finderLiveLayoutManager.getChildAt(i18);
                    kotlin.jvm.internal.o.d(childAt4);
                    if ((top + childAt4.getBottom()) / 2 == height) {
                        break;
                    } else {
                        i18++;
                    }
                }
                i18 = -1;
            }
        }
        if (i18 >= 0) {
            android.view.View childAt5 = finderLiveLayoutManager.getChildAt(i18);
            kotlin.jvm.internal.o.d(childAt5);
            int position = finderLiveLayoutManager.getPosition(childAt5);
            if (position != finderLiveLayoutManager.f115991y || z17 || z18) {
                finderLiveLayoutManager.f115991y = position;
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveLayoutManager", "selectedPosition:" + finderLiveLayoutManager.f115991y);
                yz5.r rVar = finderLiveLayoutManager.f115992z;
                if (rVar != null) {
                    rVar.C(java.lang.Integer.valueOf(finderLiveLayoutManager.f115991y), childAt5, java.lang.Boolean.valueOf(z18), feedUpdateEvent);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int G(androidx.recyclerview.widget.h3 h3Var) {
        int i17;
        return (!this.B || (i17 = this.C) == -1) ? super.G(h3Var) : i17;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveLayoutManager", "lxltest scrollToPositionWithOffset position:" + i17 + ", offset:" + i18);
        super.P(i17, i18);
    }

    public final boolean W(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (i19 > 0 && i17 != i19) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i17;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i17;
        }
        return true;
    }

    public final boolean X(android.view.View view, int i17, int i18, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && W(view.getWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && W(view.getHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        tn0.w0 w0Var;
        if (this.f11867d != 1 || this.f115988v.getResources().getConfiguration().orientation != 1) {
            return false;
        }
        android.view.View findViewByPosition = findViewByPosition(this.f115991y);
        android.view.View findViewById = findViewByPosition != null ? findViewByPosition.findViewById(com.tencent.mm.R.id.f484854fq1) : null;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = findViewById instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewById : null;
        if (finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.isInputMode() : false) {
            return false;
        }
        if ((zl2.r4.f473950a.w1() || (w0Var = dk2.ef.f233378d) == null || !w0Var.X()) ? false : true) {
            return false;
        }
        android.view.View findViewByPosition2 = findViewByPosition(this.f115991y);
        android.view.KeyEvent.Callback findViewById2 = findViewByPosition2 != null ? findViewByPosition2.findViewById(com.tencent.mm.R.id.fkn) : null;
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout finderLiveInterceptTouchRelativeLayout = findViewById2 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) findViewById2 : null;
        if (finderLiveInterceptTouchRelativeLayout != null ? finderLiveInterceptTouchRelativeLayout.getInterceptTouch() : false) {
            return false;
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        return !(c1Var != null && c1Var.Z2);
    }

    @Override // rx2.x
    public void k(yz5.p pVar) {
        this.D = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChild(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
        calculateItemDecorationsForChild(child, new android.graphics.Rect());
        int childMeasureSpec = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, canScrollHorizontally());
        int childMeasureSpec2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, getF123307r());
        try {
            if (X(child, childMeasureSpec, childMeasureSpec2, layoutParams2)) {
                child.measure(childMeasureSpec, childMeasureSpec2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveLayoutManager", "measureChild error", th6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
        calculateItemDecorationsForChild(child, new android.graphics.Rect());
        int childMeasureSpec = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, canScrollHorizontally());
        int childMeasureSpec2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, getF123307r());
        try {
            if (X(child, childMeasureSpec, childMeasureSpec2, layoutParams2)) {
                child.measure(childMeasureSpec, childMeasureSpec2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveLayoutManager", "measureChildWithMargins error", th6);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.live.view.u5(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i17) {
        super.onScrollStateChanged(i17);
        this.f115989w = i17;
        if (i17 == 0) {
            yz5.a aVar = this.A;
            if (aVar != null) {
                boolean booleanValue = ((java.lang.Boolean) aVar.invoke()).booleanValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveLayoutManager", "isNeedCheck = " + booleanValue);
                if (booleanValue) {
                    Y(this, true, false, null, 6, null);
                } else {
                    Y(this, false, false, null, 7, null);
                }
            }
            if (this.A == null) {
                Y(this, false, false, null, 7, null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveLayoutManager", "lxltest scrollToPosition position:" + i17);
        super.scrollToPosition(i17);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        long currentTimeMillis = this.D == null ? 0L : java.lang.System.currentTimeMillis();
        try {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        } finally {
            yz5.p pVar = this.D;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.invoke(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), h3Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveLayoutManager", "lxltest smoothScrollToPosition state:" + h3Var + ", position:" + i17);
        super.smoothScrollToPosition(recyclerView, h3Var, i17);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
