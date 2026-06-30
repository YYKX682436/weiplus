package i95;

/* loaded from: classes12.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static android.app.Application f289817a;

    /* renamed from: b, reason: collision with root package name */
    public static i95.y f289818b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.concurrent.ForkJoinPool f289819c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.ForkJoinPool f289820d;

    /* renamed from: e, reason: collision with root package name */
    public static final k95.a[] f289821e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean[] f289822f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f289823g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f289824h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean[] f289825i;

    /* renamed from: j, reason: collision with root package name */
    public static final boolean[] f289826j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f289827k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean[] f289828l;

    /* renamed from: m, reason: collision with root package name */
    public static final android.os.Handler f289829m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.ThreadLocal f289830n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.Runnable f289831o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Runnable f289832p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Runnable f289833q;

    /* renamed from: r, reason: collision with root package name */
    public static final android.app.Application.ActivityLifecycleCallbacks f289834r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.Map f289835s;

    static {
        java.lang.Runtime.getRuntime().availableProcessors();
        f289819c = null;
        f289820d = null;
        f289821e = new k95.a[]{null};
        f289822f = new boolean[]{false};
        f289823g = new java.util.LinkedHashSet(64);
        f289824h = false;
        f289825i = new boolean[]{false};
        f289826j = new boolean[]{false};
        f289827k = false;
        f289828l = new boolean[]{false};
        f289829m = new android.os.Handler(android.os.Looper.getMainLooper());
        f289830n = new java.lang.ThreadLocal();
        f289831o = new i95.a0();
        f289832p = new i95.b0();
        f289833q = new i95.c0();
        f289834r = new i95.e0();
        f289835s = new java.util.concurrent.ConcurrentHashMap(64);
    }

    public static void a(java.lang.Iterable iterable, i95.r rVar, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] preload feature service: '%s', dest_status: %s, wait: %s, callAccountInitNowIfPossible: %s", iterable, rVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.util.ArrayList arrayList = new java.util.ArrayList(512);
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i95.g0 g0Var = new i95.g0((fs.q) it.next(), th6, rVar, z18);
            if (z17) {
                arrayList.add(f289819c.submit((java.lang.Runnable) g0Var));
            } else {
                f289820d.execute(g0Var);
            }
        }
        if (z17) {
            l(arrayList, true);
        }
    }

    public static void b(java.lang.String str) {
        boolean[] zArr = f289822f;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (!zArr[0]) {
                throw new java.lang.IllegalStateException("please call initialize(...) first before " + str);
            }
        }
    }

    public static i95.m c(java.lang.Class cls) {
        b("calling getService(...)");
        return (i95.m) f(new i95.f0(cls, false));
    }

    public static void d(android.app.Application application, i95.y yVar, k95.a aVar) {
        boolean[] zArr = f289822f;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ServiceManager", "Already initialized.");
            } else {
                f289817a = application;
                java.util.Objects.requireNonNull(yVar);
                f289818b = yVar;
                i95.m0 m0Var = i95.m0.INSTANCE;
                f289819c = new java.util.concurrent.ForkJoinPool(6, m0Var, null, false);
                f289820d = new java.util.concurrent.ForkJoinPool(6, m0Var, null, false);
                k95.a[] aVarArr = f289821e;
                synchronized (aVarArr) {
                    aVarArr[0] = aVar;
                }
                if (com.tencent.mm.app.v5.a(f289817a) == com.tencent.mm.app.v5.f53851h) {
                    application.registerActivityLifecycleCallbacks(f289834r);
                    f289829m.post(f289831o);
                }
                zArr[0] = true;
            }
        }
    }

    public static void e(boolean z17, boolean z18) {
        boolean z19;
        boolean z27;
        boolean z28;
        b("calling initializeAccountForActivatedServices()");
        boolean[] zArr = f289826j;
        synchronized (zArr) {
            zArr[0] = false;
        }
        if (!z17) {
            b("isAccountInitialized");
            k95.a[] aVarArr = f289821e;
            synchronized (aVarArr) {
                ((com.tencent.mm.app.q0) aVarArr[0]).getClass();
                z27 = j62.e.g().c(new com.tencent.mm.repairer.config.fundation.RepairerConfigForceDelayFSAsyncPreload()) == 1;
            }
            if (!z27) {
                boolean[] zArr2 = f289828l;
                synchronized (zArr2) {
                    z28 = zArr2[0];
                }
                if (z28) {
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] initializeAccountForActivatedServices(%s,%s), delay actual works to stage after first screen or 5s later.", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            android.os.Handler handler = f289829m;
            java.lang.Runnable runnable = f289833q;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 5000L);
            com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] ASYNC preload onAccountInitialized() watchdog task posted.");
            return;
        }
        if (f289824h) {
            return;
        }
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.util.ArrayList arrayList = new java.util.ArrayList(128);
        java.util.Set set = f289823g;
        synchronized (set) {
            try {
                if (f289824h) {
                    return;
                }
                f289824h = true;
                java.util.Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i95.w wVar = (i95.w) it.next();
                    boolean[] zArr3 = f289826j;
                    synchronized (zArr3) {
                        z19 = zArr3[0];
                    }
                    if (z19) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ServiceManager", "[-] account release was notified, skip notifying account init for rest services.");
                        break;
                    } else if (!wVar.isTransitingToOrArrivedAt(i95.r.INITIALIZED)) {
                        i95.i0 i0Var = new i95.i0(wVar, th6, z18);
                        if (z18) {
                            arrayList.add(f289820d.submit((java.lang.Runnable) i0Var));
                        } else {
                            i0Var.run();
                        }
                    }
                }
                i95.j0 j0Var = new i95.j0(z18);
                if (z18) {
                    arrayList.add(f289820d.submit((java.lang.Runnable) j0Var));
                } else {
                    j0Var.run();
                }
                if (z18) {
                    l(arrayList, true);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] initializeAccountForActivatedServices actually executed.");
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(java.util.concurrent.Callable r6) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto Lb
            java.lang.Object r6 = r6.call()
            return r6
        Lb:
            i95.m0 r0 = i95.m0.INSTANCE
            java.lang.reflect.Field r0 = r0.f289815d
            java.lang.String r1 = "MicroMsg.ServiceManager"
            if (r0 != 0) goto L1d
            java.lang.String r0 = "[-] Fail to get Looper TLS field at last, invoke action without looper."
            com.tencent.mars.xlog.Log.e(r1, r0)
            java.lang.Object r6 = r6.call()
            return r6
        L1d:
            r2 = 0
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.ThreadLocal r3 = (java.lang.ThreadLocal) r3     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L33
            java.lang.ThreadLocal r4 = new java.lang.ThreadLocal     // Catch: java.lang.Throwable -> L3d
            r4.<init>()     // Catch: java.lang.Throwable -> L3d
            r0.set(r2, r4)     // Catch: java.lang.Throwable -> L30
            r3 = r4
            goto L33
        L30:
            r0 = move-exception
            r3 = r4
            goto L41
        L33:
            i95.k0 r0 = i95.k0.INSTANCE     // Catch: java.lang.Throwable -> L3d
            android.os.Looper r0 = r0.h()     // Catch: java.lang.Throwable -> L3d
            r3.set(r0)     // Catch: java.lang.Throwable -> L3d
            goto L4a
        L3d:
            r0 = move-exception
            goto L41
        L3f:
            r0 = move-exception
            r3 = r2
        L41:
            java.lang.String r4 = "[-] Fail to inject companion Looper."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L54
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> L54
            r3 = r2
        L4a:
            java.lang.Object r6 = r6.call()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L53
            r3.set(r2)
        L53:
            return r6
        L54:
            r6 = move-exception
            if (r3 == 0) goto L5a
            r3.set(r2)
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i95.n0.f(java.util.concurrent.Callable):java.lang.Object");
    }

    public static boolean g() {
        boolean z17;
        b("isAccountInitialized");
        k95.a[] aVarArr = f289821e;
        synchronized (aVarArr) {
            z17 = false;
            ((com.tencent.mm.app.q0) aVarArr[0]).getClass();
            if (gm0.j1.h() && gm0.j1.a()) {
                z17 = true;
            }
        }
        return z17;
    }

    public static boolean h(java.lang.Class cls) {
        boolean z17;
        java.util.Map map = f289835s;
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
        if (bool == null) {
            java.util.Iterator it = ((fs.c) fs.g.f(cls)).all().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (fs.g.e(f289817a, (fs.q) it.next())) {
                    z17 = true;
                    break;
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(cls, java.lang.Boolean.valueOf(z17));
            bool = java.lang.Boolean.valueOf(z17);
        }
        return bool.booleanValue();
    }

    public static void i() {
        b("calling notifyPreCreateForLegacyComponentServices()");
        java.lang.Iterable all = ((fs.c) fs.g.f(i95.x.class)).all();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(f289819c.submit((java.lang.Runnable) new i95.h0((fs.q) it.next())));
        }
        l(arrayList, true);
    }

    public static void j(i95.w wVar, i95.w wVar2, i95.r rVar, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        boolean z28;
        boolean z29;
        i95.r rVar2;
        boolean z37;
        android.app.Application application = f289817a;
        i95.y yVar = f289818b;
        java.util.concurrent.ForkJoinPool forkJoinPool = f289819c;
        i95.r rVar3 = i95.r.INACTIVE;
        i95.r rVar4 = i95.r.ACTIVATED;
        if (wVar2.transitLifecycleStatusOnDemand(application, yVar, forkJoinPool, wVar, rVar3, rVar4, z18, true, z19)) {
            java.util.Set set = f289823g;
            synchronized (set) {
                set.add(wVar2);
            }
        }
        boolean[] zArr = f289826j;
        synchronized (zArr) {
            z27 = zArr[0];
        }
        if (z27) {
            z28 = false;
        } else if (z18) {
            z28 = g();
        } else {
            synchronized (f289823g) {
                z37 = f289824h;
            }
            z28 = z37;
        }
        if (z28) {
            wVar2.transitLifecycleStatusOnDemand(f289817a, f289818b, f289820d, wVar, rVar4, rVar, z18, z17, z19);
            return;
        }
        synchronized (zArr) {
            z29 = zArr[0];
        }
        if (!z29 || rVar == (rVar2 = i95.r.INITIALIZED)) {
            return;
        }
        wVar2.transitLifecycleStatusOnDemand(f289817a, f289818b, f289819c, wVar, rVar2, rVar, z18, z17, z19);
    }

    public static void k(boolean z17) {
        b("calling preloadServicesWithAsyncMode()");
        boolean[] zArr = f289825i;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            i95.y yVar = f289818b;
            j95.a aVar = j95.a.ASYNC;
            yVar.getClass();
            a(new fs.e(((fs.c) fs.g.f(i95.w.class)).all(), new com.tencent.mm.app.o0((com.tencent.mm.app.p0) yVar, aVar)), i95.r.INITIALIZED, z17, false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:38:0x0049 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(java.util.Collection r3, boolean r4) {
        /*
            if (r4 == 0) goto L2e
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            r4.get()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
        L1b:
            boolean r0 = r4 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L2a
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L2a
            java.lang.Throwable r4 = r4.getCause()
            goto L1b
        L2a:
            if (r4 == 0) goto L2d
            r3 = r4
        L2d:
            throw r3
        L2e:
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
        L3e:
            r4.get()     // Catch: java.lang.Throwable -> L42
            goto L32
        L42:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L56
        L47:
            boolean r2 = r1 instanceof java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            java.lang.Throwable r2 = r1.getCause()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L56
            goto L47
        L56:
            r0 = move-exception
            goto L5c
        L58:
            if (r1 == 0) goto L5b
            r0 = r1
        L5b:
            throw r0     // Catch: java.lang.Throwable -> L56
        L5c:
            boolean r1 = r0 instanceof java.lang.InterruptedException
            if (r1 == 0) goto L61
            goto L3e
        L61:
            throw r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i95.n0.l(java.util.Collection, boolean):void");
    }
}
