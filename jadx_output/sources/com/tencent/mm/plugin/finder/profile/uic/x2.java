package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class x2 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124340a;

    public x2(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        this.f124340a = j3Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f124340a.O6(), false, 1, null);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        this.f124340a.O6().requestRefresh();
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124340a.P6().getRecyclerView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
