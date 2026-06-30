package mz0;

/* loaded from: classes5.dex */
public final class l1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332998e = b2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.l1 l1Var = new mz0.l1(this.f332998e, (kotlin.coroutines.Continuation) obj3);
        l1Var.f332997d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        l1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Template.TemplateControlUIC", (java.lang.Throwable) this.f332997d, "maas error", new java.lang.Object[0]);
        mz0.b2 b2Var = this.f332998e;
        b2Var.f7().dismiss();
        db5.t7.g(b2Var.getContext(), b2Var.getString(com.tencent.mm.R.string.f490777aq5));
        return jz5.f0.f302826a;
    }
}
