package j75;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j75.k f298068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.d f298069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j75.k kVar, j75.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298068d = kVar;
        this.f298069e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j75.g(this.f298068d, this.f298069e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j75.g gVar = (j75.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j75.k kVar = this.f298068d;
        j75.a c17 = kVar.f298076g.c();
        c17.f298066d = this.f298069e;
        kVar.f298077h.a(c17);
        kVar.f298076g = c17;
        kVar.f298078i.notify(c17.c());
        return jz5.f0.f302826a;
    }
}
