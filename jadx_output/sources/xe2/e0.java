package xe2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q26.n f453852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f453853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(yg2.b bVar, q26.n nVar, xe2.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453851d = bVar;
        this.f453852e = nVar;
        this.f453853f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.e0(this.f453851d, this.f453852e, this.f453853f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xe2.e0 e0Var = (xe2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.c(this.f453851d, kotlinx.coroutines.q1.f310570c, kotlinx.coroutines.a1.UNDISPATCHED, new xe2.d0(this.f453852e, this.f453853f, null));
        return jz5.f0.f302826a;
    }
}
