package com.tencent.mm.plugin.finder.view.manager.ad;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "sx2/a", "sx2/b", "sx2/c", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class AdStackLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final sx2.c f132642d;

    /* renamed from: e, reason: collision with root package name */
    public final int f132643e;

    /* renamed from: f, reason: collision with root package name */
    public int f132644f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f132645g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.u2 f132646h;

    /* renamed from: i, reason: collision with root package name */
    public final sx2.h f132647i;

    /* renamed from: m, reason: collision with root package name */
    public final sx2.i f132648m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f132649n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f132650o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f132651p;

    /* renamed from: q, reason: collision with root package name */
    public sx2.a f132652q;

    /* renamed from: r, reason: collision with root package name */
    public int f132653r;

    /* renamed from: s, reason: collision with root package name */
    public sx2.b f132654s;

    public AdStackLayoutManager(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        sx2.c cVar = sx2.c.f413525d;
        this.f132642d = cVar;
        this.f132643e = 2;
        this.f132647i = new sx2.f(cVar, 2);
        this.f132648m = new sx2.g(cVar, 2, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
        this.f132649n = true;
        this.f132652q = sx2.a.f413519d;
        this.f132644f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r1 == sx2.a.f413522g) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r6.n() < 0.5d) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == sx2.a.f413523h) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r1 == sx2.a.f413520e) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r1 == sx2.a.f413521f) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            int r0 = r6.o()
            sx2.a r1 = r6.f132652q
            sx2.a r2 = sx2.a.f413519d
            r6.f132652q = r2
            sx2.c r2 = r6.f132642d
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L30
            r4 = 2
            if (r2 == r4) goto L26
            r4 = 3
            if (r2 == r4) goto L1c
            goto L44
        L1c:
            sx2.a r2 = sx2.a.f413523h
            if (r1 != r2) goto L21
            goto L50
        L21:
            sx2.a r2 = sx2.a.f413522g
            if (r1 != r2) goto L44
            goto L52
        L26:
            sx2.a r2 = sx2.a.f413522g
            if (r1 != r2) goto L2b
            goto L50
        L2b:
            sx2.a r2 = sx2.a.f413523h
            if (r1 != r2) goto L44
            goto L52
        L30:
            sx2.a r2 = sx2.a.f413521f
            if (r1 != r2) goto L35
            goto L50
        L35:
            sx2.a r2 = sx2.a.f413520e
            if (r1 != r2) goto L44
            goto L52
        L3a:
            sx2.a r2 = sx2.a.f413520e
            if (r1 != r2) goto L3f
            goto L50
        L3f:
            sx2.a r2 = sx2.a.f413521f
            if (r1 != r2) goto L44
            goto L52
        L44:
            float r1 = r6.n()
            double r1 = (double) r1
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L50
            goto L52
        L50:
            int r0 = r0 + 1
        L52:
            r6.t(r0, r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager.m(com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager, androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        if (getItemCount() == 0) {
            return false;
        }
        int ordinal = this.f132642d.ordinal();
        return ordinal == 0 || ordinal == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        if (getItemCount() == 0) {
            return false;
        }
        int ordinal = this.f132642d.ordinal();
        return ordinal == 2 || ordinal == 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public final float n() {
        float width;
        int width2;
        if (getWidth() == 0 || getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("AdStackLayoutManager", "getFirstVisibleItemMovePercent: error, width=" + getWidth() + ", height=" + getHeight());
            return 0.0f;
        }
        int ordinal = this.f132642d.ordinal();
        if (ordinal == 0) {
            float width3 = 1 - (((this.f132644f % getWidth()) * 1.0f) / getWidth());
            if (width3 == 1.0f) {
                return 0.0f;
            }
            return width3;
        }
        if (ordinal == 1) {
            width = (this.f132644f % getWidth()) * 1.0f;
            width2 = getWidth();
        } else {
            if (ordinal == 2) {
                float height = 1 - (((this.f132644f % getHeight()) * 1.0f) / getHeight());
                if (height == 1.0f) {
                    return 0.0f;
                }
                return height;
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
            width = (this.f132644f % getHeight()) * 1.0f;
            width2 = getHeight();
        }
        return width / width2;
    }

    public final int o() {
        int itemCount;
        double ceil;
        double floor;
        if (getWidth() == 0 || getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("AdStackLayoutManager", "getFirstVisibleItemPosition: error, width=" + getWidth() + ", height=" + getHeight());
            return 0;
        }
        int ordinal = this.f132642d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                floor = java.lang.Math.floor((this.f132644f * 1.0d) / getWidth());
            } else if (ordinal == 2) {
                itemCount = getItemCount() - 1;
                ceil = java.lang.Math.ceil((this.f132644f * 1.0d) / getHeight());
            } else {
                if (ordinal != 3) {
                    throw new jz5.j();
                }
                floor = java.lang.Math.floor((this.f132644f * 1.0d) / getHeight());
            }
            return (int) floor;
        }
        itemCount = getItemCount() - 1;
        ceil = java.lang.Math.ceil((this.f132644f * 1.0d) / getWidth());
        return itemCount - ((int) ceil);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onAttachedToWindow(view);
        sx2.d dVar = new sx2.d(this, view);
        this.f132646h = dVar;
        view.setOnFlingListener(dVar);
        sx2.e eVar = new sx2.e(this, view);
        this.f132645g = eVar;
        view.i(eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
        androidx.recyclerview.widget.u2 onFlingListener = recyclerView != null ? recyclerView.getOnFlingListener() : null;
        androidx.recyclerview.widget.u2 u2Var = this.f132646h;
        if (u2Var == null) {
            kotlin.jvm.internal.o.o("onFlingListener");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(onFlingListener, u2Var)) {
            recyclerView.setOnFlingListener(null);
        }
        if (recyclerView != null) {
            androidx.recyclerview.widget.w2 w2Var = this.f132645g;
            if (w2Var != null) {
                recyclerView.V0(w2Var);
            } else {
                kotlin.jvm.internal.o.o("onScrollListener");
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        ((sx2.g) this.f132648m).f413532c = false;
        removeAndRecycleAllViews(recycler);
        if (getItemCount() > 0) {
            this.f132644f = q(this.f132644f);
            r(recycler);
        }
    }

    public final int p(int i17) {
        int itemCount;
        int width;
        int width2;
        int ordinal = this.f132642d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                width2 = getWidth();
            } else if (ordinal == 2) {
                itemCount = (getItemCount() - 1) - i17;
                width = getHeight();
            } else {
                if (ordinal != 3) {
                    throw new jz5.j();
                }
                width2 = getHeight();
            }
            return i17 * width2;
        }
        itemCount = (getItemCount() - 1) - i17;
        width = getWidth();
        return width * itemCount;
    }

    public final int q(int i17) {
        int ordinal = this.f132642d.ordinal();
        return (ordinal == 0 || ordinal == 1) ? java.lang.Math.max(java.lang.Math.min(getWidth() * (getItemCount() - 1), i17), 0) : java.lang.Math.max(java.lang.Math.min(getHeight() * (getItemCount() - 1), i17), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.recyclerview.widget.z2 r25) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager.r(androidx.recyclerview.widget.z2):void");
    }

    public final void s(android.view.View view) {
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/manager/ad/AdStackLayoutManager", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int i18 = this.f132644f + i17;
        int q17 = q(i18);
        this.f132644f = q17;
        int i19 = (q17 - i18) + i17;
        if (i19 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(recycler);
        r(recycler);
        return i19;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        if (i17 >= 0 && i17 < getItemCount()) {
            this.f132644f = p(i17);
            requestLayout();
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i17 + " is out of bound [0.." + getItemCount() + "-1]");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int i18 = this.f132644f + i17;
        int q17 = q(i18);
        this.f132644f = q17;
        int i19 = (q17 - i18) + i17;
        if (i19 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(recycler);
        r(recycler);
        return i19;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 >= 0 && i17 < getItemCount()) {
            this.f132650o = true;
            t(i17, recyclerView, true);
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i17 + " is out of bound [0.." + getItemCount() + "-1]");
    }

    public final void t(int i17, androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        int p17 = p(i17);
        int ordinal = this.f132642d.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (z17) {
                recyclerView.smoothScrollBy(p17 - this.f132644f, 0);
                return;
            } else {
                recyclerView.scrollBy(p17 - this.f132644f, 0);
                return;
            }
        }
        if (z17) {
            recyclerView.smoothScrollBy(0, p17 - this.f132644f);
        } else {
            recyclerView.scrollBy(0, p17 - this.f132644f);
        }
    }
}
