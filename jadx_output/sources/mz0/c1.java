package mz0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f332910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(kotlin.jvm.internal.c0 c0Var, mz0.b2 b2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332910e = c0Var;
        this.f332911f = b2Var;
        this.f332912g = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = this.f332912g;
        mz0.c1 c1Var = new mz0.c1(this.f332910e, this.f332911f, str, (kotlin.coroutines.Continuation) obj3);
        c1Var.f332909d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f332909d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "change on completion");
        this.f332910e.f310112d = th6 == null;
        mz0.b2 b2Var = this.f332911f;
        b2Var.A7();
        b2Var.f7().dismiss();
        b2Var.z7();
        b2Var.u7(th6, this.f332912g);
        return jz5.f0.f302826a;
    }
}
