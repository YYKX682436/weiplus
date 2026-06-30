package vl1;

/* loaded from: classes11.dex */
public class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: o, reason: collision with root package name */
    public static final android.view.ViewGroup.LayoutParams f437793o = new android.view.ViewGroup.LayoutParams(-1, -2);

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f437794d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f437795e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f437796f;

    /* renamed from: i, reason: collision with root package name */
    public vl1.p f437799i;

    /* renamed from: m, reason: collision with root package name */
    public vl1.q f437800m;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f437797g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f437798h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.h2 f437801n = new vl1.a(this);

    @Override // androidx.recyclerview.widget.f2
    public final int getItemCount() {
        androidx.recyclerview.widget.f2 f2Var = this.f437794d;
        int itemCount = f2Var == null ? 0 : f2Var.getItemCount();
        if (!this.f437797g.isEmpty()) {
            itemCount++;
        }
        return !this.f437798h.isEmpty() ? itemCount + 1 : itemCount;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return getItemViewType(i17) == Integer.MAX_VALUE ? -1782095970 : getItemViewType(i17) == 2147483646 ? 1955920812 : !this.f437794d.hasStableIds() ? i17 : this.f437794d.getItemId(i17 - (!this.f437797g.isEmpty() ? 1 : 0));
    }

    @Override // androidx.recyclerview.widget.f2
    public final int getItemViewType(int i17) {
        java.util.List list = this.f437797g;
        if (!list.isEmpty() && i17 == 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f437798h.isEmpty() || i17 != getItemCount() - 1) {
            return this.f437794d.getItemViewType(i17 - (!list.isEmpty() ? 1 : 0));
        }
        return 2147483646;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list = this.f437797g;
        if (!list.isEmpty() && i17 == 0) {
            y(k3Var);
            return;
        }
        if (!this.f437798h.isEmpty() && i17 == getItemCount() - 1) {
            y(k3Var);
            return;
        }
        int i18 = i17 - (!list.isEmpty() ? 1 : 0);
        this.f437794d.onBindViewHolder(k3Var, i18);
        if (this.f437799i != null) {
            k3Var.itemView.setOnClickListener(new vl1.b(this, k3Var, i18));
        }
        if (this.f437800m != null) {
            k3Var.itemView.setOnLongClickListener(new vl1.c(this, k3Var, i18));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = f437793o;
        if (i17 != 2147483646) {
            if (i17 != Integer.MAX_VALUE) {
                return this.f437794d.onCreateViewHolder(viewGroup, i17);
            }
            android.view.ViewGroup viewGroup2 = this.f437796f;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cxf, viewGroup, false);
            this.f437796f = viewGroup3;
            java.util.Iterator it = this.f437797g.iterator();
            while (it.hasNext()) {
                viewGroup3.addView((android.view.View) it.next(), layoutParams);
            }
            return new vl1.f(viewGroup3);
        }
        android.view.ViewGroup viewGroup4 = this.f437795e;
        if (viewGroup4 != null) {
            viewGroup4.removeAllViews();
        }
        android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cxf, viewGroup, false);
        this.f437795e = viewGroup5;
        for (android.view.View view : this.f437798h) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup5.addView(view, layoutParams);
        }
        return new vl1.f(viewGroup5);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        super.onViewAttachedToWindow(k3Var);
        if (k3Var.getItemViewType() == Integer.MAX_VALUE || k3Var.getItemViewType() == 2147483646) {
            return;
        }
        this.f437794d.onViewAttachedToWindow(k3Var);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        super.onViewDetachedFromWindow(k3Var);
        if (k3Var.getItemViewType() == Integer.MAX_VALUE || k3Var.getItemViewType() == 2147483646) {
            return;
        }
        this.f437794d.onViewDetachedFromWindow(k3Var);
    }

    public int x() {
        return ((java.util.LinkedList) this.f437798h).size();
    }

    public final void y(androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var.itemView.getLayoutParams() instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) k3Var.itemView.getLayoutParams();
            layoutParams.f11941i = true;
            k3Var.itemView.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        java.util.List list2 = this.f437797g;
        if (!list2.isEmpty() && i17 == 0) {
            y(k3Var);
            return;
        }
        if (!this.f437798h.isEmpty() && i17 == getItemCount() - 1) {
            y(k3Var);
            return;
        }
        int i18 = i17 - (!list2.isEmpty() ? 1 : 0);
        this.f437794d.onBindViewHolder(k3Var, i18, list);
        if (this.f437799i != null) {
            k3Var.itemView.setOnClickListener(new vl1.d(this, k3Var, i18));
        }
        if (this.f437800m != null) {
            k3Var.itemView.setOnLongClickListener(new vl1.e(this, k3Var, i18));
        }
    }
}
