package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/kp2;", "it", "Ljz5/f0;", "invoke", "(Lr45/kp2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgOperateVM$onReplyBullet$2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM f122984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgOperateVM$onReplyBullet$2(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM) {
        super(1);
        this.f122984d = finderMsgOperateVM;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.kp2 it = (r45.kp2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = this.f122984d.f122969a;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.owi));
        return jz5.f0.f302826a;
    }
}
