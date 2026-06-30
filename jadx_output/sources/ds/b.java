package ds;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f242772a = new java.util.TreeSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f242773b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f242774c = new java.util.concurrent.ConcurrentHashMap(64);

    /* renamed from: d, reason: collision with root package name */
    public static final ds.a f242775d = new ds.a("load-lib-spin");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.reflect.Method[] f242776e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.ThreadLocal f242777f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f242778g;

    static {
        java.util.regex.Pattern.compile("lib([^\\s/]+?)\\.so");
        f242776e = new java.lang.reflect.Method[]{null};
        f242777f = new java.lang.ThreadLocal();
        f242778g = new java.lang.ThreadLocal();
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader) {
        java.util.List list = f242773b;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
        }
    }

    public static void b(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.ThreadLocal threadLocal = f242777f;
        java.lang.Boolean bool = (java.lang.Boolean) threadLocal.get();
        if (bool != null && bool.booleanValue()) {
            if (objArr == null || objArr.length == 0) {
                android.util.Log.println(i17, str, str2);
                return;
            } else {
                android.util.Log.println(i17, str, java.lang.String.format(str2, objArr));
                return;
            }
        }
        threadLocal.set(java.lang.Boolean.TRUE);
        if (i17 == 0) {
            kd.c.d(str, str2, objArr);
        } else if (i17 == 1) {
            kd.c.a(str, str2, objArr);
        } else if (i17 == 2) {
            kd.c.c(str, str2, objArr);
        } else if (i17 == 3) {
            kd.c.e(str, str2, objArr);
        } else if (i17 == 4) {
            kd.c.b(str, str2, objArr);
        }
        threadLocal.set(java.lang.Boolean.FALSE);
    }
}
