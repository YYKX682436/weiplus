package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class id extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f132300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.kd f132301e;

    public id(com.tencent.mm.plugin.finder.view.kd kdVar, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f132301e = kdVar;
        this.f132300d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f132301e.f132496r).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.view.fd holder = (com.tencent.mm.plugin.finder.view.fd) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.kd kdVar = this.f132301e;
        com.tencent.mm.plugin.finder.view.dd ddVar = (com.tencent.mm.plugin.finder.view.dd) ((java.util.ArrayList) kdVar.f132496r).get(i17);
        cm2.k0 k0Var = new cm2.k0(ddVar.f131889a);
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = holder.f132102d;
        finderLiveShoppingCouponView.c(k0Var, false, false);
        finderLiveShoppingCouponView.setVisibility(0);
        finderLiveShoppingCouponView.setCallback(new com.tencent.mm.plugin.finder.view.hd(kdVar, this, ddVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f132300d).inflate(com.tencent.mm.R.layout.f488947df0, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.view.fd(this, inflate);
    }
}
