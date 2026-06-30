package ir2;

/* loaded from: classes.dex */
public final class f1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294138d;

    public f1(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ir2.f1 f1Var = new ir2.f1((kotlin.coroutines.Continuation) obj3);
        f1Var.f294138d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        f1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "catch :" + ((java.lang.Throwable) this.f294138d));
        return jz5.f0.f302826a;
    }
}
