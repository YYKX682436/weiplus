package ju0;

/* loaded from: classes4.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f301682d;

    public d(java.util.List imagePaths) {
        kotlin.jvm.internal.o.g(imagePaths, "imagePaths");
        this.f301682d = imagePaths;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f301682d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ju0.c holder = (ju0.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String str = (java.lang.String) this.f301682d.get(i17);
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ya2.l.f460502a.h(str, holder.f301681d, mn2.f1.B);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ehi, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ju0.c(this, inflate);
    }
}
