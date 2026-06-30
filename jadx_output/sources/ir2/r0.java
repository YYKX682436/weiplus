package ir2;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294213d;

    public r0(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ir2.r0 r0Var = new ir2.r0((kotlin.coroutines.Continuation) obj3);
        r0Var.f294213d = (kotlinx.coroutines.flow.k) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.NewLoader", "observeState catch: " + ((kotlinx.coroutines.flow.k) this.f294213d));
        return jz5.f0.f302826a;
    }
}
