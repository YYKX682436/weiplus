package xi2;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xi2.k f454723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xi2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454723d = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xi2.h(this.f454723d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xi2.h hVar = (xi2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f454723d.f454729b.onAnimationEnd();
        return jz5.f0.f302826a;
    }
}
