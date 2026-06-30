package ni3;

/* loaded from: classes10.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni3.o1 f337632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ni3.o1 o1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337632d = o1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni3.m1(this.f337632d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ni3.m1 m1Var = (ni3.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ni3.o1 o1Var = this.f337632d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            ni3.o1.a(o1Var);
            ni3.o1.b(o1Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("StrategyAsyncMonitor", "startMonitorAsync catch throwable:" + th6);
        }
        return jz5.f0.f302826a;
    }
}
