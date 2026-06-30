package py0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.y f359000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(py0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359000e = yVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.m mVar = new py0.m(this.f359000e, (kotlin.coroutines.Continuation) obj3);
        mVar.f358999d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MaasBaseUILogicUIC", (java.lang.Throwable) this.f358999d, "maas error", new java.lang.Object[0]);
        py0.y yVar = this.f359000e;
        yVar.P6().dismiss();
        db5.t7.g(yVar.getContext(), yVar.getString(com.tencent.mm.R.string.gvm));
        yVar.S6(4);
        yVar.getContext().setResult(0);
        yVar.getContext().finish();
        return jz5.f0.f302826a;
    }
}
