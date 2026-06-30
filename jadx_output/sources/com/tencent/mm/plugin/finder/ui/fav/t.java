package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class t implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.x f129204d;

    public t(com.tencent.mm.plugin.finder.ui.fav.x xVar) {
        this.f129204d = xVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        boolean z17;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar;
        android.content.Context context;
        boolean z18;
        q40.h hVar;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129204d;
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment fragment = xVar.f129218b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        java.lang.Object obj = holder.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        if (xVar.h(V6, view, i17, (so2.j5) obj)) {
            return;
        }
        java.lang.Object obj2 = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
        if (baseFinderFeed == null) {
            return;
        }
        com.tencent.mm.plugin.finder.ui.fav.a aVar = xVar.f129219c;
        boolean g17 = aVar.g();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.app.Activity context2 = xVar.f129217a;
        if (!g17) {
            if (V6 != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                z17 = true;
                com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, baseFinderFeed.getItemId(), baseFinderFeed.w(), xVar.d(), 0, null, 0L, null, 240, null);
            } else {
                z17 = true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_COLLECTION", z17);
            com.tencent.mm.plugin.finder.ui.fav.p pVar = aVar instanceof com.tencent.mm.plugin.finder.ui.fav.p ? (com.tencent.mm.plugin.finder.ui.fav.p) aVar : null;
            if (pVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(pVar.c());
                iyVar = iyVar2;
                pVar.f129196g.b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList, pVar.z().getLastBuffer(), i17, null, null, 16, null), intent);
            } else {
                iyVar = iyVar2;
            }
            iyVar.c(context2, intent);
            wa2.x.e(intent, view, 0L, false, false, null, 30, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fj(context2, intent, 10001);
            return;
        }
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.fd fdVar = (com.tencent.mm.plugin.finder.viewmodel.component.fd) a17;
        if (fdVar.f134393d) {
            boolean z19 = !fdVar.O6(baseFinderFeed.getItemId());
            fdVar.f134394e.put(java.lang.Long.valueOf(baseFinderFeed.getItemId()), java.lang.Boolean.valueOf(z19));
            ((com.tencent.mm.plugin.finder.ui.fav.w) xVar.f129228l).C(holder, baseFinderFeed, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19));
            androidx.recyclerview.widget.f2 adapter2 = xVar.d().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(i17);
                return;
            }
            return;
        }
        boolean z27 = aVar instanceof com.tencent.mm.plugin.finder.ui.fav.g;
        com.tencent.mm.plugin.finder.ui.fav.g gVar = z27 ? (com.tencent.mm.plugin.finder.ui.fav.g) aVar : null;
        if ((gVar == null || (hVar = gVar.f129167g) == null) ? false : hVar.M(i17)) {
            return;
        }
        if (V6 != null) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            context = context2;
            z18 = true;
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c18, V6, baseFinderFeed.getItemId(), baseFinderFeed.w(), xVar.d(), 0, null, 0L, null, 240, null);
        } else {
            context = context2;
            z18 = true;
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 34, 189, intent2);
        java.util.ArrayList c19 = aVar.c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(c19, 10));
        java.util.Iterator it = c19.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((so2.j5) it.next()).getItemId()));
        }
        long[] T0 = kz5.n0.T0(arrayList2);
        iyVar2.c(context, intent2);
        intent2.putExtra("KEY_FEED_ID_LIST", T0);
        intent2.putExtra("KEY_CENTER_FEED_ID", baseFinderFeed.getItemId());
        intent2.putExtra("KEY_CENTER_FEED_POS", i17);
        com.tencent.mm.plugin.finder.ui.fav.g gVar2 = z27 ? (com.tencent.mm.plugin.finder.ui.fav.g) aVar : null;
        intent2.putExtra("KEY_HAS_MORE", gVar2 != null ? java.lang.Boolean.valueOf(gVar2.f129168h) : null);
        intent2.putExtra("KEY_IS_GLOBAL_FAV", z18);
        wa2.x.e(intent2, view, 0L, false, false, null, 30, null);
        android.app.Activity activity = xVar.f129217a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(z18 ? 1 : 0));
        arrayList3.add(intent2);
        java.util.Collections.reverse(arrayList3);
        yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback$initCenter$4", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
