package mz0;

/* loaded from: classes5.dex */
public final class f1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f332950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(mz0.b2 b2Var, az0.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332949e = b2Var;
        this.f332950f = b0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.f1 f1Var = new mz0.f1(this.f332949e, this.f332950f, (kotlin.coroutines.Continuation) obj3);
        f1Var.f332948d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        f1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f332948d;
        int i17 = th6 == null ? 3 : 4;
        mz0.b2 b2Var = this.f332949e;
        b2Var.B7(i17);
        b2Var.r7(th6);
        if (th6 == null) {
            b2Var.x7(this.f332950f);
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "export successful");
        } else {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Template.TemplateControlUIC", th6, "maas error", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
