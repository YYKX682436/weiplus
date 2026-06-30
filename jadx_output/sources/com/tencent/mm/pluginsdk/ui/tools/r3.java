package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes10.dex */
public abstract class r3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f191861d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f191862e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.f2 f191863f;

    public r3(android.util.SparseArray headerViews, android.util.SparseArray footerViews, androidx.recyclerview.widget.f2 innerAdapter) {
        kotlin.jvm.internal.o.g(headerViews, "headerViews");
        kotlin.jvm.internal.o.g(footerViews, "footerViews");
        kotlin.jvm.internal.o.g(innerAdapter, "innerAdapter");
        this.f191861d = headerViews;
        this.f191862e = footerViews;
        this.f191863f = innerAdapter;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return y() + this.f191862e.size() + this.f191863f.getItemCount();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 < y()) {
            return this.f191861d.keyAt(i17);
        }
        boolean z17 = z(i17);
        androidx.recyclerview.widget.f2 f2Var = this.f191863f;
        if (z17) {
            return this.f191862e.keyAt((i17 - y()) - f2Var.getItemCount());
        }
        return f2Var.getItemViewType(i17 - y());
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f191863f.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        x(holder, i17, payloads);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.util.SparseArray sparseArray = this.f191861d;
        if (sparseArray.get(i17) != null) {
            java.lang.Object obj = sparseArray.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            return new com.tencent.mm.pluginsdk.ui.tools.q3((android.view.View) obj);
        }
        android.util.SparseArray sparseArray2 = this.f191862e;
        if (sparseArray2.get(i17) != null) {
            java.lang.Object obj2 = sparseArray2.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            return new com.tencent.mm.pluginsdk.ui.tools.q3((android.view.View) obj2);
        }
        androidx.recyclerview.widget.k3 onCreateViewHolder = this.f191863f.onCreateViewHolder(parent, i17);
        kotlin.jvm.internal.o.d(onCreateViewHolder);
        return onCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f191863f.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof com.tencent.mm.pluginsdk.ui.tools.q3) {
            return;
        }
        this.f191863f.onViewAttachedToWindow(holder);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof com.tencent.mm.pluginsdk.ui.tools.q3) {
            return;
        }
        this.f191863f.onViewDetachedFromWindow(holder);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof com.tencent.mm.pluginsdk.ui.tools.q3) {
            return;
        }
        this.f191863f.onViewRecycled(holder);
    }

    public final void x(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        if ((i17 < y()) || z(i17)) {
            return;
        }
        k3Var.itemView.setTag(com.tencent.mm.R.id.gyi, new java.lang.ref.WeakReference(this));
        this.f191863f.onBindViewHolder(k3Var, i17 - y(), list);
    }

    public final int y() {
        return this.f191861d.size();
    }

    public final boolean z(int i17) {
        return i17 >= y() + this.f191863f.getItemCount();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        x(holder, i17, new java.util.ArrayList());
    }
}
