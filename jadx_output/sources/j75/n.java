package j75;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j75.r f298081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.d f298082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j75.r rVar, j75.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298081d = rVar;
        this.f298082e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j75.n(this.f298081d, this.f298082e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j75.n nVar = (j75.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j75.r rVar = this.f298081d;
        j75.a c17 = rVar.f298088f.c();
        c17.f298066d = this.f298082e;
        rVar.f298089g.a(c17);
        rVar.f298088f = c17;
        j75.a c18 = c17.c();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = rVar.f298086d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new j75.m(rVar, c18, null), 2, null);
        return jz5.f0.f302826a;
    }
}
