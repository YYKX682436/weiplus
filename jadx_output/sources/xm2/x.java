package xm2;

/* loaded from: classes14.dex */
public final class x extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f455276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f455277e;

    /* renamed from: f, reason: collision with root package name */
    public final int f455278f;

    /* renamed from: g, reason: collision with root package name */
    public final int f455279g;

    /* renamed from: h, reason: collision with root package name */
    public int f455280h;

    /* renamed from: i, reason: collision with root package name */
    public int f455281i;

    public x(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f455276d = i65.a.b(context, 68);
        this.f455277e = i65.a.b(context, 98);
        this.f455278f = i65.a.b(context, 20);
        this.f455279g = i65.a.b(context, 12);
        this.f455281i = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        if (getItemCount() == 0) {
            return false;
        }
        int itemCount = getItemCount();
        int i17 = this.f455278f;
        int i18 = this.f455276d;
        if (itemCount == 1) {
            return getWidth() < i18 + (i17 * 2);
        }
        return getWidth() < ((i18 * getItemCount()) + (this.f455279g * (getItemCount() - 1))) + (i17 * 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(this.f455276d, this.f455277e);
    }

    public final void m(androidx.recyclerview.widget.z2 z2Var) {
        detachAndScrapAttachedViews(z2Var);
        int itemCount = getItemCount();
        int i17 = this.f455278f;
        for (int i18 = 0; i18 < itemCount; i18++) {
            int i19 = this.f455276d;
            int i27 = i17 + i19;
            int i28 = this.f455280h;
            int i29 = this.f455279g;
            if (i27 >= i28) {
                if (i17 > i28 + getWidth()) {
                    break;
                }
                android.view.View f17 = z2Var.f(i18);
                kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
                addView(f17);
                measureChild(f17, 0, 0);
                int i37 = i17 - this.f455280h;
                layoutDecorated(f17, i37, 0, i37 + i19, this.f455277e);
            }
            i17 += i19 + i29;
        }
        java.util.List list = z2Var.f12312d;
        kotlin.jvm.internal.o.f(list, "getScrapList(...)");
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            z2Var.i(((androidx.recyclerview.widget.k3) it.next()).itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int i17 = this.f455281i;
        if (i17 >= 0) {
            int i18 = this.f455276d;
            int i19 = this.f455279g;
            int i27 = (i18 + i19) * i17;
            int i28 = this.f455278f;
            int width = (i27 + i28) - ((getWidth() - i18) / 2);
            int itemCount = (((i18 * getItemCount()) + (i19 * (getItemCount() - 1))) + (i28 * 2)) - getWidth();
            if (width > itemCount) {
                width = itemCount;
            }
            if (width < 0) {
                width = 0;
            }
            this.f455280h = width;
            this.f455281i = -1;
        }
        m(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int itemCount = (this.f455276d * getItemCount()) + (this.f455279g * (getItemCount() - 1)) + (this.f455278f * 2);
        int i18 = this.f455280h + i17;
        int width = itemCount - getWidth();
        if (i18 > width) {
            i18 = width;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = i18 - this.f455280h;
        this.f455280h = i18;
        m(recycler);
        return i19;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f455281i = i17;
        requestLayout();
    }
}
