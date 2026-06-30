package qf4;

/* loaded from: classes4.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362691d = "loadingMore";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362692e = "favorite";

    /* renamed from: f, reason: collision with root package name */
    public final int f362693f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f362694g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f362695h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int f362696i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f362697m;

    /* renamed from: n, reason: collision with root package name */
    public int f362698n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f362699o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f362700p;

    public f() {
        new java.util.ArrayList();
        df4.a aVar = df4.b.f232038a;
        this.f362696i = new java.util.GregorianCalendar().get(1);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f362695h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.ArrayList arrayList = this.f362695h;
        if (com.tencent.mm.sdk.platformtools.t8.D0(((qf4.h) arrayList.get(i17)).f362701a, this.f362691d)) {
            return this.f362693f;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(((qf4.h) arrayList.get(i17)).f362701a, this.f362692e)) {
            return this.f362694g;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        qf4.e holder = (qf4.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.i(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        androidx.recyclerview.widget.k3 dVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == this.f362693f) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489541cw3, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            dVar = new qf4.c(this, inflate);
        } else if (i17 == this.f362694g) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489539cw1, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            dVar = new qf4.b(this, inflate2);
        } else {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489540cw2, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            dVar = new qf4.d(this, inflate3);
        }
        if (dVar instanceof qf4.d) {
            ((qf4.d) dVar).f362687f.N(new qf4.g());
        }
        return dVar;
    }
}
