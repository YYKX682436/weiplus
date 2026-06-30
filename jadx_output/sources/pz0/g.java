package pz0;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f359124f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359123e = lVar;
        this.f359124f = c0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        pz0.g gVar = new pz0.g(this.f359123e, this.f359124f, (kotlin.coroutines.Continuation) obj3);
        gVar.f359122d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startMovieCreation: err", (java.lang.Throwable) this.f359122d);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f359123e.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        this.f359124f.f310112d = true;
        return jz5.f0.f302826a;
    }
}
