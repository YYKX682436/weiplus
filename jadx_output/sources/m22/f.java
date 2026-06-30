package m22;

/* loaded from: classes12.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final m22.y f323044d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323045e;

    public f(m22.y itemClickListener) {
        kotlin.jvm.internal.o.g(itemClickListener, "itemClickListener");
        this.f323044d = itemClickListener;
        this.f323045e = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f323045e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        m22.g holder = (m22.g) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f323045e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.i((m22.i) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new m22.o(parent, this.f323044d);
    }
}
