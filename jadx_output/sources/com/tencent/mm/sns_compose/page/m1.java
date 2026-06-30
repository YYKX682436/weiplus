package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f193539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.u0 f193540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.sns_compose.page.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193540e = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.sns_compose.page.m1 m1Var = new com.tencent.mm.sns_compose.page.m1(this.f193540e, continuation);
        m1Var.f193539d = obj;
        return m1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.sns_compose.page.m1) create((n85.t) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return java.lang.Boolean.valueOf(!kotlin.jvm.internal.o.b(((com.tencent.mm.sns_compose.page.t0) this.f193540e).f193587a.f335724d, ((n85.t) this.f193539d).f335724d));
    }
}
