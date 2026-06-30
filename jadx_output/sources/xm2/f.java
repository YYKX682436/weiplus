package xm2;

/* loaded from: classes14.dex */
public final class f extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f455208d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f455209e;

    /* renamed from: f, reason: collision with root package name */
    public final int f455210f;

    /* renamed from: g, reason: collision with root package name */
    public final int f455211g;

    /* renamed from: h, reason: collision with root package name */
    public final int f455212h;

    /* renamed from: i, reason: collision with root package name */
    public final int f455213i;

    /* renamed from: m, reason: collision with root package name */
    public final int f455214m;

    /* renamed from: n, reason: collision with root package name */
    public final int f455215n;

    /* renamed from: o, reason: collision with root package name */
    public int f455216o;

    /* renamed from: p, reason: collision with root package name */
    public int f455217p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f455218q;

    public f(android.content.Context context, java.util.List flattenedItems, yz5.l mostRevealedGroupChangeHandler) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(flattenedItems, "flattenedItems");
        kotlin.jvm.internal.o.g(mostRevealedGroupChangeHandler, "mostRevealedGroupChangeHandler");
        this.f455208d = flattenedItems;
        this.f455209e = mostRevealedGroupChangeHandler;
        this.f455210f = i65.a.b(context, 68);
        this.f455211g = i65.a.b(context, 102);
        this.f455212h = i65.a.b(context, 32);
        this.f455213i = i65.a.b(context, 20);
        int b17 = i65.a.b(context, 16);
        this.f455214m = b17;
        int i17 = -b17;
        int size = flattenedItems.size();
        int i18 = 0;
        boolean z17 = false;
        while (i18 < size) {
            boolean z18 = this.f455208d.get(i18) == null;
            i17 += ((z18 || z17) ? 0 : this.f455214m) + (z18 ? this.f455212h : this.f455210f);
            i18++;
            z17 = z18;
        }
        this.f455215n = java.lang.Math.max(0, i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        if (getItemCount() == 0) {
            return false;
        }
        return this.f455215n + (this.f455213i * 2) > getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(this.f455210f, this.f455211g);
    }

    public final int m(androidx.recyclerview.widget.z2 z2Var) {
        int i17;
        int i18;
        int i19 = this.f455216o;
        int i27 = this.f455213i;
        double d17 = i19 - i27;
        int width = getWidth();
        int i28 = this.f455215n;
        double width2 = (getWidth() * e06.p.d(d17 / (i28 - width), 0.0d, 1.0d)) + this.f455216o;
        detachAndScrapAttachedViews(z2Var);
        int i29 = this.f455214m;
        int itemCount = getItemCount();
        int i37 = 0;
        int i38 = i27 - i29;
        int i39 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = -1;
        while (true) {
            if (i48 >= itemCount) {
                i17 = i49;
                break;
            }
            int i57 = this.f455208d.get(i48) == null ? 1 : i37;
            if (i57 != 0) {
                i39++;
            }
            int i58 = i39;
            int i59 = i57 != 0 ? this.f455212h : this.f455210f;
            int i66 = (i57 == 0 && i47 == 0) ? i29 : i37;
            int i67 = i38 + i59;
            int i68 = this.f455216o;
            if (i67 < i68) {
                i38 += i66 + i59;
                i18 = i48;
            } else {
                if (i38 > i68 + getWidth()) {
                    i17 = i49;
                    i39 = i58;
                    break;
                }
                android.view.View f17 = z2Var.f(i48);
                kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
                addView(f17);
                android.view.ViewGroup.LayoutParams layoutParams = f17.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i59;
                f17.setLayoutParams(layoutParams2);
                measureChild(f17, i37, i37);
                int i69 = (i38 - this.f455216o) + i66;
                int i76 = i49;
                i18 = i48;
                layoutDecorated(f17, i69, 0, i69 + i59, this.f455211g);
                i49 = (((double) i38) > width2 || width2 > ((double) ((i38 + i66) + i59))) ? i76 : i58;
                i38 += i66 + i59;
            }
            i48 = i18 + 1;
            i47 = i57;
            i39 = i58;
            i37 = 0;
        }
        if (i17 == -1) {
            i17 = width2 > ((double) i28) ? i39 : 0;
        }
        int i77 = i17;
        java.util.List list = z2Var.f12312d;
        kotlin.jvm.internal.o.f(list, "getScrapList(...)");
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            z2Var.i(((androidx.recyclerview.widget.k3) it.next()).itemView);
        }
        return i77;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int m17 = m(recycler);
        if (this.f455218q) {
            this.f455217p = m17;
            this.f455218q = false;
        } else if (m17 != this.f455217p) {
            this.f455217p = m17;
            this.f455209e.invoke(java.lang.Integer.valueOf(m17));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int i18 = this.f455215n + (this.f455213i * 2);
        int i19 = this.f455216o + i17;
        int width = i18 - getWidth();
        if (i19 > width) {
            i19 = width;
        }
        if (i19 < 0) {
            i19 = 0;
        }
        int i27 = i19 - this.f455216o;
        this.f455216o = i19;
        int m17 = m(recycler);
        if (m17 != this.f455217p) {
            this.f455217p = m17;
            this.f455209e.invoke(java.lang.Integer.valueOf(m17));
        }
        return i27;
    }
}
