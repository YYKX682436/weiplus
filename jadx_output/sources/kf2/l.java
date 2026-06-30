package kf2;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.n f307269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.n nVar, long j17, int i17) {
        super(2, continuation);
        this.f307268d = hVar;
        this.f307269e = nVar;
        this.f307270f = j17;
        this.f307271g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.l(this.f307268d, continuation, this.f307269e, this.f307270f, this.f307271g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.l lVar = (kf2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.v71 v71Var = (r45.v71) ((xg2.i) this.f307268d).f454393b;
        this.f307269e.c(this.f307270f, this.f307271g, v71Var);
        return jz5.f0.f302826a;
    }
}
