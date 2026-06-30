package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123998e;

    public n3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, int i17) {
        this.f123997d = f4Var;
        this.f123998e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123997d;
        yz5.l lVar = f4Var.f123702z;
        int intValue = lVar != null ? ((java.lang.Number) lVar.invoke(java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) f4Var.f123696t).getValue()).longValue()))).intValue() : f4Var.f123694r;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = f4Var.Z6().getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        int i17 = this.f123998e;
        if (gridLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager2 = gridLayoutManager;
            yj0.a.d(gridLayoutManager2, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            gridLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(gridLayoutManager2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = f4Var.Z6().getLayoutManager();
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager2 : null;
        if (staggeredGridLayoutManager != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(staggeredGridLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
