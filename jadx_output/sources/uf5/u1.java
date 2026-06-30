package uf5;

/* loaded from: classes3.dex */
public final class u1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f427305d;

    /* renamed from: e, reason: collision with root package name */
    public final int f427306e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f427307f;

    public u1(java.util.List selectedForBatch, int i17, yz5.p onLongClick) {
        kotlin.jvm.internal.o.g(selectedForBatch, "selectedForBatch");
        kotlin.jvm.internal.o.g(onLongClick, "onLongClick");
        this.f427305d = selectedForBatch;
        this.f427306e = i17;
        this.f427307f = onLongClick;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return java.lang.Math.min(this.f427305d.size(), this.f427306e);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        uf5.s1 holder = (uf5.s1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f427305d;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(holder.f427297d, (java.lang.String) list.get(java.lang.Math.max(0, list.size() - this.f427306e) + i17), null);
        holder.itemView.setOnLongClickListener(new uf5.t1(this, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        int dimensionPixelSize = parent.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
        int dimensionPixelSize2 = parent.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMarginStart(dimensionPixelSize2);
        imageView.setLayoutParams(layoutParams);
        return new uf5.s1(imageView);
    }
}
