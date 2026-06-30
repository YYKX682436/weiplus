package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "invoke", "(Ljava/lang/Void;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FinderMsgContract$MsgViewCallback$initView$8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback f122888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$initView$8(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback) {
        super(1);
        this.f122888d = msgViewCallback;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122888d.f122859f;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.getClass();
        return java.lang.Integer.valueOf(msgPresenter.f(com.tencent.wcdb.core.Database.DictDefaultMatchValue, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122822c, false, true));
    }
}
