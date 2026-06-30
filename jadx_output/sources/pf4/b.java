package pf4;

/* loaded from: classes3.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f353845d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f353846e = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353846e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        pf4.a holder = (pf4.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = i17 == this.f353845d;
        android.view.View view = holder.f353835d;
        view.setSelected(z17);
        boolean f17 = bf4.f.f19715b.f();
        java.util.ArrayList arrayList = this.f353846e;
        if (f17) {
            view.setActivated(((if4.f) arrayList.get(i17)).f291243a.w0());
        } else {
            view.setActivated(((if4.f) arrayList.get(i17)).f291248f.f291236d);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489546cx2, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new pf4.a(this, inflate);
    }
}
