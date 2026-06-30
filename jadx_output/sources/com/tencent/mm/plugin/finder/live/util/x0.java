package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes15.dex */
public final class x0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f115743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.finder.live.util.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f115744e = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.x0(this.f115744e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((com.tencent.mm.plugin.finder.live.util.x0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115743d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f115743d = 1;
            obj = com.tencent.mm.plugin.finder.live.util.a1.Z6(this.f115744e, 1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
