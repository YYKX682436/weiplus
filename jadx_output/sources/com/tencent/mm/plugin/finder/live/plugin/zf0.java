package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zf0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115339d;

    /* renamed from: e, reason: collision with root package name */
    public int f115340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ag0 f115341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115341f = ag0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.zf0(this.f115341f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.zf0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xt2.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115340e;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = this.f115341f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = ag0Var.f111883y;
            xt2.m mVar2 = obj2 instanceof xt2.m ? (xt2.m) obj2 : null;
            if (mVar2 != null) {
                this.f115339d = mVar2;
                this.f115340e = 1;
                if (mVar2.o(null, null, this) == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            }
            com.tencent.mars.xlog.Log.i(ag0Var.f111881w, "playAutoAnimate");
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = (xt2.m) this.f115339d;
        kotlin.ResultKt.throwOnFailure(obj);
        mVar.q();
        com.tencent.mars.xlog.Log.i(ag0Var.f111881w, "playAutoAnimate");
        return jz5.f0.f302826a;
    }
}
