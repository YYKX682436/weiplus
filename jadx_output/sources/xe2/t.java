package xe2;

/* loaded from: classes3.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.a f453905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yg2.b bVar, ug2.a aVar, xe2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453904d = bVar;
        this.f453905e = aVar;
        this.f453906f = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.t(this.f453904d, this.f453905e, this.f453906f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xe2.t tVar = (xe2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.c(this.f453904d, kotlinx.coroutines.q1.f310570c, kotlinx.coroutines.a1.UNDISPATCHED, new xe2.s(this.f453905e, this.f453906f, null));
        return jz5.f0.f302826a;
    }
}
