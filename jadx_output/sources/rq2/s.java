package rq2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static long f398880b;

    /* renamed from: c, reason: collision with root package name */
    public static long f398881c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f398882d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f398883e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f398884f;

    /* renamed from: i, reason: collision with root package name */
    public static long f398887i;

    /* renamed from: j, reason: collision with root package name */
    public static long f398888j;

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.s f398879a = new rq2.s();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f398885g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f398886h = new java.util.HashSet();

    public final boolean a() {
        return ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(c92.g.f39738a.b() ? "FinderLiveEntrance" : "NearbyEntrance") != null;
    }

    public final rq2.q b(int i17) {
        return (rq2.q) f398885g.get(java.lang.Integer.valueOf(i17));
    }

    public final void c(boolean z17, boolean z18) {
        f398882d = z17;
        f398880b = c01.id.c();
        f398883e = !z18 && a();
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "saveClickEnterTime isFromClick : " + z17 + " isFromRedClick: " + f398883e + " isFromNearby: " + z18);
    }

    public final void d(int i17, int i18, java.lang.String tabName) {
        long c17;
        kotlin.jvm.internal.o.g(tabName, "tabName");
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "checkPullType: " + i17);
        boolean z17 = (i17 == 1 || i17 == 0) ? false : true;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f398885g;
        if (z17) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i18));
            return;
        }
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(i18))) {
            rq2.q qVar = new rq2.q();
            qVar.f398869j = i18;
            qVar.f398868i = i17;
            qVar.f398870k = tabName;
            concurrentHashMap.put(java.lang.Integer.valueOf(i18), qVar);
        }
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickReportStart pullTypeParams: " + i17 + " tabType: " + i18 + " tabName: " + tabName);
        rq2.q b17 = b(i18);
        if (b17 != null) {
            if (i17 == 0) {
                c17 = f398880b;
            } else {
                f398882d = false;
                f398883e = false;
                c17 = c01.id.c();
            }
            b17.f398860a = c17;
        }
    }
}
