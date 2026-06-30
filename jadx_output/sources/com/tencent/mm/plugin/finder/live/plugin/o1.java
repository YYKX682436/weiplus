package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o1 extends com.tencent.mm.plugin.finder.live.plugin.m1 {

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f113692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, java.util.ArrayList list) {
        super(list);
        kotlin.jvm.internal.o.g(list, "list");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f113692e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.plugin.p1 holder = (com.tencent.mm.plugin.finder.live.plugin.p1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f113452d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.finder.live.plugin.l1 l1Var = (com.tencent.mm.plugin.finder.live.plugin.l1) obj;
        holder.f113814g.setVisibility(8);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.n1(this));
        boolean z17 = l1Var.f113337e.length() > 0;
        android.widget.TextView textView = holder.f113813f;
        if (z17) {
            textView.setVisibility(0);
            textView.setText(l1Var.f113337e);
        } else {
            textView.setVisibility(8);
        }
        holder.f113811d.setText(l1Var.f113335c);
        holder.f113812e.setText(l1Var.f113338f);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.dnt, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.p1(inflate);
    }
}
