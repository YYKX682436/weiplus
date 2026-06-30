package pi0;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f354617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pi0.u0 u0Var, pi0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f354617d = u0Var;
        this.f354618e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new pi0.j(this.f354617d, this.f354618e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pi0.j jVar = (pi0.j) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        io.flutter.embedding.engine.plugins.PluginRegistry plugins = this.f354617d.f354731b.getPlugins();
        pi0.q qVar = this.f354618e;
        plugins.add(qVar.f354707k);
        plugins.add(qVar.f354708l);
        return jz5.f0.f302826a;
    }
}
