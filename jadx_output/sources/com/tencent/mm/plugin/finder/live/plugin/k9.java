package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f113207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113207e = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.k9(this.f113207e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.plugin.k9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113206d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f113207e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) o9Var.P0(mm2.g1.class)).f329068f;
            com.tencent.mm.plugin.finder.live.plugin.j9 j9Var = new com.tencent.mm.plugin.finder.live.plugin.j9(o9Var);
            this.f113206d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(j9Var, this) == aVar) {
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
