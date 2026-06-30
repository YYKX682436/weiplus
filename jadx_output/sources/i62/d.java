package i62;

/* loaded from: classes13.dex */
public final class d implements uk5.c {

    /* renamed from: b, reason: collision with root package name */
    public static final i62.d f288942b = new i62.d();

    @Override // uk5.c
    public void a(yn5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
        pm0.v.K(null, new i62.c(result));
    }

    @Override // uk5.c
    public void b(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        try {
            com.tencent.mm.sdk.platformtools.u3.h(new i62.b(activity, java.lang.System.nanoTime(), 6));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ActivityStartReportHelper", th6, "handleActivityOnCreate err", new java.lang.Object[0]);
        }
    }
}
