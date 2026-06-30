package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kn f112307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(com.tencent.mm.plugin.finder.live.plugin.kn knVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112307e = knVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.dn(this.f112307e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.plugin.dn) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112306d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.kn knVar = this.f112307e;
            kotlinx.coroutines.flow.j2 j2Var = ((je2.t) knVar.P0(je2.t.class)).f299267m;
            com.tencent.mm.plugin.finder.live.plugin.cn cnVar = new com.tencent.mm.plugin.finder.live.plugin.cn(knVar);
            this.f112306d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(cnVar, this) == aVar) {
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
