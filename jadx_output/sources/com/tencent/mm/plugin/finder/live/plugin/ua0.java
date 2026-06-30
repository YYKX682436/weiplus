package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ua0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f114545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114545e = wa0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.ua0(this.f114545e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ua0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114544d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f114544d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.live.plugin.ta0 ta0Var = new com.tencent.mm.plugin.finder.live.plugin.ta0(this.f114545e, null);
        this.f114544d = 2;
        if (kotlinx.coroutines.l.g(g3Var, ta0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
