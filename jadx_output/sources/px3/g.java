package px3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ px3.j f358944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(px3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358944d = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px3.g(this.f358944d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        px3.g gVar = (px3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((kotlinx.coroutines.flow.h3) this.f358944d.f358951f).k(new px3.a(null, 3));
        return jz5.f0.f302826a;
    }
}
