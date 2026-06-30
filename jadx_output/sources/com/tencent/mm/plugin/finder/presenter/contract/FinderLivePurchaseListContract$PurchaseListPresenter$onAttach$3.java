package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lso2/j5;", "resp", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter f122743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3(com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter) {
        super(1);
        this.f122743d = purchaseListPresenter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse resp = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        boolean hasMore = resp.getHasMore();
        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter = this.f122743d;
        purchaseListPresenter.f122736g = hasMore ? 1 : 0;
        if (!resp.getHasMore()) {
            purchaseListPresenter.g().f122751d.setEnableRefresh(false);
            purchaseListPresenter.g().f122751d.setEnableLoadMore(false);
        }
        purchaseListPresenter.g().a(false);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter.c(purchaseListPresenter);
        purchaseListPresenter.f().notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
