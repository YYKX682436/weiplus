package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class r0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public r45.fa2 f116622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116623e;

    public r0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView) {
        this.f116623e = finderLiveAfterPluginRecommendLiveView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList;
        r45.fa2 fa2Var = this.f116622d;
        if (fa2Var == null || (linkedList = fa2Var.f374129h) == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.LinkedList linkedList;
        r45.ea2 ea2Var;
        com.tencent.mm.plugin.finder.live.view.q0 holder = (com.tencent.mm.plugin.finder.live.view.q0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.view.r0 r0Var = holder.f116595d;
        r45.fa2 fa2Var = r0Var.f116622d;
        if (fa2Var != null && (linkedList = fa2Var.f374129h) != null && (ea2Var = (r45.ea2) kz5.n0.a0(linkedList, i17)) != null) {
            android.view.View view = holder.itemView;
            com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = view instanceof com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView ? (com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView) view : null;
            if (simpleLivingCardView != null) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
                int i18 = com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView.f116134g;
                simpleLivingCardView.c(finderObject, i17, 1.7776f);
            }
            android.view.View view2 = holder.itemView;
            com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView2 = view2 instanceof com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView ? (com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView) view2 : null;
            if (simpleLivingCardView2 != null) {
                in5.o.c(simpleLivingCardView2, new com.tencent.mm.plugin.finder.live.view.p0(ea2Var, r0Var.f116623e));
            }
        }
        dq4.c cVar = dq4.c.f242369a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        cVar.f(itemView);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = new com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView(context, null);
        simpleLivingCardView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.a(parent.getContext(), 162.0f), i65.a.a(parent.getContext(), 288.0f)));
        simpleLivingCardView.setReportObj(this.f116623e.getReportObj());
        return new com.tencent.mm.plugin.finder.live.view.q0(this, simpleLivingCardView);
    }
}
