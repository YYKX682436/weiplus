package nu0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340079d = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.q1(this.f340079d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.q1 q1Var = (nu0.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nu0.b4 b4Var = this.f340079d;
        java.lang.Runnable task = b4Var.f339889x0;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.sdk.platformtools.u3.i(task, 3000L);
        b4Var.i7().setDoneBtnEnabled(true);
        return jz5.f0.f302826a;
    }
}
