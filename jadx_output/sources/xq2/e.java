package xq2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final xq2.e f456049a = new xq2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final xq2.b f456050b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f456051c;

    static {
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(xq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        f456050b = (xq2.b) a17;
        f456051c = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(vp2.c cardInfo) {
        kotlin.jvm.internal.o.g(cardInfo, "cardInfo");
        r45.le1 le1Var = cardInfo.f438910d;
        r45.wz2 wz2Var = le1Var.A;
        boolean z17 = wz2Var != null && wz2Var.f389592d;
        xq2.b bVar = f456050b;
        boolean z18 = bVar.f456040h > 0;
        java.lang.String str = le1Var.f379355o;
        com.tencent.mars.xlog.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: themeId=" + str + ", isCardEnablePreload=" + z17 + ", globalEnablePreload=" + z18);
        if (z17 && z18) {
            if (str == null || str.length() == 0) {
                return;
            }
            if (!bVar.P6(str, "")) {
                com.tencent.mars.xlog.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: do not need auto refresh, expired=" + bVar.O6(str) + ", themeId=" + str);
                return;
            }
            by1.d a17 = by1.c.f36353b.a().a("LiveThemeStream+".concat(str));
            aq2.e eVar = a17 instanceof aq2.e ? (aq2.e) a17 : null;
            if (eVar != null) {
                kotlinx.coroutines.f1 f1Var = eVar.f36363d;
                if (f1Var != null && f1Var.a()) {
                    com.tencent.mars.xlog.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: cache is loading, themeId=".concat(str));
                    return;
                }
            }
            java.util.HashMap hashMap = bVar.f456039g;
            java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
            long longValue = l17 != null ? l17.longValue() : 0L;
            long j17 = bVar.f456040h;
            if (longValue + j17 > java.lang.System.currentTimeMillis()) {
                com.tencent.mars.xlog.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: request too frequency, themeId=" + str + ", globalPrefetchInterval=" + j17);
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f456051c;
            java.lang.Object obj = concurrentHashMap.get(str);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(obj, bool)) {
                com.tencent.mars.xlog.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: is requesting, themeId=".concat(str));
                return;
            }
            concurrentHashMap.put(str, bool);
            hashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new xq2.d(str, cardInfo, null), 3, null);
        }
    }
}
