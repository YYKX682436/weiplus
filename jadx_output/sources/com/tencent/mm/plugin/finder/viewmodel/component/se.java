package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class se extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f135895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f135896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar) {
        super(2, continuation);
        this.f135895d = hVar;
        this.f135896e = yeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.se(this.f135895d, continuation, this.f135896e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.se seVar = (com.tencent.mm.plugin.finder.viewmodel.component.se) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        seVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f135896e.f136567f = java.lang.System.currentTimeMillis();
        return jz5.f0.f302826a;
    }
}
