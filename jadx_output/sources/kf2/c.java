package kf2;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f307201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.e f307202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307204g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xg2.h hVar, kotlin.coroutines.Continuation continuation, kf2.e eVar, long j17, int i17) {
        super(2, continuation);
        this.f307201d = hVar;
        this.f307202e = eVar;
        this.f307203f = j17;
        this.f307204g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.c(this.f307201d, continuation, this.f307202e, this.f307203f, this.f307204g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kf2.c cVar = (kf2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f307202e.b(this.f307203f, this.f307204g);
        return jz5.f0.f302826a;
    }
}
