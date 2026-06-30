package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t70 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f114353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114353e = v70Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.t70(this.f114353e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.plugin.t70) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114352d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f114353e;
            kotlinx.coroutines.flow.f3 f3Var = ((mm2.o4) v70Var.P0(mm2.o4.class)).f329321p1;
            com.tencent.mm.plugin.finder.live.plugin.s70 s70Var = new com.tencent.mm.plugin.finder.live.plugin.s70(v70Var);
            this.f114352d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(s70Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
