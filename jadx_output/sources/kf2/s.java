package kf2;

/* loaded from: classes.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.v f307298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307300g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.v vVar, long j17, int i17) {
        super(2, continuation);
        this.f307297d = hVar;
        this.f307298e = vVar;
        this.f307299f = j17;
        this.f307300g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.s(this.f307297d, continuation, this.f307298e, this.f307299f, this.f307300g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.s sVar = (kf2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f307297d).f454381b;
        this.f307298e.a(this.f307299f, this.f307300g, aVar2);
        return jz5.f0.f302826a;
    }
}
