package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f120410d;

    /* renamed from: e, reason: collision with root package name */
    public final int f120411e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f120412f;

    public y4(java.util.List items, int i17, yz5.l onClick) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f120410d = items;
        this.f120411e = i17;
        this.f120412f = onClick;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f120410d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.z4 holder = (com.tencent.mm.plugin.finder.live.widget.z4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.nz6 nz6Var = (r45.nz6) this.f120410d.get(i17);
        java.lang.String str = nz6Var.f381783i;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = holder.f120522d;
        textView.setText(str);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof android.widget.RelativeLayout.LayoutParams)) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
        }
        holder.f120523e.setVisibility(nz6Var.f381778d == this.f120411e ? 0 : 8);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.x4(nz6Var, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b0c, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.z4(inflate);
    }
}
