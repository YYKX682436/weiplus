package cr0;

@j95.b
/* loaded from: classes12.dex */
public final class a5 extends i95.w implements com.tencent.mm.feature.performance.api.a, java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f221586e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f221587f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f221588g = jz5.h.a(jz5.i.f302829d, cr0.w4.f221804d);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg f221589d;

    public void Ai() {
        if (f221586e) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfilerFeatureService", "Enable pthread hook");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<cmd><diagnostic><PthreadHook\n enable='1' process='");
        sb6.append(com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : com.tencent.mm.sdk.platformtools.x2.j() ? "appbrand" : com.tencent.mm.sdk.platformtools.x2.s() ? "tools" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL);
        sb6.append("' duration='1' hook='.*\\.so$' thread='.*'/></diagnostic></cmd>");
        tp3.a.INSTANCE.d(sb6.toString());
        f221586e = true;
    }

    public jz5.l Bi(int i17) {
        java.lang.String java;
        com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg Ni = Ni(i17);
        if (Ni == null || (java = Ni.getJava()) == null) {
            return null;
        }
        q26.h hVar = new q26.h((q26.i) q26.h0.i(kz5.n0.J(r26.n0.f0(java, new java.lang.String[]{";"}, false, 0, 6, null)), cr0.x4.f221808d));
        if (hVar.hasNext()) {
            return pj.e.f354903a.b((java.lang.String) hVar.next());
        }
        return null;
    }

    public jz5.l Di(int i17) {
        java.lang.String str;
        int i18;
        com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg Ni = Ni(i17);
        if (Ni == null || (str = Ni.getNative()) == null) {
            return null;
        }
        q26.h hVar = new q26.h((q26.i) q26.h0.i(kz5.n0.J(r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null)), cr0.y4.f221813d));
        if (!hVar.hasNext()) {
            return null;
        }
        java.lang.String stackLine = (java.lang.String) hVar.next();
        kotlin.jvm.internal.o.g(stackLine, "stackLine");
        java.lang.String obj = r26.n0.u0(stackLine).toString();
        if (!r26.i0.A(obj, "#pc ", false, 2, null)) {
            return null;
        }
        if (!r26.i0.n(obj, ".so)", false) && !r26.n0.B(obj, ".so", false)) {
            return null;
        }
        java.lang.String substring = obj.substring(4);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        int L = r26.n0.L(substring, " ", 0, false, 6, null);
        if (L <= 0) {
            return null;
        }
        java.lang.String substring2 = substring.substring(0, L);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        int L2 = r26.n0.L(substring, ".so", 0, false, 6, null);
        int i19 = L + 1;
        if (L2 <= i19) {
            return null;
        }
        java.lang.String substring3 = substring.substring(i19, L2);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        int P = r26.n0.P(substring3, "/lib", 0, false, 6, null);
        if (P <= 0 || (i18 = P + 4) >= substring3.length()) {
            return null;
        }
        java.lang.String substring4 = substring3.substring(i18);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        return new jz5.l(substring4, substring2);
    }

    public com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg Ni(int i17) {
        java.lang.Object obj;
        boolean z17;
        java.util.Iterator it = Ri().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.ThreadMsg> threads = ((com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg) obj).getThreads();
            boolean z18 = false;
            if (threads != null) {
                if (!threads.isEmpty()) {
                    java.util.Iterator<T> it6 = threads.iterator();
                    while (it6.hasNext()) {
                        if (kotlin.jvm.internal.o.b(((com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.ThreadMsg) it6.next()).getTid(), java.lang.String.valueOf(i17))) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    z18 = true;
                }
            }
            if (z18) {
                break;
            }
        }
        return (com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg) obj;
    }

    public java.util.List Ri() {
        java.util.List F0;
        synchronized (this) {
            java.util.List[] listArr = new java.util.List[2];
            com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg iThreadProfiler$PthreadHookMsg = this.f221589d;
            listArr[0] = iThreadProfiler$PthreadHookMsg != null ? iThreadProfiler$PthreadHookMsg.getNotExited() : null;
            com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg iThreadProfiler$PthreadHookMsg2 = this.f221589d;
            listArr[1] = iThreadProfiler$PthreadHookMsg2 != null ? iThreadProfiler$PthreadHookMsg2.getNotReleased() : null;
            java.util.List<java.lang.Iterable> i17 = kz5.c0.i(listArr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Iterable iterable : i17) {
                if (iterable == null) {
                    iterable = kz5.p0.f313996d;
                }
                kz5.h0.u(arrayList, iterable);
            }
            F0 = kz5.n0.F0(arrayList, new cr0.z4());
        }
        return F0;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfilerFeatureService", "clear");
            this.f221589d = null;
            f221587f = false;
        }
    }

    public com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg wi() {
        java.lang.String v17;
        com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg iThreadProfiler$PthreadHookMsg;
        synchronized (this) {
            if (!f221586e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, unable");
                return this.f221589d;
            }
            if (this.f221589d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, caching");
                return this.f221589d;
            }
            wp3.b bVar = (wp3.b) tp3.a.INSTANCE.a(wp3.b.class);
            if (bVar != null && (v17 = bVar.v()) != null) {
                if (com.tencent.mm.vfs.w6.j(v17)) {
                    java.lang.String e17 = sp3.d.e(v17);
                    if (e17 != null) {
                        com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.Companion.getClass();
                        try {
                            iThreadProfiler$PthreadHookMsg = (com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg) new com.google.gson.i().b(e17, com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.class);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PthreadHookMsg", e18, "parse json failed", new java.lang.Object[0]);
                            iThreadProfiler$PthreadHookMsg = null;
                        }
                        if (iThreadProfiler$PthreadHookMsg != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, json updated");
                            this.f221589d = iThreadProfiler$PthreadHookMsg;
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, json not found");
                }
            }
            return this.f221589d;
        }
    }
}
