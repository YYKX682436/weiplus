package s13;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.Object f402134a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f402135b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f402136c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f402137d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f402138e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f402139f = new java.lang.Object();

    public static void a() {
        if (f402136c != null) {
            return;
        }
        synchronized (f402139f) {
            if (f402136c == null) {
                f402136c = com.tencent.mm.plugin.fts.train.WCSearchGroupClickHistory.class.getMethod("recordClick", java.lang.String.class);
            }
        }
    }

    public static void b() {
        if (f402134a == null || f402135b == null) {
            synchronized (f402138e) {
                if (f402134a == null || f402135b == null) {
                    if (f402134a == null) {
                        f402134a = com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr.class.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    }
                    if (f402135b == null) {
                        f402135b = com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr.class.getMethod("initIfNeeded", android.content.Context.class);
                    }
                }
            }
        }
    }

    public static void c(android.content.Context context) {
        if (context != null && !f402137d) {
            try {
                p13.w wVar = ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).f403091d;
                if (wVar != null) {
                    if (wVar.f351171k) {
                        try {
                            b();
                            if (f402134a == null || f402135b == null) {
                                return;
                            }
                            f402135b.invoke(f402134a, context);
                        } catch (java.lang.Throwable unused) {
                            f402137d = true;
                        }
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
    }
}
