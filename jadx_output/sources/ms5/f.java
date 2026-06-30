package ms5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ms5.f f331158a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f331159b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f331160c;

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f331161d;

    /* renamed from: e, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f331162e;

    /* renamed from: f, reason: collision with root package name */
    public static final ls5.a f331163f;

    static {
        ms5.f fVar = new ms5.f();
        f331158a = fVar;
        f331159b = new java.util.HashSet();
        f331160c = new java.util.HashMap();
        f331161d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c).plus(new kotlinx.coroutines.x0("page_event_detector_checker")));
        f331163f = new ls5.a();
        fVar.c("com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector");
        fVar.c("com.tencent.mm.plugin.finder.detector.FinderMMPlayerDetector");
        fVar.c("com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector");
    }

    public static final void d(final android.app.Activity activity, final androidx.lifecycle.o lifecycle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        lifecycle.a(new androidx.lifecycle.x(activity, lifecycle) { // from class: com.tencent.plugin.finder.detector.api.detect.PageEventDetectorManager$registerLifeCycle$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f215228d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.o f215229e;

            {
                this.f215229e = lifecycle;
                ms5.f fVar = ms5.f.f331158a;
                java.lang.String str = activity.getClass().getSimpleName() + '_' + activity.hashCode();
                this.f215228d = str;
                com.tencent.mars.xlog.Log.i("PageEventDetectorManager", "registerLifeCycle activityKey: " + str);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
            public final void onCreate() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate activityKey: ");
                java.lang.String str = this.f215228d;
                sb6.append(str);
                com.tencent.mars.xlog.Log.i("PageEventDetectorManager", sb6.toString());
                ms5.f.f331159b.add(str);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy activityKey: ");
                java.lang.String str = this.f215228d;
                sb6.append(str);
                com.tencent.mars.xlog.Log.i("PageEventDetectorManager", sb6.toString());
                ms5.f.f331159b.remove(str);
                this.f215229e.c(this);
            }
        });
    }

    public final void a(java.lang.String detectorSource) {
        org.json.JSONArray jSONArray;
        kotlin.jvm.internal.o.g(detectorSource, "detectorSource");
        ls5.a aVar = f331163f;
        synchronized (aVar.f321115d) {
            jSONArray = new org.json.JSONArray();
            java.util.Iterator it = aVar.f321115d.iterator();
            while (it.hasNext()) {
                jSONArray.put((java.lang.String) it.next());
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start checkDetect checkJob: ");
        kotlinx.coroutines.r2 r2Var = f331162e;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.A()) : null);
        sb6.append(" detectorSource: ");
        sb6.append(detectorSource);
        sb6.append(" traceDump: ");
        sb6.append(jSONArray);
        com.tencent.mars.xlog.Log.i("PageEventDetectorManager", sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = f331162e;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        f331162e = kotlinx.coroutines.l.d(f331161d, null, null, new ms5.e(detectorSource, jSONArray, null), 3, null);
    }

    public final java.lang.Object b(java.lang.Class cls) {
        kotlin.jvm.internal.o.g(cls, "cls");
        java.util.HashMap hashMap = f331160c;
        if (hashMap.get(cls) != null) {
            return hashMap.get(cls);
        }
        throw new java.lang.RuntimeException("current detector: " + cls.getSimpleName() + " need to register on init");
    }

    public final void c(java.lang.String str) {
        java.lang.Class<?> cls = java.lang.Class.forName(str);
        java.lang.Object newInstance = cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        f331160c.put(cls, newInstance);
    }
}
