package j3;

/* loaded from: classes7.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f297342a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f297343b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Method f297344c;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                f297342a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                f297343b = android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                f297344c = android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
