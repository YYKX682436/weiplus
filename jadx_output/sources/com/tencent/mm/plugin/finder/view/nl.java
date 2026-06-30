package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class nl extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f132720d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f132721e = kz5.p0.f313996d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.sr f132722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.pl f132723g;

    public nl(com.tencent.mm.plugin.finder.view.pl plVar) {
        this.f132723g = plVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f132721e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.view.tr trVar;
        com.tencent.mm.plugin.finder.view.ll holder = (com.tencent.mm.plugin.finder.view.ll) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f132721e;
        if (list != null) {
            if (!(i17 < list.size())) {
                list = null;
            }
            if (list == null || (trVar = (com.tencent.mm.plugin.finder.view.tr) list.get(i17)) == null) {
                return;
            }
            holder.f132607e.setVisibility(trVar.f133150c ? 0 : 8);
            holder.f132606d.setText(trVar.f133149b);
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.view.ml(i17, this, trVar, this.f132723g));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e7f, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.view.ll(this, inflate);
    }
}
