package pz0;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f359109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359108e = lVar;
        this.f359109f = c0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        pz0.a aVar = new pz0.a(this.f359108e, this.f359109f, (kotlin.coroutines.Continuation) obj3);
        aVar.f359107d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: err", (java.lang.Throwable) this.f359107d);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f359108e.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        this.f359109f.f310112d = true;
        return jz5.f0.f302826a;
    }
}
