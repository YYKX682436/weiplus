package pf4;

/* loaded from: classes4.dex */
public final class q extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f353884d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public nf4.j f353885e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f353886f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f353887g;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353884d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((gf4.a) this.f353884d.get(i17)).f271336g ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        pf4.l holder = (pf4.l) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f353884d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.j(i17, (gf4.a) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cwb, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new pf4.m(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cwa, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new pf4.p(this, inflate2);
    }

    public final void x(java.util.List storyComments) {
        kotlin.jvm.internal.o.g(storyComments, "storyComments");
        java.util.ArrayList arrayList = this.f353884d;
        arrayList.clear();
        arrayList.addAll(storyComments);
    }
}
