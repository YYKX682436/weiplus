package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FinderNotifyContract$NotifyPresenter$finderUserName$2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$finderUserName$2(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter) {
        super(0);
        this.f123037d = notifyPresenter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback;
        com.tencent.mm.ui.MMActivity mMActivity;
        java.lang.String e17;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123037d;
        return (notifyPresenter.f123004d != 1 || (notifyViewCallback = (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) kz5.n0.Z(notifyPresenter.f123012o)) == null || (mMActivity = notifyViewCallback.f123083h) == null || (e17 = xy2.c.e(mMActivity)) == null) ? "" : e17;
    }
}
