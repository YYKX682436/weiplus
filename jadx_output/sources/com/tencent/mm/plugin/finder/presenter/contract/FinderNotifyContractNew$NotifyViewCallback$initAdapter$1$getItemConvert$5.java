package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isLiked", "Lso2/o3;", "msg", "Ljz5/f0;", "invoke", "(ZLso2/o3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$initAdapter$1$getItemConvert$5(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        super(2);
        this.f123215d = notifyViewCallback;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        so2.o3 msg = (so2.o3) obj2;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f123215d.f123194e;
        notifyPresenter.getClass();
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = notifyPresenter.f123167w;
        if (finderMsgOperateVM != null) {
            finderMsgOperateVM.f(booleanValue, msg, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.f122968f.a(msg.f410411d));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("msgOperateVM");
        throw null;
    }
}
