package fl1;

/* loaded from: classes7.dex */
public final class r1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f263851d;

    /* renamed from: e, reason: collision with root package name */
    public fl1.i1 f263852e;

    /* renamed from: f, reason: collision with root package name */
    public fl1.j1 f263853f;

    public r1(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f263851d = items;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f263851d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        fl1.h1 h1Var = (fl1.h1) this.f263851d.get(i17);
        if (h1Var != null) {
            return h1Var.f263779a;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        fl1.p1 holder = (fl1.p1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        fl1.h1 h1Var = (fl1.h1) this.f263851d.get(i17);
        if (h1Var != null) {
            fl1.q1 q1Var = new fl1.q1(this);
            holder.i(h1Var);
            holder.j(h1Var.f263784f, h1Var);
            fl1.n1 n1Var = new fl1.n1(h1Var, holder, q1Var, i17);
            android.view.View view = holder.f263842d;
            view.setOnClickListener(n1Var);
            view.setOnLongClickListener(new fl1.o1(holder, h1Var, i17));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        java.util.List list = this.f263851d;
        return i17 == 1 ? new fl1.k1(parent, list, this) : new fl1.m1(parent, list, this);
    }
}
