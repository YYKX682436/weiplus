package mz0;

/* loaded from: classes3.dex */
public final class g1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332963e = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.g1 g1Var = new mz0.g1(this.f332963e, (kotlin.coroutines.Continuation) obj3);
        g1Var.f332962d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        g1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Template.TemplateControlUIC", (java.lang.Throwable) this.f332962d, "maas error", new java.lang.Object[0]);
        this.f332963e.invoke();
        return jz5.f0.f302826a;
    }
}
