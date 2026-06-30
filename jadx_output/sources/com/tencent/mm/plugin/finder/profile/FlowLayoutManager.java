package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lzy2/xb;", "<init>", "()V", "com/tencent/mm/plugin/finder/profile/c0", "com/tencent/mm/plugin/finder/profile/d0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FlowLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements zy2.xb {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.FlowLayoutManager f123296d;

    /* renamed from: e, reason: collision with root package name */
    public int f123297e;

    /* renamed from: f, reason: collision with root package name */
    public int f123298f;

    /* renamed from: g, reason: collision with root package name */
    public int f123299g;

    /* renamed from: h, reason: collision with root package name */
    public int f123300h;

    /* renamed from: i, reason: collision with root package name */
    public int f123301i;

    /* renamed from: m, reason: collision with root package name */
    public int f123302m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.d0 f123303n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f123304o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f123305p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f123306q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f123307r;

    /* renamed from: s, reason: collision with root package name */
    public int f123308s;

    public FlowLayoutManager() {
        setAutoMeasureEnabled(true);
        this.f123296d = this;
        this.f123303n = new com.tencent.mm.plugin.finder.profile.d0(this);
        this.f123304o = new java.util.ArrayList();
        this.f123305p = new android.util.SparseArray();
        this.f123307r = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically, reason: from getter */
    public boolean getF123307r() {
        return this.f123307r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    public final void m(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (h3Var.f12065g || getItemCount() == 0) {
            return;
        }
        java.util.List list = this.f123304o;
        int size = ((java.util.ArrayList) list).size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.List list2 = ((com.tencent.mm.plugin.finder.profile.d0) ((java.util.ArrayList) list).get(i17)).f123336c;
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                android.view.View view = ((com.tencent.mm.plugin.finder.profile.c0) list2.get(i18)).f123328b;
                measureChildWithMargins(view, 0, 0);
                addView(view);
                android.graphics.Rect rect = ((com.tencent.mm.plugin.finder.profile.c0) list2.get(i18)).f123329c;
                int i19 = rect.left;
                int i27 = rect.top;
                int i28 = this.f123301i;
                layoutDecoratedWithMargins(view, i19, i27 - i28, rect.right, rect.bottom - i28);
            }
        }
    }

    public final void n() {
        java.util.List list = this.f123303n.f123336c;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.finder.profile.c0 c0Var = (com.tencent.mm.plugin.finder.profile.c0) list.get(i17);
            int position = getPosition(c0Var.f123328b);
            android.util.SparseArray sparseArray = this.f123305p;
            float f17 = ((android.graphics.Rect) sparseArray.get(position)).top;
            com.tencent.mm.plugin.finder.profile.d0 d0Var = this.f123303n;
            float f18 = 2;
            if (f17 < d0Var.f123334a + ((d0Var.f123335b - ((com.tencent.mm.plugin.finder.profile.c0) list.get(i17)).f123327a) / f18)) {
                android.graphics.Rect rect = (android.graphics.Rect) sparseArray.get(position);
                if (rect == null) {
                    rect = new android.graphics.Rect();
                }
                int i18 = ((android.graphics.Rect) sparseArray.get(position)).left;
                com.tencent.mm.plugin.finder.profile.d0 d0Var2 = this.f123303n;
                int i19 = (int) (d0Var2.f123334a + ((d0Var2.f123335b - ((com.tencent.mm.plugin.finder.profile.c0) list.get(i17)).f123327a) / f18));
                int i27 = ((android.graphics.Rect) sparseArray.get(position)).right;
                com.tencent.mm.plugin.finder.profile.d0 d0Var3 = this.f123303n;
                rect.set(i18, i19, i27, (int) (d0Var3.f123334a + ((d0Var3.f123335b - ((com.tencent.mm.plugin.finder.profile.c0) list.get(i17)).f123327a) / f18) + getDecoratedMeasuredHeight(r4)));
                sparseArray.put(position, rect);
                c0Var.f123329c = rect;
                list.set(i17, c0Var);
            }
        }
        com.tencent.mm.plugin.finder.profile.d0 d0Var4 = this.f123303n;
        d0Var4.getClass();
        d0Var4.f123336c = list;
        ((java.util.ArrayList) this.f123304o).add(this.f123303n);
        this.f123303n = new com.tencent.mm.plugin.finder.profile.d0(this);
    }

    public int o(int i17) {
        java.util.List list = this.f123304o;
        if (i17 < ((java.util.ArrayList) list).size()) {
            return ((com.tencent.mm.plugin.finder.profile.d0) ((java.util.ArrayList) list).get(i17)).f123336c.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 state) {
        androidx.recyclerview.widget.z2 recycler = z2Var;
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int i17 = this.f123298f;
        int i18 = 0;
        this.f123302m = 0;
        this.f123303n = new com.tencent.mm.plugin.finder.profile.d0(this);
        java.util.List list = this.f123304o;
        ((java.util.ArrayList) list).clear();
        android.util.SparseArray sparseArray = this.f123305p;
        sparseArray.clear();
        removeAllViews();
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(z2Var);
            this.f123301i = 0;
            return;
        }
        if (getChildCount() == 0 && state.f12065g) {
            return;
        }
        detachAndScrapAttachedViews(z2Var);
        if (getChildCount() == 0) {
            this.f123297e = getPaddingLeft();
            this.f123299g = getPaddingRight();
            this.f123298f = getPaddingTop();
            this.f123300h = (getWidth() - this.f123297e) - this.f123299g;
        }
        int itemCount = getItemCount();
        int i19 = i17;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i27 < itemCount) {
            try {
                android.view.View f17 = recycler.f(i27);
                kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
                if (8 != f17.getVisibility()) {
                    measureChildWithMargins(f17, i18, i18);
                    int decoratedMeasuredWidth = getDecoratedMeasuredWidth(f17);
                    int decoratedMeasuredHeight = getDecoratedMeasuredHeight(f17);
                    int i37 = i28 + decoratedMeasuredWidth;
                    if (i37 <= this.f123300h) {
                        int i38 = this.f123297e + i28;
                        android.graphics.Rect rect = (android.graphics.Rect) sparseArray.get(i27);
                        if (rect == null) {
                            rect = new android.graphics.Rect();
                        }
                        android.graphics.Rect rect2 = rect;
                        rect2.set(i38, i19, decoratedMeasuredWidth + i38, i19 + decoratedMeasuredHeight);
                        sparseArray.put(i27, rect2);
                        try {
                            i29 = java.lang.Math.max(i29, decoratedMeasuredHeight);
                            com.tencent.mm.plugin.finder.profile.d0 d0Var = this.f123303n;
                            com.tencent.mm.plugin.finder.profile.c0 c0Var = new com.tencent.mm.plugin.finder.profile.c0(this, decoratedMeasuredHeight, f17, rect2);
                            d0Var.getClass();
                            d0Var.f123336c.add(c0Var);
                            com.tencent.mm.plugin.finder.profile.d0 d0Var2 = this.f123303n;
                            d0Var2.f123334a = i19;
                            d0Var2.f123335b = i29;
                            i28 = i37;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            i28 = i37;
                            com.tencent.mars.xlog.Log.e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i27 + " itemCount = " + getItemCount());
                            i27++;
                            recycler = z2Var;
                            i18 = 0;
                        }
                    } else {
                        if (this.f123306q) {
                            n();
                            this.f123302m += i29;
                            break;
                        }
                        n();
                        i19 += i29;
                        this.f123302m += i29;
                        int i39 = this.f123297e;
                        android.graphics.Rect rect3 = (android.graphics.Rect) sparseArray.get(i27);
                        if (rect3 == null) {
                            rect3 = new android.graphics.Rect();
                        }
                        rect3.set(i39, i19, i39 + decoratedMeasuredWidth, i19 + decoratedMeasuredHeight);
                        sparseArray.put(i27, rect3);
                        try {
                            com.tencent.mm.plugin.finder.profile.d0 d0Var3 = this.f123303n;
                            com.tencent.mm.plugin.finder.profile.c0 c0Var2 = new com.tencent.mm.plugin.finder.profile.c0(this, decoratedMeasuredHeight, f17, rect3);
                            d0Var3.getClass();
                            d0Var3.f123336c.add(c0Var2);
                            com.tencent.mm.plugin.finder.profile.d0 d0Var4 = this.f123303n;
                            d0Var4.f123334a = i19;
                            d0Var4.f123335b = decoratedMeasuredHeight;
                            i28 = decoratedMeasuredWidth;
                            i29 = decoratedMeasuredHeight;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            i28 = decoratedMeasuredWidth;
                            i29 = decoratedMeasuredHeight;
                            com.tencent.mars.xlog.Log.e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i27 + " itemCount = " + getItemCount());
                            i27++;
                            recycler = z2Var;
                            i18 = 0;
                        }
                    }
                    if (i27 == getItemCount() - 1) {
                        n();
                        this.f123302m += i29;
                    }
                    if (this.f123308s > 0 && ((java.util.ArrayList) list).size() >= this.f123308s) {
                        break;
                    }
                }
            } catch (java.lang.Exception e19) {
                e = e19;
            }
            i27++;
            recycler = z2Var;
            i18 = 0;
        }
        this.f123302m = java.lang.Math.max(this.f123302m, p());
        m(z2Var, state);
    }

    public final int p() {
        com.tencent.mm.plugin.finder.profile.FlowLayoutManager flowLayoutManager = this.f123296d;
        return (flowLayoutManager.getHeight() - flowLayoutManager.getPaddingBottom()) - flowLayoutManager.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int i18 = this.f123302m;
        int i19 = this.f123301i;
        if (i19 + i17 < 0) {
            i17 = -i19;
        } else if (i19 + i17 > i18 - p()) {
            i17 = (this.f123302m - p()) - this.f123301i;
        }
        this.f123301i += i17;
        offsetChildrenVertical(-i17);
        m(recycler, state);
        return i17;
    }
}
