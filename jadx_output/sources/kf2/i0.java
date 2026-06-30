package kf2;

/* loaded from: classes.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.l0 f307251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.l0 l0Var, long j17, int i17) {
        super(2, continuation);
        this.f307250d = hVar;
        this.f307251e = l0Var;
        this.f307252f = j17;
        this.f307253g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.i0(this.f307250d, continuation, this.f307251e, this.f307252f, this.f307253g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.i0 i0Var = (kf2.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f307250d).f454381b;
        this.f307251e.a(this.f307252f, this.f307253g, aVar2);
        return jz5.f0.f302826a;
    }
}
