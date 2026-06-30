package qw2;

/* loaded from: classes10.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f367121d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f367122e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f367123f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f367124g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f367125h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f367126i;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f367121d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return kotlin.jvm.internal.o.b((t85.d) kz5.n0.a0(this.f367121d, i17), qw2.g.f367127a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        qw2.c holder = (qw2.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        t85.d dVar = (t85.d) kz5.n0.a0(this.f367121d, i17);
        kotlin.jvm.internal.o.d(dVar);
        holder.i(i17, dVar.f416456a);
        yz5.l lVar = this.f367126i;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.agb, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new qw2.d(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aga, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new qw2.e(this, inflate2);
    }
}
