package vg2;

/* loaded from: classes3.dex */
public final class h0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f436515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.j0 f436516e;

    public h0(vg2.j0 j0Var, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f436516e = j0Var;
        this.f436515d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f436516e.f436528p).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        vg2.f0 holder = (vg2.f0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        vg2.j0 j0Var = this.f436516e;
        km2.q qVar = (km2.q) ((java.util.ArrayList) j0Var.f436528p).get(i17);
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(qVar.f309171b, null, 2, null), holder.f436506d, g1Var.h(mn2.f1.f329957h));
        holder.f436507e.setText(qVar.f309173d);
        km2.q qVar2 = j0Var.f436529q;
        holder.f436508f.setVisibility(kotlin.jvm.internal.o.b(qVar2 != null ? qVar2.f309172c : null, qVar.f309172c) ? 0 : 8);
        holder.itemView.setOnClickListener(new vg2.g0(j0Var, qVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f436515d).inflate(com.tencent.mm.R.layout.div, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new vg2.f0(this, inflate);
    }
}
