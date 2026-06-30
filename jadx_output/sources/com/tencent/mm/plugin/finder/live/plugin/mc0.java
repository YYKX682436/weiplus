package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mc0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113487e = nd0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.mc0(this.f113487e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.mc0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113486d;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f113487e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nd0Var.w1();
            this.f113486d = 1;
            if (kotlinx.coroutines.k1.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        nd0Var.M1(true);
        return jz5.f0.f302826a;
    }
}
