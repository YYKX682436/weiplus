package kf2;

/* loaded from: classes.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.v f307302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.v vVar, long j17, int i17) {
        super(2, continuation);
        this.f307301d = hVar;
        this.f307302e = vVar;
        this.f307303f = j17;
        this.f307304g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.t(this.f307301d, continuation, this.f307302e, this.f307303f, this.f307304g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.t tVar = (kf2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.jg1 jg1Var = (r45.jg1) ((xg2.i) this.f307301d).f454393b;
        this.f307302e.c(this.f307303f, this.f307304g, jg1Var);
        return jz5.f0.f302826a;
    }
}
