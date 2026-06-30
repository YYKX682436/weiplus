package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class we extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(0);
        this.f114922d = viewGroup;
        this.f114923e = mgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f114922d.findViewById(com.tencent.mm.R.id.ev9);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView");
        com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView finderLiveOverScrollRecyclerView = (com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView) findViewById;
        if (((java.lang.Number) ae2.in.O.r()).intValue() == 0) {
            finderLiveOverScrollRecyclerView.setRemoveAnimatorWhenDetach(true);
            finderLiveOverScrollRecyclerView.setItemAnimator(null);
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f114923e;
        finderLiveOverScrollRecyclerView.addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.live.plugin.re(mgVar));
        finderLiveOverScrollRecyclerView.i(new com.tencent.mm.plugin.finder.live.plugin.se(mgVar));
        finderLiveOverScrollRecyclerView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.te(mgVar));
        finderLiveOverScrollRecyclerView.setCanScrollListener(com.tencent.mm.plugin.finder.live.plugin.ue.f114555d);
        finderLiveOverScrollRecyclerView.setHasUnreadListener(new com.tencent.mm.plugin.finder.live.plugin.ve(mgVar));
        return finderLiveOverScrollRecyclerView;
    }
}
