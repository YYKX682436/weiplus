package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgOperateVM$initCommentFooter$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM f122975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgOperateVM$initCommentFooter$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM) {
        super(0);
        this.f122975d = finderMsgOperateVM;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = this.f122975d;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = finderMsgOperateVM.f122971c;
        finderMsgOperateVM.d((finderCommentFooter == null || (editText = finderCommentFooter.getEditText()) == null) ? null : java.lang.Long.valueOf(editText.getFeedId()));
        return jz5.f0.f302826a;
    }
}
