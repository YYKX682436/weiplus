package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class tf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f133126d;

    /* renamed from: e, reason: collision with root package name */
    public int f133127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout f133128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f133129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout, r45.zk2 zk2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133128f = finderNPSFrameLayout;
        this.f133129g = zk2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.tf(this.f133128f, this.f133129g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.tf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f133127e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout2 = this.f133128f;
            if (finderNPSFrameLayout2.f131333f != null) {
                this.f133126d = finderNPSFrameLayout2;
                this.f133127e = 1;
                if (com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout.a(finderNPSFrameLayout2, this.f133129g, true, this) == aVar) {
                    return aVar;
                }
                finderNPSFrameLayout = finderNPSFrameLayout2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        finderNPSFrameLayout = (com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout) this.f133126d;
        kotlin.ResultKt.throwOnFailure(obj);
        finderNPSFrameLayout.c(com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
        return jz5.f0.f302826a;
    }
}
