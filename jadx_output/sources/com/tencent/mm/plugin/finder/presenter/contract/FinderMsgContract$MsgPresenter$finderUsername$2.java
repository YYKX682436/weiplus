package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FinderMsgContract$MsgPresenter$finderUsername$2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgPresenter$finderUsername$2(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter) {
        super(0);
        this.f122844d = msgPresenter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback;
        com.tencent.mm.ui.MMActivity mMActivity;
        java.lang.String e17;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122844d;
        return (msgPresenter.f122823d != 1 || (msgViewCallback = msgPresenter.f122827h) == null || (mMActivity = msgViewCallback.f122860g) == null || (e17 = xy2.c.e(mMActivity)) == null) ? "" : e17;
    }
}
