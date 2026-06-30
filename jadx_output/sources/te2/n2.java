package te2;

/* loaded from: classes14.dex */
public final class n2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418247d;

    public n2(te2.a3 a3Var) {
        this.f418247d = a3Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        gk2.e eVar;
        java.util.ArrayList arrayList;
        te2.b2 b2Var = this.f418247d.f417859g;
        if (b2Var == null || (eVar = ((te2.l2) b2Var).f418191d) == null || (arrayList = ((je2.i) eVar.a(je2.i.class)).f299236g) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        x91.c cVar;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        te2.o2 holder = (te2.o2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        te2.a3 a3Var = this.f418247d;
        te2.b2 b2Var = a3Var.f417859g;
        te2.p2 p2Var = (b2Var == null || (eVar = ((te2.l2) b2Var).f418191d) == null || (arrayList = ((je2.i) eVar.a(je2.i.class)).f299236g) == null) ? null : (te2.p2) kz5.n0.a0(arrayList, i17);
        if (p2Var != null) {
            x91.h hVar = p2Var.f418299a;
            holder.f418274d.setText((hVar == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452639g);
            x91.h hVar2 = p2Var.f418299a;
            x91.j jVar = hVar2 != null ? hVar2.f452651e.f452663a : null;
            x91.j jVar2 = x91.j.Transitioning;
            android.widget.ProgressBar progressBar = holder.f418275e;
            if (jVar == jVar2) {
                progressBar.setVisibility(0);
            } else {
                progressBar.setVisibility(8);
            }
            holder.itemView.setOnClickListener(new te2.m2(a3Var, p2Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        android.view.View inflate = android.view.View.inflate(p07.getContext(), com.tencent.mm.R.layout.f488872ap3, null);
        inflate.setBackground(p07.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a1f));
        return new te2.o2(this.f418247d, inflate);
    }
}
