package n95;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static n95.c f335930a;

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        n95.c cVar = f335930a;
        if (cVar != null) {
            ((com.tencent.mm.app.d6) cVar).getClass();
            com.tencent.mars.xlog.Log.e(str, str2, objArr);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        n95.c cVar = f335930a;
        if (cVar != null) {
            ((com.tencent.mm.app.d6) cVar).getClass();
            com.tencent.mars.xlog.Log.i(str, str2, objArr);
        }
    }

    public static void c(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        n95.c cVar = f335930a;
        if (cVar != null) {
            ((com.tencent.mm.app.d6) cVar).getClass();
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
        }
    }
}
