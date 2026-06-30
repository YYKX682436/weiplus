package t4;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f415463a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f415464b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f415465c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f415466d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Method f415467e;

    public static void a(java.lang.String str, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            f(str);
            return;
        }
        java.lang.String f17 = f(str);
        try {
            if (f415465c == null) {
                f415465c = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            f415465c.invoke(null, java.lang.Long.valueOf(f415463a), f17, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            c("asyncTraceBegin", e17);
        }
    }

    public static void b(java.lang.String str, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            f(str);
            return;
        }
        java.lang.String f17 = f(str);
        try {
            if (f415466d == null) {
                f415466d = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            f415466d.invoke(null, java.lang.Long.valueOf(f415463a), f17, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            c("asyncTraceEnd", e17);
        }
    }

    public static void c(java.lang.String str, java.lang.Exception exc) {
        if (exc instanceof java.lang.reflect.InvocationTargetException) {
            java.lang.Throwable cause = exc.getCause();
            if (!(cause instanceof java.lang.RuntimeException)) {
                throw new java.lang.RuntimeException(cause);
            }
            throw ((java.lang.RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return t4.b.a();
        }
        try {
            if (f415464b == null) {
                f415463a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f415464b = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            return ((java.lang.Boolean) f415464b.invoke(null, java.lang.Long.valueOf(f415463a))).booleanValue();
        } catch (java.lang.Exception e17) {
            c("isTagEnabled", e17);
            return false;
        }
    }

    public static void e(java.lang.String str, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.setCounter(f(str), i17);
            return;
        }
        java.lang.String f17 = f(str);
        try {
            if (f415467e == null) {
                f415467e = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            f415467e.invoke(null, java.lang.Long.valueOf(f415463a), f17, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            c("traceCounter", e17);
        }
    }

    public static java.lang.String f(java.lang.String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
