package z22;

/* loaded from: classes10.dex */
public final class l extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f469726d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f469727e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f469726d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        t85.d x17 = x(i17);
        r45.p64 p64Var = x17 != null ? x17.f416456a : null;
        u22.l lVar = u22.r.f424006p;
        if (kotlin.jvm.internal.o.b(p64Var, u22.r.f424007q)) {
            return 1;
        }
        return kotlin.jvm.internal.o.b(p64Var, u22.r.f424009s) ? true : kotlin.jvm.internal.o.b(p64Var, u22.r.f424008r) ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        z22.h holder = (z22.h) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        t85.d x17 = x(i17);
        if (x17 != null) {
            holder.i(i17, x17.f416456a);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488728a64, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new z22.i(this, inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488727a63, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new z22.k(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488730a66, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new z22.j(this, inflate3);
    }

    public final t85.d x(int i17) {
        return (t85.d) kz5.n0.a0(this.f469726d, i17);
    }
}
