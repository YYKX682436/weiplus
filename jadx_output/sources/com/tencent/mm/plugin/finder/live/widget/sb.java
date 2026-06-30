package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sb extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f119746d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f119747e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f119748f;

    public sb(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f119746d = context;
        this.f119747e = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f119747e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.rb holder = (com.tencent.mm.plugin.finder.live.widget.rb) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.v1 item = (com.tencent.mm.plugin.finder.live.widget.v1) ((java.util.ArrayList) this.f119747e).get(i17);
        kotlin.jvm.internal.o.g(item, "item");
        holder.f119615e.setText(item.f120021b);
        int i18 = item.f120023d;
        com.tencent.mm.plugin.finder.live.widget.sb sbVar = holder.f119618h;
        holder.f119616f.setText(i18 == 0 ? sbVar.f119746d.getString(com.tencent.mm.R.string.f493466oo5) : sbVar.f119746d.getString(com.tencent.mm.R.string.oo6));
        int i19 = item.f120024e ? 0 : 8;
        android.widget.TextView textView = holder.f119617g;
        textView.setVisibility(i19);
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.qb(sbVar, item));
        mn2.y.a(holder.f119614d, item.f120022c, true);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e9k, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.rb(this, inflate);
    }
}
