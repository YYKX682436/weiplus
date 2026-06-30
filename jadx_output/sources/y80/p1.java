package y80;

/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f459895a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f459896b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f459897c;

    public p1(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f459895a = callback;
        this.f459896b = "ResultCallbackHolder";
    }

    public final void a(java.lang.Object obj) {
        if (this.f459897c) {
            com.tencent.mars.xlog.Log.i(this.f459896b, "invoke: duplicate");
            return;
        }
        this.f459897c = true;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f459895a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(obj)));
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
