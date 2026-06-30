package sp2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static r45.dc4 f410973b;

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.b f410972a = new sp2.b();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f410974c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static long f410975d = 1200000;

    /* renamed from: e, reason: collision with root package name */
    public static int f410976e = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();

    public final long a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = f410974c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        return ((sp2.a) obj).f410954a;
    }

    public final r45.dc4 b() {
        if (f410973b == null) {
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_LAST_SQUARE_STATUS_STRING_SYNC, "");
            kotlin.jvm.internal.o.d(v17);
            if (v17.length() == 0) {
                return null;
            }
            try {
                r45.dc4 dc4Var = new r45.dc4();
                dc4Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
                f410973b = dc4Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("CacheUtils", e17, "get lastSquareStatus", new java.lang.Object[0]);
            }
        }
        return f410973b;
    }

    public final java.lang.Boolean c(int i17, java.lang.String key, long j17) {
        r45.bk2 bk2Var;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = f410974c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        r45.dk2 dk2Var = ((sp2.a) obj).f410955b;
        if (dk2Var == null || (bk2Var = (r45.bk2) dk2Var.getCustom(16)) == null) {
            return null;
        }
        int integer = i17 != 2 ? i17 != 3 ? bk2Var.getInteger(3) : bk2Var.getInteger(4) : bk2Var.getInteger(5);
        long currentTimeMillis = (i17 == 2 || i17 == 3) ? java.lang.System.currentTimeMillis() - a(key) : java.lang.System.currentTimeMillis() - j17;
        com.tencent.mars.xlog.Log.i("CacheUtils", "isLargeExitEntranceTimeOut type: " + i17 + " offestTime: " + currentTimeMillis + " maxTime: " + integer);
        if (integer == 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(currentTimeMillis > ((long) (integer * 1000)));
    }

    public final void d(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = f410974c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        ((sp2.a) obj).f410962i = i17;
    }
}
