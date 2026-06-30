package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f123208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, java.util.List list) {
        super(0);
        this.f123207d = notifyViewCallback;
        this.f123208e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ym5.s3 s3Var = new ym5.s3(1);
        s3Var.f463522g = false;
        java.util.List list = this.f123208e;
        s3Var.f463521f = true ^ list.isEmpty();
        s3Var.f463523h = list.size();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f123207d.f123196g;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(s3Var);
        }
        return jz5.f0.f302826a;
    }
}
