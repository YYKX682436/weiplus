package px3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ px3.j f358943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(px3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358943d = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px3.f(this.f358943d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        px3.f fVar = (px3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (vx3.a aVar2 : mx3.i0.g()) {
            t45.i iVar = new t45.i();
            iVar.f415588d = aVar2.f441262e;
            iVar.f415591g = aVar2.f441263f;
            arrayList.add(new ox3.a(iVar));
        }
        ((kotlinx.coroutines.flow.h3) this.f358943d.f358951f).k(new px3.a(arrayList, 5));
        return jz5.f0.f302826a;
    }
}
