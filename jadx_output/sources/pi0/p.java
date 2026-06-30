package pi0;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f354685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint f354687f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.m1 f354688g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f354689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f354690i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354691m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pi0.q qVar, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, pi0.m1 m1Var, boolean z17, boolean z18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f354686e = qVar;
        this.f354687f = dartEntrypoint;
        this.f354688g = m1Var;
        this.f354689h = z17;
        this.f354690i = z18;
        this.f354691m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new pi0.p(this.f354686e, this.f354687f, this.f354688g, this.f354689h, this.f354690i, this.f354691m, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((pi0.p) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354685d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.flutter.embedding.engine.MMFlutterEngineGroup d17 = this.f354686e.d();
            io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = this.f354687f;
            pi0.m1 m1Var = this.f354688g;
            boolean z17 = this.f354689h;
            boolean z18 = this.f354690i;
            boolean z19 = m1Var.f354673i;
            pi0.o oVar = new pi0.o(m1Var, this.f354691m);
            this.f354685d = 1;
            obj = d17.createAndRunEngine(dartEntrypoint, m1Var, z17, z18, z19, oVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
