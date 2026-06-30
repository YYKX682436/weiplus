package zi4;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f473278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(zi4.g0 g0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473278e = g0Var;
        this.f473279f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zi4.z zVar = new zi4.z(this.f473278e, this.f473279f, continuation);
        zVar.f473277d = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi4.z zVar = (zi4.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f473277d;
        java.util.Map map = zi4.g0.f473214g;
        zi4.g0 g0Var = this.f473278e;
        boolean z17 = g0Var.f473215a != null;
        yz5.a aVar2 = this.f473279f;
        if (z17) {
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310568a, null, new zi4.y(aVar2, null), 2, null);
        } else {
            ((java.util.ArrayList) g0Var.f473220f).add(aVar2);
        }
        return jz5.f0.f302826a;
    }
}
