package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes10.dex */
public final class h implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.l f129017d;

    public h(com.tencent.mm.plugin.finder.ui.conv.l lVar) {
        this.f129017d = lVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return;
        }
        com.tencent.mm.plugin.finder.ui.conv.l lVar = this.f129017d;
        android.content.Intent intent = new android.content.Intent(lVar.f129022a, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25.class);
        java.util.ArrayList arrayList = lVar.f129024c.f129012d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((in5.c) it.next()).getItemId()));
        }
        long[] T0 = kz5.n0.T0(arrayList2);
        com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment fragment = lVar.f129023b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, baseFinderFeed.getItemId(), baseFinderFeed.w(), lVar.b(), 0, null, 0L, null, 240, null);
        }
        intent.putExtra("KEY_FEED_ID_LIST", T0);
        intent.putExtra("KEY_CENTER_FEED_ID", baseFinderFeed.getItemId());
        intent.putExtra("KEY_CENTER_FEED_POS", i17);
        intent.putExtra("KEY_COMMENT_SCENE", nd1.d1.CTRL_INDEX);
        intent.putExtra("KEY_HAS_MORE", false);
        wa2.x.e(intent, view, 0L, false, false, null, 30, null);
        android.app.Activity activity = lVar.f129022a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
