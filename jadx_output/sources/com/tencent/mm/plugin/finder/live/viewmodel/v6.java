package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class v6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.m f117478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f117479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117480g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(yl2.m mVar, yl2.g1 g1Var, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117478e = mVar;
        this.f117479f = g1Var;
        this.f117480g = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.v6(this.f117478e, this.f117479f, this.f117480g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.v6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117477d;
        yl2.m mVar = this.f117478e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: starting auth, precheckType=" + mVar.f463044a);
            this.f117477d = 1;
            obj = this.f117479f.i(mVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.u6((yl2.h) obj, this.f117480g, mVar));
        return jz5.f0.f302826a;
    }
}
