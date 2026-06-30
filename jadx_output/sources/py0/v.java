package py0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f359020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.y f359021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.jvm.internal.c0 c0Var, py0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359020e = c0Var;
        this.f359021f = yVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.v vVar = new py0.v(this.f359020e, this.f359021f, (kotlin.coroutines.Continuation) obj3);
        vVar.f359019d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f359019d;
        com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "change on completion");
        this.f359020e.f310112d = th6 == null;
        this.f359021f.P6().dismiss();
        return jz5.f0.f302826a;
    }
}
