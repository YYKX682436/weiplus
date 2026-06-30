package uf5;

/* loaded from: classes8.dex */
public final class h extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f427233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f427234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf5.k f427235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f427236g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f427237h;

    public h(java.util.ArrayList arrayList, java.util.HashSet hashSet, uf5.k kVar, android.widget.ImageView imageView, android.widget.Button button) {
        this.f427233d = arrayList;
        this.f427234e = hashSet;
        this.f427235f = kVar;
        this.f427236g = imageView;
        this.f427237h = button;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f427233d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String str = (java.lang.String) this.f427233d.get(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.u1a);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.u1_);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.u1b);
        l02.n.a(imageView, this.f427234e.contains(str) ? "checkbox_cell_on" : "checkbox_cell_off");
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str, null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            textView.setText(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(n17));
        } else {
            textView.setText(str);
        }
        holder.itemView.setOnClickListener(new uf5.f(holder, this.f427233d, this.f427234e, this, this.f427235f, this.f427236g, this.f427237h));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new uf5.g(android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dz7, parent, false));
    }
}
