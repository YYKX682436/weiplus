package xm2;

/* loaded from: classes14.dex */
public final class q extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f455249d;

    /* renamed from: e, reason: collision with root package name */
    public final int f455250e;

    /* renamed from: f, reason: collision with root package name */
    public final int f455251f;

    /* renamed from: g, reason: collision with root package name */
    public final int f455252g;

    /* renamed from: h, reason: collision with root package name */
    public final int f455253h;

    /* renamed from: i, reason: collision with root package name */
    public int f455254i;

    /* renamed from: m, reason: collision with root package name */
    public int f455255m;

    public q(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f455249d = i65.a.b(context, 68);
        this.f455250e = i65.a.b(context, 98);
        this.f455251f = i65.a.b(context, 20);
        this.f455252g = i65.a.b(context, 12);
        this.f455253h = i65.a.b(context, 24);
        this.f455255m = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        if (getItemCount() == 0) {
            return false;
        }
        int itemCount = getItemCount();
        int i17 = this.f455249d;
        int i18 = this.f455251f;
        return itemCount == 1 ? getWidth() < i17 + (i18 * 2) : ((getWidth() - (i18 * 2)) - (getItemCount() * i17)) / (getItemCount() - 1) <= this.f455253h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(this.f455249d, this.f455250e);
    }

    public final void m(androidx.recyclerview.widget.z2 z2Var, int i17, int i18) {
        detachAndScrapAttachedViews(z2Var);
        int itemCount = getItemCount();
        for (int i19 = 0; i19 < itemCount; i19++) {
            int i27 = this.f455249d;
            int i28 = i17 + i27;
            int i29 = this.f455254i;
            if (i28 >= i29) {
                if (i17 > i29 + getWidth()) {
                    break;
                }
                android.view.View f17 = z2Var.f(i19);
                kotlin.jvm.internal.o.f(f17, "getViewForPosition(...)");
                addView(f17);
                measureChild(f17, 0, 0);
                int i37 = i17 - this.f455254i;
                layoutDecorated(f17, i37, 0, i37 + i27, this.f455250e);
            }
            i17 += i27 + i18;
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
        int width = getWidth();
        int i17 = this.f455251f;
        int itemCount = getItemCount();
        int i18 = this.f455249d;
        int f17 = getItemCount() > 1 ? e06.p.f(((width - (i17 * 2)) - (itemCount * i18)) / (getItemCount() - 1), this.f455252g, this.f455253h) : 0;
        int max = java.lang.Math.max(i17, ((getWidth() - (getItemCount() * i18)) - ((getItemCount() - 1) * f17)) / 2);
        int i19 = this.f455255m;
        if (i19 >= 0) {
            int width2 = (((i18 + f17) * i19) + max) - ((getWidth() - i18) / 2);
            int itemCount2 = (((i18 * getItemCount()) + ((getItemCount() - 1) * f17)) + (max * 2)) - getWidth();
            if (width2 > itemCount2) {
                width2 = itemCount2;
            }
            this.f455254i = width2 >= 0 ? width2 : 0;
            this.f455255m = -1;
        }
        m(recycler, max, f17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 h3Var) {
        kotlin.jvm.internal.o.g(recycler, "recycler");
        int width = getWidth();
        int i18 = this.f455251f;
        int itemCount = getItemCount();
        int i19 = this.f455249d;
        int f17 = getItemCount() > 1 ? e06.p.f(((width - (i18 * 2)) - (itemCount * i19)) / (getItemCount() - 1), this.f455252g, this.f455253h) : 0;
        int max = java.lang.Math.max(i18, ((getWidth() - (getItemCount() * i19)) - ((getItemCount() - 1) * f17)) / 2);
        int itemCount2 = (i19 * getItemCount()) + ((getItemCount() - 1) * f17) + (max * 2);
        int i27 = this.f455254i + i17;
        int width2 = itemCount2 - getWidth();
        if (i27 > width2) {
            i27 = width2;
        }
        int i28 = i27 >= 0 ? i27 : 0;
        int i29 = i28 - this.f455254i;
        this.f455254i = i28;
        m(recycler, max, f17);
        return i29;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        this.f455255m = i17;
        requestLayout();
    }
}
