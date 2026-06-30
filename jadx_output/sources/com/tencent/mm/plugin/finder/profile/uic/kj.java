package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class kj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f123907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123908e;

    public kj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar, com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        this.f123907d = dkVar;
        this.f123908e = f4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList list;
        r45.wj6 wj6Var;
        java.util.LinkedList list2;
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f123907d;
        r45.zc1 zc1Var = (r45.zc1) ((jz5.n) dkVar.f123639p).getValue();
        r45.vj6 vj6Var = null;
        if (zc1Var != null && (list2 = zc1Var.getList(0)) != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.vj6) next).getInteger(0) == 3) {
                    vj6Var = next;
                    break;
                }
            }
            vj6Var = vj6Var;
        }
        int integer = (vj6Var == null || (list = vj6Var.getList(1)) == null || (wj6Var = (r45.wj6) kz5.n0.Z(list)) == null) ? 0 : wj6Var.getInteger(1);
        androidx.appcompat.app.AppCompatActivity activity = dkVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        int S6 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).S6(so2.u1.class) * integer;
        int i17 = 0;
        for (so2.j5 j5Var : dkVar.O6()) {
            i17 += ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getProfileTabScene() == 3) ? 1 : 0;
        }
        com.tencent.mars.xlog.Log.i("Finder.ProfileUnlimitedFlowUIC", "[onAttachData] videoCount=" + i17 + " maxSize=" + S6 + " rowCount=" + integer);
        if (i17 < S6) {
            on5.c loadMoreFooter = dkVar.P6().getLoadMoreFooter();
            if (loadMoreFooter != null) {
                loadMoreFooter.b(true);
                return;
            }
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = dkVar.P6().getRecyclerView();
        if (recyclerView != null) {
            this.f123908e.T6(recyclerView, true, 10);
        }
        dkVar.getFeedLoader().requestRefresh();
    }
}
