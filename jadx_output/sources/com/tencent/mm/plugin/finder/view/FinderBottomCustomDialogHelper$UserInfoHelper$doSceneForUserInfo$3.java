package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbq/z1;", "<anonymous parameter 0>", "Lcom/tencent/mm/modelbase/f;", "Lcom/tencent/mm/protocal/protobuf/FinderUserPageResponse;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lbq/z1;Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$3 extends kotlin.jvm.internal.q implements yz5.p {
    final /* synthetic */ yz5.a $onComplete;
    final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$3(yz5.a aVar, com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper) {
        super(2);
        this.$onComplete = aVar;
        this.this$0 = userInfoHelper;
    }

    @Override // yz5.p
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        invoke((bq.z1) obj, (com.tencent.mm.modelbase.f) obj2);
        return jz5.f0.f302826a;
    }

    public final void invoke(bq.z1 z1Var, com.tencent.mm.modelbase.f fVar) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(z1Var, "<anonymous parameter 0>");
        this.$onComplete.invoke();
        lVar = this.this$0.callback;
        lVar.invoke(java.lang.Boolean.FALSE);
    }
}
