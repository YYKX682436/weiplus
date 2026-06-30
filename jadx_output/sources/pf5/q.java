package pf5;

/* loaded from: classes5.dex */
public class q implements androidx.lifecycle.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f353928d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f353929e = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.internal.b0.f310484a));

    /* renamed from: f, reason: collision with root package name */
    public final pf5.v0 f353930f = new pf5.v0(true);

    public final qf5.a a(java.lang.String str) {
        java.lang.String str2 = "com.tencent.mm.ui.component.UicApiExporterFor" + str;
        com.tencent.mars.xlog.Log.i("SupportUIC", "[attachUicApiRegister] name=" + str2);
        java.lang.Object newInstance = java.lang.Class.forName(str2).newInstance();
        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.ui.component.annotation.UicApiRegister");
        return (qf5.a) newInstance;
    }

    public void b(java.lang.String javaClassName) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(javaClassName, "javaClassName");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            a(javaClassName).a();
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SupportUIC", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
    }

    public void c() {
        this.f353930f.a();
        kotlinx.coroutines.z0.d(this.f353928d, this + " onCleared.", null, 2, null);
        kotlinx.coroutines.z0.d(this.f353929e, this + " onCleared.", null, 2, null);
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f353930f;
    }
}
