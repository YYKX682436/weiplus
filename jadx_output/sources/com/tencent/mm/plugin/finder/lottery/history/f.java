package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.lottery.history.g f120838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.lottery.history.g gVar) {
        super(1);
        this.f120838d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = this.f120838d.f122553f;
        com.tencent.mm.view.RefreshLoadMoreLayout a17 = viewCallback != null ? viewCallback.a() : null;
        if (a17 != null) {
            a17.setEnableLoadMore(it.getHasMore());
        }
        return jz5.f0.f302826a;
    }
}
