package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f111970d;

    /* renamed from: e, reason: collision with root package name */
    public int f111971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c4 f111972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.finder.live.plugin.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f111972f = c4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.b4(this.f111972f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xt2.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f111971e;
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = this.f111972f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xt2.d dVar = c4Var.f112105y;
            if (!(dVar instanceof xt2.m)) {
                dVar = null;
            }
            if (dVar != null) {
                this.f111970d = dVar;
                this.f111971e = 1;
                if (dVar.o(null, null, this) == aVar) {
                    return aVar;
                }
                mVar = dVar;
            }
            com.tencent.mars.xlog.Log.i(c4Var.f112103w, "playAutoAnimate");
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = (xt2.m) this.f111970d;
        kotlin.ResultKt.throwOnFailure(obj);
        mVar.q();
        com.tencent.mars.xlog.Log.i(c4Var.f112103w, "playAutoAnimate");
        return jz5.f0.f302826a;
    }
}
