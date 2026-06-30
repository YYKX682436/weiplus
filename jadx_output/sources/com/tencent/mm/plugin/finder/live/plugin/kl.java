package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.j f113267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vg2.m f113269g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(az2.j jVar, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, vg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113267e = jVar;
        this.f113268f = hmVar;
        this.f113269g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.kl(this.f113267e, this.f113268f, this.f113269g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.kl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113266d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.plugin.jl jlVar = new com.tencent.mm.plugin.finder.live.plugin.jl(this.f113267e, this.f113268f, this.f113269g, null);
            this.f113266d = 1;
            if (kotlinx.coroutines.l.g(p0Var, jlVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
