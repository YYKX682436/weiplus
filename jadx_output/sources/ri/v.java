package ri;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f396009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.health.HealthStats f396011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, long j18, android.os.health.HealthStats healthStats) {
        super(1);
        this.f396009d = j17;
        this.f396010e = j18;
        this.f396011f = healthStats;
    }

    public static final long a(android.os.health.HealthStats healthStats) {
        return ri.b0.b(healthStats, 30001) + ri.b0.b(healthStats, 30002);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map<java.lang.String, android.os.health.HealthStats> map;
        java.util.Map myDict = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(myDict, "myDict");
        myDict.put("uid-load", java.lang.Long.valueOf(a06.d.c((((float) this.f396009d) * 100.0f) / ((float) this.f396010e))));
        android.os.health.HealthStats healthStats = this.f396011f;
        kotlin.jvm.internal.o.g(healthStats, "<this>");
        if (healthStats.hasStats(10014)) {
            map = healthStats.getStats(10014);
            kotlin.jvm.internal.o.f(map, "getStats(...)");
        } else {
            map = kz5.q0.f314001d;
        }
        java.util.Iterator<T> it = map.values().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += a((android.os.health.HealthStats) it.next());
        }
        if (j17 > 0) {
            int i17 = 0;
            for (java.lang.Object obj2 : kz5.c1.q(kz5.n0.F0(kz5.e1.v(map), new ri.u())).entrySet()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                java.lang.String str = (java.lang.String) entry.getKey();
                android.os.health.HealthStats healthStats2 = (android.os.health.HealthStats) entry.getValue();
                java.lang.String g17 = ri.i.g(str);
                kotlin.jvm.internal.o.f(g17, "getProcSuffix(...)");
                myDict.put("ratio-top-" + i18, g17);
                myDict.put("ratio-" + ri.i.g(str), java.lang.Long.valueOf(a06.d.c((((float) a(healthStats2)) * 100.0f) / ((float) j17))));
                i17 = i18;
            }
        }
        return jz5.f0.f302826a;
    }
}
