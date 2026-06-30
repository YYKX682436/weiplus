package com.tencent.mm.plugin.forcenotify.ui.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "l13/b", "l13/c", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class StackLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f137354d;

    /* renamed from: e, reason: collision with root package name */
    public final int f137355e;

    /* renamed from: f, reason: collision with root package name */
    public final float f137356f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f137357g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f137358h;

    /* renamed from: i, reason: collision with root package name */
    public int f137359i;

    /* renamed from: m, reason: collision with root package name */
    public int f137360m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f137361n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f137362o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f137363p;

    /* renamed from: q, reason: collision with root package name */
    public int f137364q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public int f137365r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f137366s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.u2 f137367t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f137368u;

    public StackLayoutManager(int i17, int i18, float f17, boolean z17, yz5.p pVar) {
        this.f137354d = i17;
        this.f137355e = i18;
        this.f137356f = f17;
        this.f137357g = z17;
        this.f137358h = pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f137366s = arrayList;
        l13.a aVar = new l13.a(i17);
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    public static final void m(com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView, l13.b bVar) {
        int n17 = stackLayoutManager.n();
        l13.b bVar2 = l13.b.f314988f;
        if (bVar == bVar2 ? stackLayoutManager.p() >= stackLayoutManager.f137356f : bVar == l13.b.f314986d) {
            n17++;
        }
        boolean z17 = bVar != bVar2;
        if (z17) {
            stackLayoutManager.f137362o = false;
            stackLayoutManager.f137363p = true;
        }
        if (recyclerView != null) {
            stackLayoutManager.q(n17, recyclerView, true, z17);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return getItemCount() != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    public final int n() {
        if (getWidth() == 0 || getHeight() == 0) {
            return 0;
        }
        return this.f137360m / getHeight();
    }

    public final void o(androidx.recyclerview.widget.z2 z2Var, boolean z17) {
        java.util.List list;
        java.lang.String str;
        int i17;
        int i18;
        if (z2Var == null) {
            return;
        }
        int n17 = n();
        int min = java.lang.Math.min(this.f137354d + n17, getItemCount() - 1);
        boolean z18 = this.f137360m % getHeight() == 0;
        if (z17 && z18 && n17 != (i18 = this.f137359i)) {
            yz5.p pVar = this.f137358h;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(n17));
            }
            this.f137359i = n17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str2 = "getViewForPosition(...)";
        if (n17 <= min) {
            int i19 = n17;
            while (true) {
                android.view.View f17 = z2Var.f(i19);
                kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
                arrayList.add(f17);
                if (i19 == min) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        if (n17 <= min) {
            int i27 = min;
            while (true) {
                android.view.View view = (android.view.View) arrayList.get(i27 - n17);
                addView(view);
                measureChild(view, 0, 0);
                if (i27 == n17) {
                    break;
                } else {
                    i27--;
                }
            }
        }
        java.util.List list2 = this.f137366s;
        if (n17 <= min) {
            int i28 = min;
            while (true) {
                int i29 = i28 - n17;
                android.view.View view2 = (android.view.View) arrayList.get(i29);
                android.view.View view3 = i29 <= 0 ? null : (android.view.View) arrayList.get(i29 - 1);
                android.view.View view4 = i29 < kz5.c0.h(arrayList) ? (android.view.View) arrayList.get(i29 + 1) : null;
                if (view2 != null) {
                    int width = (getWidth() - getDecoratedMeasuredWidth(view2)) / 2;
                    int height = i29 == 0 ? (-this.f137360m) % getHeight() : (int) (this.f137355e * (i29 - p()));
                    layoutDecorated(view2, width, height, width + getDecoratedMeasuredWidth(view2), height + getDecoratedMeasuredHeight(view2));
                }
                java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                while (it.hasNext()) {
                    ((l13.c) it.next()).b(view2, i28, n17, p(), view3, view4);
                    arrayList = arrayList;
                    list2 = list2;
                    str2 = str2;
                    min = min;
                }
                int i37 = i28;
                list = list2;
                str = str2;
                java.util.ArrayList arrayList2 = arrayList;
                i17 = min;
                if (i37 == n17) {
                    break;
                }
                i28 = i37 - 1;
                arrayList = arrayList2;
                list2 = list;
                str2 = str;
                min = i17;
            }
        } else {
            list = list2;
            str = "getViewForPosition(...)";
            i17 = min;
        }
        int i38 = n17 - 1;
        if (i38 >= 0) {
            android.view.View f18 = z2Var.f(i38);
            kotlin.jvm.internal.o.f(f18, str);
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                ((l13.c) it6.next()).a(f18);
            }
            removeAndRecycleView(f18, z2Var);
        }
        int i39 = i17 + 1;
        if (i39 < getItemCount()) {
            android.view.View f19 = z2Var.f(i39);
            kotlin.jvm.internal.o.f(f19, str);
            java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
            while (it7.hasNext()) {
                ((l13.c) it7.next()).a(f19);
            }
            removeAndRecycleView(f19, z2Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        l13.d dVar = new l13.d(this, recyclerView);
        this.f137367t = dVar;
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(dVar);
        }
        l13.e eVar = new l13.e(this, recyclerView);
        this.f137368u = eVar;
        if (recyclerView != null) {
            recyclerView.i(eVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
        androidx.recyclerview.widget.u2 onFlingListener = recyclerView != null ? recyclerView.getOnFlingListener() : null;
        androidx.recyclerview.widget.u2 u2Var = this.f137367t;
        if (u2Var == null) {
            kotlin.jvm.internal.o.o("onFlingListener");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(onFlingListener, u2Var)) {
            recyclerView.setOnFlingListener(null);
        }
        if (recyclerView != null) {
            androidx.recyclerview.widget.w2 w2Var = this.f137368u;
            if (w2Var != null) {
                recyclerView.V0(w2Var);
            } else {
                kotlin.jvm.internal.o.o("onScrollListener");
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MsgWindow", "onItemsAdded positionStart = " + i17 + ", itemCount = " + i18);
        if (i17 > n()) {
            i18 = 0;
        }
        this.f137360m += getHeight() * i18;
        this.f137359i += i18;
        if (this.f137362o) {
            this.f137364q += i18 * getHeight();
        }
        this.f137360m = java.lang.Math.max(this.f137360m, 0);
        this.f137359i = java.lang.Math.max(this.f137359i, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MsgWindow", "onItemsMoved from = " + i17 + ", to = " + i18 + ", itemCount = " + i19);
        if (i19 != 1) {
            return;
        }
        int n17 = n();
        if (i17 != n17) {
            int i27 = (i18 > n17 ? 0 : 1) - (i17 < n17 ? 1 : 0);
            this.f137360m += getHeight() * i27;
            this.f137359i += i27;
            if (this.f137362o) {
                this.f137364q += i27 * getHeight();
            }
        } else {
            this.f137360m = (getHeight() * i18) + (this.f137360m % getHeight());
            this.f137359i = i18;
            if (this.f137362o) {
                this.f137364q = i18 * getHeight();
            }
        }
        this.f137360m = r(this.f137360m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MsgWindow", "onItemsRemoved positionStart = " + i17 + ", itemCount = " + i18);
        int max = java.lang.Math.max((java.lang.Math.min((i18 + i17) + (-1), n() + (-1)) - i17) + 1, 0);
        this.f137360m = this.f137360m - (getHeight() * max);
        this.f137359i = this.f137359i - max;
        if (this.f137362o) {
            this.f137364q -= max * getHeight();
        }
        this.f137360m = java.lang.Math.max(this.f137360m, 0);
        this.f137359i = java.lang.Math.max(this.f137359i, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutChildren(z2Var, h3Var);
        if (z2Var == null) {
            return;
        }
        detachAndScrapAttachedViews(z2Var);
        if (getItemCount() <= 0) {
            return;
        }
        this.f137360m = r(this.f137360m);
        o(z2Var, false);
    }

    public final float p() {
        if (getWidth() == 0 || getHeight() == 0) {
            return 0.0f;
        }
        return ((this.f137360m % getHeight()) * 1.0f) / getHeight();
    }

    public final void q(int i17, androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17, boolean z18) {
        int height = i17 * getHeight();
        int i18 = height - this.f137360m;
        if (z18 && java.lang.Math.abs(i18) > 0) {
            this.f137365r = height;
        } else if (z18) {
            this.f137363p = false;
            if (!this.f137362o) {
                this.f137364q = Integer.MAX_VALUE;
            }
        }
        if (z17) {
            recyclerView.smoothScrollBy(0, i18);
        } else {
            recyclerView.scrollBy(0, i18);
        }
    }

    public final int r(int i17) {
        return java.lang.Math.max(java.lang.Math.min(i17, getHeight() * (getItemCount() - 1)), 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f137360m = getHeight() * i17;
        this.f137359i = i17;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (z2Var == null) {
            return 0;
        }
        int i18 = this.f137360m + i17;
        int i19 = this.f137364q;
        l13.b bVar = i18 > i19 ? l13.b.f314986d : l13.b.f314987e;
        if (this.f137357g && ((this.f137362o || this.f137363p) && i19 != Integer.MAX_VALUE && java.lang.Math.abs(i18 - i19) > getHeight())) {
            i18 = bVar == l13.b.f314986d ? this.f137364q + getHeight() : this.f137364q - getHeight();
        }
        int r17 = r(i18);
        this.f137360m = r17;
        if (this.f137363p && r17 == this.f137365r) {
            this.f137363p = false;
            if (!this.f137362o) {
                this.f137364q = Integer.MAX_VALUE;
            }
        }
        int i27 = (r17 - i18) + i17;
        if (i27 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(z2Var);
        o(z2Var, true);
        return i27;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (recyclerView != null) {
            q(i17, recyclerView, true, false);
        }
    }
}
