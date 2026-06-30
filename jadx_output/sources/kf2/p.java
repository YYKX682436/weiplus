package kf2;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.r f307284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.r rVar, long j17, int i17) {
        super(2, continuation);
        this.f307283d = hVar;
        this.f307284e = rVar;
        this.f307285f = j17;
        this.f307286g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.p(this.f307283d, continuation, this.f307284e, this.f307285f, this.f307286g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.p pVar = (kf2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.x71 x71Var = (r45.x71) ((xg2.i) this.f307283d).f454393b;
        this.f307284e.c(this.f307285f, this.f307286g, x71Var);
        return jz5.f0.f302826a;
    }
}
