package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class cd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112138d;

    public cd(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.cd(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.tencent.mm.plugin.finder.live.plugin.cd((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112138d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112138d = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.live.plugin.jd jdVar = new com.tencent.mm.plugin.finder.live.plugin.jd(currentTimeMillis, nVar);
            com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "[WeCoin] getWeCoinBalance: requestId:" + currentTimeMillis);
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new dk2.i4(currentTimeMillis, jdVar));
            obj = nVar.a();
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
