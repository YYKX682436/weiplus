package nc5;

/* loaded from: classes.dex */
public final class r extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f336228d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f336229e;

    public r(java.util.ArrayList sugList, yz5.l callback) {
        kotlin.jvm.internal.o.g(sugList, "sugList");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f336228d = sugList;
        this.f336229e = callback;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f336228d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nc5.p holder = (nc5.p) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f336228d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.f336225d.setText((java.lang.CharSequence) ((android.util.Pair) obj).first);
        holder.itemView.setOnClickListener(new nc5.q(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bme, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new nc5.p(inflate);
    }
}
