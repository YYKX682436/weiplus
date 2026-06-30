package ko0;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.d0 f309840a = new ko0.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f309841b = new java.util.HashMap();

    public final void a(java.lang.String event, int i17, java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = f309841b;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(event);
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue > i17 * 1000 || z65.c.a()) {
            com.tencent.mars.xlog.Log.i(tag, "LiveIntervalLogUtil: ".concat(msg));
            hashMap.put(event, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
