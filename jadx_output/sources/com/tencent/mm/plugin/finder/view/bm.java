package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class bm extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.dm f131728g;

    public bm(com.tencent.mm.plugin.finder.view.dm dmVar) {
        this.f131728g = dmVar;
    }

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.b_4, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // eb5.d, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        eb5.e holder = (eb5.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onBindViewHolder(holder, i17);
        r45.mb4 mb4Var = (r45.mb4) x(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.lih);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.agk);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(holder.f293121e.getResources().getDisplayMetrics().widthPixels, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.finder.view.dm dmVar = this.f131728g;
        imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, dmVar.f131904p.getHeight() < 0 ? -1 : dmVar.f131904p.getHeight()));
        imageView.post(new com.tencent.mm.plugin.finder.view.zl(mb4Var, imageView));
        imageView2.post(new com.tencent.mm.plugin.finder.view.am(mb4Var, imageView2));
    }
}
