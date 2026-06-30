package eo1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final eo1.a f255545a = new eo1.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f255546b = new java.util.HashMap(20);

    public final synchronized long a(long j17) {
        long longValue;
        java.util.HashMap hashMap = f255546b;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17));
        if (l17 == null) {
            longValue = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().h(j17).f215892i;
            com.tencent.mars.xlog.Log.i("AutoBackupPauseTimeCache", "[getRestartTime] restart time is " + longValue);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(longValue));
        } else {
            longValue = l17.longValue();
        }
        return longValue;
    }

    public final synchronized void b(long j17, long j18) {
        f255546b.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().m(j17, j18);
    }
}
