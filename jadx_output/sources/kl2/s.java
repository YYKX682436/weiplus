package kl2;

/* loaded from: classes3.dex */
public final class s extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f308812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl2.v f308813e;

    public s(kl2.v vVar, java.util.List itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f308813e = vVar;
        this.f308812d = itemList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f308812d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        kl2.u holder = (kl2.u) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.f308816d.setOnClickListener(new kl2.r(this.f308813e, i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("￥");
        java.util.List list = this.f308812d;
        sb6.append(((kl2.t) list.get(i17)).f308814a);
        holder.f308817e.setText(sb6.toString());
        holder.f308818f.setVisibility(((kl2.t) list.get(i17)).f308815b ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ayg, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new kl2.u(inflate);
    }
}
