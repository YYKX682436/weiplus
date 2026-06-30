package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "errType", "errCode", "", "errMsg", "Ljz5/f0;", "invoke", "(IILjava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgOperateVM$onReply$1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM f122980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f122981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgOperateVM$onReply$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM, so2.o3 o3Var) {
        super(3);
        this.f122980d = finderMsgOperateVM;
        this.f122981e = o3Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dm.pd pdVar = this.f122981e.f410411d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.a(this.f122980d, ((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), (java.lang.String) obj3, pdVar);
        return jz5.f0.f302826a;
    }
}
