package ks2;

/* loaded from: classes8.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f311598d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ks2.j f311599e;

    public b(ks2.j jVar) {
        this.f311599e = jVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f311598d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ks2.h holder = (ks2.h) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f311598d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.dq4 dq4Var = (r45.dq4) obj;
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.obc);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) holder.itemView.findViewById(com.tencent.mm.R.id.jr_);
        textView.setText(dq4Var.getString(0));
        com.tencent.mm.ui.fk.a(textView);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(holder.itemView.getContext()));
        ks2.e eVar = new ks2.e(this.f311599e);
        recyclerView.setAdapter(eVar);
        eVar.f311604d.addAll(dq4Var.getList(1));
        eVar.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dh6, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ks2.h(this.f311599e, inflate);
    }
}
