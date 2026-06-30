package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        super(0);
        this.f122373d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f122373d.u().getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122373d;
            java.util.ArrayList arrayList = l0Var.f122338d.f122422b.f122296a;
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    com.tencent.mm.plugin.finder.playlist.z1 z1Var = j5Var instanceof com.tencent.mm.plugin.finder.playlist.z1 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var : null;
                    if (z1Var != null && z1Var.f122508d) {
                        break;
                    }
                    i17++;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerBuilder", "checkPlayingHolder index: " + i17 + ", size:" + l0Var.f122338d.f122422b.f122296a.size());
            if (i17 >= 3) {
                r45.vx0 vx0Var = l0Var.f122338d.h().f122285e;
                if ((vx0Var != null ? vx0Var.getInteger(4) : 0) - i17 > 2) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    arrayList2.add(java.lang.Integer.valueOf(i17 - 1));
                    java.util.Collections.reverse(arrayList2);
                    com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager2 = finderLinearLayoutManager;
                    yj0.a.d(finderLinearLayoutManager2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                    yj0.a.f(finderLinearLayoutManager2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager3 = finderLinearLayoutManager;
                    yj0.a.d(finderLinearLayoutManager3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                    finderLinearLayoutManager.scrollToPosition(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(finderLinearLayoutManager3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
