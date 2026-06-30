package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c80 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i80 f112125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(com.tencent.mm.plugin.finder.live.plugin.i80 i80Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112125e = i80Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.c80(this.f112125e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.c80) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112124d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112124d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.b80(this.f112125e));
        return jz5.f0.f302826a;
    }
}
