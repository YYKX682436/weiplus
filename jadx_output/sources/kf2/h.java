package kf2;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.j f307240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.j jVar, long j17, int i17) {
        super(2, continuation);
        this.f307239d = hVar;
        this.f307240e = jVar;
        this.f307241f = j17;
        this.f307242g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.h(this.f307239d, continuation, this.f307240e, this.f307241f, this.f307242g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.h hVar = (kf2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ps1 ps1Var = (r45.ps1) ((xg2.i) this.f307239d).f454393b;
        this.f307240e.c(this.f307241f, this.f307242g, ps1Var);
        return jz5.f0.f302826a;
    }
}
