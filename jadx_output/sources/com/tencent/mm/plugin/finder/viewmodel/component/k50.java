package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class k50 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.m50 f134920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134920d = m50Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.k50(this.f134920d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.k50 k50Var = (com.tencent.mm.plugin.finder.viewmodel.component.k50) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k50Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var = this.f134920d;
        long j17 = m50Var.f135133p;
        m50Var.f135132o = j17;
        m50Var.f135134q = true;
        com.tencent.mm.plugin.finder.viewmodel.component.m50.O6(m50Var, j17, 0, 0, true);
        this.f134920d.Q6("playLoopHandler");
        return jz5.f0.f302826a;
    }
}
