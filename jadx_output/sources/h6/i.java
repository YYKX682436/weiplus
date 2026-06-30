package h6;

/* loaded from: classes16.dex */
public final class i implements l36.o, yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final l36.n f279123d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.q f279124e;

    public i(l36.n call, kotlinx.coroutines.q continuation) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        this.f279123d = call;
        this.f279124e = continuation;
    }

    @Override // l36.o
    public void a(l36.n call, l36.a1 response) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(response, "response");
        this.f279124e.resumeWith(kotlin.Result.m521constructorimpl(response));
    }

    @Override // l36.o
    public void d(l36.n call, java.io.IOException e17) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(e17, "e");
        if (((l36.u0) call).f315652e.f351740d) {
            return;
        }
        kotlinx.coroutines.q qVar = this.f279124e;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17)));
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            ((l36.u0) this.f279123d).a();
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f302826a;
    }
}
