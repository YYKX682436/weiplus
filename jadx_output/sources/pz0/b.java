package pz0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f359111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.jvm.internal.c0 c0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359111e = c0Var;
        this.f359112f = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        pz0.b bVar = new pz0.b(this.f359111e, this.f359112f, (kotlin.coroutines.Continuation) obj3);
        bVar.f359110d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f359110d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreateCreation: ");
        sb6.append(th6 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", sb6.toString());
        if (th6 == null && !this.f359111e.f310112d) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f359112f.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
        }
        return jz5.f0.f302826a;
    }
}
