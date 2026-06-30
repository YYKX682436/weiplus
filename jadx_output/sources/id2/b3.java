package id2;

/* loaded from: classes.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f290495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar) {
        super(2, continuation);
        this.f290494d = hVar;
        this.f290495e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.b3(this.f290494d, continuation, this.f290495e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.b3 b3Var = (id2.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f290494d).f454381b;
        this.f290495e.b();
        com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "get live info failed " + aVar2.f454379a);
        return jz5.f0.f302826a;
    }
}
