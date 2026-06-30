package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class u implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f122221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.d0 f122222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f122223f;

    public u(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.nearby.video.d0 d0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f122221d = arrayList;
        this.f122222e = d0Var;
        this.f122223f = recyclerView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        boolean z17;
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        java.util.ArrayList arrayList = this.f122221d;
        java.lang.Object obj = arrayList.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        so2.j5 j5Var2 = (so2.j5) kz5.n0.a0(arrayList, i18);
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var2 = this.f122222e;
        d0Var2.f122180i = i18;
        boolean z18 = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
        if (baseFinderFeed != null) {
            java.util.ArrayList arrayList2 = this.f122221d;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f122223f;
            if (baseFinderFeed.getFeedObject().isLiveFeed()) {
                cp2.u1 u1Var = d0Var2.f122181m;
                java.lang.String string = d0Var2.a().getString(1);
                java.lang.String str = string == null ? "" : string;
                java.lang.String string2 = d0Var2.a().getString(2);
                z17 = z18;
                cp2.u1.d(u1Var, j5Var, i17, i18, view, arrayList2, str, string2 == null ? "" : string2, recyclerView, 0L, 256, null);
                d0Var = d0Var2;
            } else {
                z17 = z18;
                intent.putExtra("feed_object_id", baseFinderFeed.getItemId());
                intent.putExtra("feed_object_nonceId", baseFinderFeed.getFeedObject().getObjectNonceId());
                intent.putExtra("tab_type", 10);
                intent.putExtra("key_reuqest_scene", 17);
                intent.putExtra("key_comment_scene", 16);
                intent.putExtra("key_from_comment_scene", 15);
                wa2.u uVar = wa2.u.f444181d;
                androidx.recyclerview.widget.RecyclerView recyclerView2 = d0Var2.getRecyclerView();
                long itemId = baseFinderFeed.getItemId();
                d0Var = d0Var2;
                com.tencent.mm.plugin.finder.nearby.video.a aVar = d0Var.f122177f;
                kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter");
                wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(uVar, recyclerView2, itemId, ((com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter) aVar).getFeedLoader().getDataListJustForAdapter(), null, 8, null), 14, null);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).tk(d0Var.f122175d, intent, ac1.g.CTRL_INDEX, false);
            }
        } else {
            z17 = z18;
            d0Var = d0Var2;
        }
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment fragment = d0Var.f122176e;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            long itemId2 = j5Var.getItemId();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
            com.tencent.mm.plugin.finder.report.o3.wj(o3Var, V6, itemId2, baseFinderFeed2 != null ? baseFinderFeed2.w() : null, d0Var.g().getRecyclerView(), 0, null, 0L, null, 240, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
        }
    }
}
