package zx;

/* loaded from: classes14.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f476965d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f476966e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f476967f;

    /* renamed from: g, reason: collision with root package name */
    public zx.p f476968g;

    public t(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f476965d = items;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f476965d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return ((zx.u) this.f476965d.get(i17)).f476972d.b().hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        zx.r holder = (zx.r) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        zx.u uVar = (zx.u) this.f476965d.get(i17);
        boolean equals = android.text.TextUtils.equals(this.f476966e, uVar.f476972d.b());
        boolean z17 = !equals && android.text.TextUtils.equals(this.f476967f, uVar.f476972d.b());
        zx.s sVar = new zx.s(this, uVar, equals, holder);
        android.view.View view = holder.f476960d;
        view.setOnLongClickListener(sVar);
        zx.i.a(uVar, equals, z17, view);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488245e06, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new zx.r(inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void setHasStableIds(boolean z17) {
        super.setHasStableIds(true);
    }

    public final int x(java.lang.String traceId) {
        kotlin.jvm.internal.o.g(traceId, "traceId");
        java.util.Iterator it = this.f476965d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (android.text.TextUtils.equals(((zx.u) it.next()).f476972d.b(), traceId)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }
}
