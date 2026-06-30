package kf2;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.r f307279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307281g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.r rVar, long j17, int i17) {
        super(2, continuation);
        this.f307278d = hVar;
        this.f307279e = rVar;
        this.f307280f = j17;
        this.f307281g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.o(this.f307278d, continuation, this.f307279e, this.f307280f, this.f307281g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.o oVar = (kf2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f307278d).f454381b;
        this.f307279e.a(this.f307280f, this.f307281g, aVar2);
        return jz5.f0.f302826a;
    }
}
