package z22;

/* loaded from: classes10.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f469717d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f469718e = -1;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f469719f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f469720g;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f469717d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        t85.d dVar = (t85.d) kz5.n0.a0(this.f469717d, i17);
        r45.p64 p64Var = dVar != null ? dVar.f416456a : null;
        if (kotlin.jvm.internal.o.b(p64Var, u22.r.f424010t) ? true : kotlin.jvm.internal.o.b(p64Var, u22.r.f424012v)) {
            return 1;
        }
        return kotlin.jvm.internal.o.b(p64Var, u22.r.f424011u) ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        z22.a holder = (z22.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        t85.d dVar = (t85.d) kz5.n0.a0(this.f469717d, i17);
        if (dVar != null) {
            holder.i(i17, dVar.f416456a);
        }
        holder.itemView.setSelected(i17 == this.f469718e);
        yz5.l lVar = this.f469720g;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a67, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new z22.e(this, inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a6_, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new z22.d(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488729a65, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new z22.b(this, inflate3);
    }
}
