package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135172d;

    public mg(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.mg(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        new com.tencent.mm.plugin.finder.viewmodel.component.mg((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135172d;
        try {
            if (i17 != 0) {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.f135172d = 1;
            kotlinx.coroutines.k1.a(this);
            return aVar;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("Finder.FollowAggregationRepo", "service.lifecycleScope cancelled (account release), reset repo state");
            ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d).k(kz5.p0.f313996d);
            ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133882f).k(null);
            ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133881e).k(com.tencent.mm.plugin.finder.viewmodel.component.ig.f134739d);
            throw th6;
        }
    }
}
