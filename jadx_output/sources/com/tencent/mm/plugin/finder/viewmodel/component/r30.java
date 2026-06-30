package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class r30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135762d;

    public r30(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.viewmodel.component.r30 r30Var = new com.tencent.mm.plugin.finder.viewmodel.component.r30(continuation);
        r30Var.f135762d = obj;
        return r30Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.r30) create((com.tencent.mm.plugin.finder.viewmodel.component.hg) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return (com.tencent.mm.plugin.finder.viewmodel.component.hg) this.f135762d;
    }
}
