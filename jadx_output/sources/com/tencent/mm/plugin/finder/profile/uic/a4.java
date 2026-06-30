package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123525d;

    public a4(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        this.f123525d = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123525d;
        int dimension = (int) f4Var.Z6().getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479649bo);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = f4Var.Z6().getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int i17 = f4Var.f123694r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(dimension));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            gridLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(gridLayoutManager, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = f4Var.Z6().getLayoutManager();
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager2 : null;
        if (staggeredGridLayoutManager != null) {
            int i18 = f4Var.f123694r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(dimension));
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(staggeredGridLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
