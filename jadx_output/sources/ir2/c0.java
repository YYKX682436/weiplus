package ir2;

/* loaded from: classes.dex */
public final class c0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294119d;

    public c0(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ir2.c0 c0Var = new ir2.c0((kotlin.coroutines.Continuation) obj3);
        c0Var.f294119d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.NewLoader", "catch :" + ((java.lang.Throwable) this.f294119d));
        return jz5.f0.f302826a;
    }
}
