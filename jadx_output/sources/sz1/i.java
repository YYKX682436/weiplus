package sz1;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f413940a = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f413941b = new com.tencent.mm.sdk.platformtools.n3("DataReportService#ThreadUtils#ASYNC_HANDLER", new sz1.h());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f413942c = new java.util.ArrayList();

    public static void a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            c(runnable);
        }
    }

    public static void b(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f413941b.post(runnable);
    }

    public static void c(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f413940a.post(runnable);
    }

    public static void d(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        f413940a.postDelayed(runnable, j17);
    }

    public static com.tencent.mm.sdk.platformtools.n3 e(com.tencent.mm.sdk.platformtools.k3 k3Var) {
        if (k3Var != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) f413942c;
            if (!arrayList.contains(k3Var)) {
                arrayList.add(k3Var);
            }
        }
        return f413941b;
    }
}
