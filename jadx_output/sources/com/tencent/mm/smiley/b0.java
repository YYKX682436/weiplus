package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f193218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193219e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.smiley.b0(this.f193219e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.smiley.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f193218d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ny4.e eVar = com.tencent.mm.smiley.c0.f193229e;
            if (eVar != null) {
                eVar.f();
            }
            com.tencent.mm.smiley.c0.f193229e = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "try to stop recognize thread");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.smiley.a0 a0Var = new com.tencent.mm.smiley.a0(this.f193219e, null);
            this.f193218d = 1;
            if (kotlinx.coroutines.l.g(p0Var, a0Var, this) == aVar) {
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
