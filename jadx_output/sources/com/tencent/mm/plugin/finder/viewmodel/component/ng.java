package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ng extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135331d;

    public ng(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.viewmodel.component.ng ngVar = new com.tencent.mm.plugin.finder.viewmodel.component.ng(continuation);
        ngVar.f135331d = obj;
        return ngVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.ng ngVar = (com.tencent.mm.plugin.finder.viewmodel.component.ng) create((com.tencent.mm.plugin.finder.viewmodel.component.hg) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ngVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.FollowAggregationRepo", "entryMode -> " + ((com.tencent.mm.plugin.finder.viewmodel.component.hg) this.f135331d));
        return jz5.f0.f302826a;
    }
}
