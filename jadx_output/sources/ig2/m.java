package ig2;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f291395c;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f291397e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f291398f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f291399g;

    /* renamed from: a, reason: collision with root package name */
    public static final ig2.m f291393a = new ig2.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f291394b = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f291396d = true;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f291400h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f291401i = new java.util.HashMap();

    public final ig2.h a(long j17) {
        java.util.HashMap hashMap = f291401i;
        ig2.j jVar = (ig2.j) hashMap.get(java.lang.Long.valueOf(j17));
        boolean z17 = false;
        if (ig2.e.f291372a.c()) {
            if ((jVar != null ? jVar.f291409h : null) != null) {
                mn0.b0 b0Var = jVar.f291409h;
                kotlin.jvm.internal.o.d(b0Var);
                if (((mn0.y) b0Var).b(false) && !jVar.f291387l && f291395c) {
                    z17 = true;
                }
            }
        }
        ig2.h hVar = new ig2.h(j17, z17, jVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" checkAutoPlay feedId: ");
        sb6.append(j17);
        sb6.append("  canReusePlayer:");
        sb6.append(z17);
        sb6.append("  isFloatWindow: ");
        sb6.append(jVar != null ? java.lang.Boolean.valueOf(jVar.f291387l) : null);
        sb6.append("  feedId= ");
        sb6.append(j17);
        sb6.append(" map = ");
        sb6.append(hashMap);
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", sb6.toString());
        return hVar;
    }

    public final void b(ig2.r rVar) {
        mn0.b0 b0Var;
        boolean z17 = rVar instanceof ig2.i ? ((ig2.i) rVar).c().f291387l : false;
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "checkDirectorPlayerStop releaseDirector: " + rVar + " isFloatWindow: " + z17 + " isLiveRoomOnDestroy: " + f291396d + " isDetach: " + rVar.i());
        if (z17) {
            return;
        }
        if (rVar instanceof ig2.f) {
            mn0.b0 b0Var2 = ((ig2.f) rVar).f291373d.f326227z;
            if (b0Var2 != null) {
                mn0.b0.C(b0Var2, true, false, false, 6, null);
            }
        } else {
            ig2.n c17 = rVar.c();
            if (c17 != null && (b0Var = c17.f291409h) != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
        }
        rVar.h();
    }

    public final void c() {
        java.util.HashMap hashMap = f291401i;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "clearFluentExitLiveRoomPlayerList feedId:" + ((ig2.j) entry.getValue()).f291403b + " player:" + ((ig2.j) entry.getValue()).f291409h);
            mn0.b0 b0Var = ((ig2.j) entry.getValue()).f291409h;
            if (b0Var != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
        }
        hashMap.clear();
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList exitParamsSize: ");
        sb6.append(f291401i.size());
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap = f291400h;
        sb6.append(hashMap.size());
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", sb6.toString());
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            f291393a.b((ig2.r) ((java.util.Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
        c();
    }

    public final void e(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList feedId: ");
        sb6.append(j17);
        sb6.append(" exitParamsSize: ");
        java.util.HashMap hashMap = f291401i;
        sb6.append(hashMap);
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap2 = f291400h;
        sb6.append(hashMap2);
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", sb6.toString());
        ig2.r rVar = (ig2.r) hashMap2.remove(java.lang.Long.valueOf(j17));
        if (rVar != null) {
            f291393a.b(rVar);
        }
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    public final ig2.r f(long j17) {
        return (ig2.r) f291400h.get(java.lang.Long.valueOf(j17));
    }

    public final void g() {
        ig2.e eVar;
        mn0.b0 b0Var;
        mn0.b0 b0Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release size:");
        java.util.HashMap hashMap = f291400h;
        sb6.append(hashMap.size());
        sb6.append(' ');
        sb6.append(hashMap);
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", sb6.toString());
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = ig2.e.f291372a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            ((java.lang.Number) entry.getKey()).longValue();
            ig2.r rVar = (ig2.r) entry.getValue();
            boolean z17 = rVar instanceof ig2.i ? ((ig2.i) rVar).c().f291387l : false;
            com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "square exit start releaseDirector: " + rVar + " isFloatWindow: " + z17 + " isLiveRoomOnDestroy: " + f291396d + " isDetach: " + rVar.i());
            if (!z17 && eVar.c() && (f291396d || !rVar.i())) {
                if (rVar instanceof ig2.f) {
                    mn0.b0 b0Var3 = ((ig2.f) rVar).f291373d.f326227z;
                    if (b0Var3 != null) {
                        mn0.b0.C(b0Var3, true, false, false, 6, null);
                    }
                } else {
                    ig2.n c17 = rVar.c();
                    if (c17 != null && (b0Var2 = c17.f291409h) != null) {
                        mn0.b0.C(b0Var2, true, false, false, 6, null);
                    }
                }
                rVar.h();
            }
        }
        hashMap.clear();
        java.util.HashMap hashMap2 = f291401i;
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            ((java.lang.Number) entry2.getKey()).longValue();
            ig2.j jVar = (ig2.j) entry2.getValue();
            com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "square exit start releaseParams: " + jVar + " isFloatWindow: " + jVar + ".isFloatWindow isLiveRoomOnDestory: " + f291396d);
            if (!jVar.f291387l && eVar.c() && f291396d && (b0Var = jVar.f291409h) != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
        }
        hashMap2.clear();
    }

    public final ig2.r h(long j17, boolean z17) {
        ig2.r rVar = (ig2.r) f291400h.get(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "recordFluentSwitchInRoomPlayer feedId:" + j17 + " director:" + rVar);
        if (rVar instanceof ig2.i) {
            ig2.i iVar = (ig2.i) rVar;
            iVar.c();
            f291401i.put(java.lang.Long.valueOf(j17), iVar.c());
        }
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "getSwitchInLiveRoomDirector feedId:" + j17 + " checkDetach:" + z17 + " director:" + rVar);
        boolean z18 = false;
        if (rVar != null && rVar.i()) {
            z18 = true;
        }
        if (z18 && z17) {
            return null;
        }
        return rVar;
    }

    public final ig2.r i(android.content.Context context, ig2.n params) {
        ig2.r iVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        long j17 = params.f291403b;
        boolean z17 = params instanceof ig2.g;
        if (z17) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
            iVar = new ig2.f(applicationContext);
        } else {
            android.content.Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext2, "getApplicationContext(...)");
            iVar = new ig2.i(applicationContext2);
        }
        ig2.r rVar = iVar;
        rVar.e(params);
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "startSwitchOutFromSquare feedId: " + j17 + " director: " + rVar + ' ');
        g();
        f291400h.put(java.lang.Long.valueOf(j17), rVar);
        ez2.f fVar = ez2.f.f257898e;
        ez2.a aVar = ez2.a.f257855d;
        ez2.a aVar2 = params.f291402a;
        ez2.g.f257902a = new ez2.e(j17, fVar, aVar2 == aVar ? ez2.d.f257871g : z17 ? ez2.d.f257873i : aVar2 == ez2.a.f257864p ? ez2.d.f257874m : ez2.d.f257875n, aVar2.ordinal(), (16 & 16) != 0 ? -1L : 0L);
        return rVar;
    }
}
