package cq2;

/* loaded from: classes2.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f221421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f221422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg2.h hVar, kotlin.coroutines.Continuation continuation, boolean z17) {
        super(2, continuation);
        this.f221421d = hVar;
        this.f221422e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cq2.o(this.f221421d, continuation, this.f221422e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cq2.o oVar = (cq2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.dk2 dk2Var = (r45.dk2) ((xg2.i) this.f221421d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadLiveSquareRecommendData: success, isKaraPredict=");
        sb6.append(this.f221422e);
        sb6.append(", size=");
        java.util.LinkedList list = dk2Var.getList(1);
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        sb6.append(", currentRedPreloadObjectKey=");
        sb6.append(cq2.q.f221435h);
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", sb6.toString());
        return jz5.f0.f302826a;
    }
}
