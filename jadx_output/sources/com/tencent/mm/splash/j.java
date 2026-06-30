package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public abstract class j {

    /* renamed from: c, reason: collision with root package name */
    public static android.app.Application f193644c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f193645d;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.splash.d f193646e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.splash.c f193647f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.splash.e f193648g;

    /* renamed from: l, reason: collision with root package name */
    public static com.tencent.mm.splash.w f193653l;

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.mm.splash.b f193655n;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Class f193657p;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Class f193659r;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f193642a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f193643b = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f193649h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f193650i = false;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f193651j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f193652k = false;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f193654m = false;

    /* renamed from: o, reason: collision with root package name */
    public static com.tencent.mm.splash.f f193656o = null;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Set f193658q = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.mm.splash.u f193660s = new com.tencent.mm.splash.u();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashSet f193661t = new java.util.HashSet();

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.splash.v f193662u = new com.tencent.mm.splash.i();

    public static void a() {
        d("WxSplash.Splash", "splash done, do finally things. ", new java.lang.Object[0]);
        f193650i = false;
        java.util.Set set = f193649h;
        int size = ((java.util.HashSet) set).size();
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.tencent.mm.splash.SplashActivity splashActivity = (com.tencent.mm.splash.SplashActivity) it.next();
            d("WxSplash.Splash", "iterate splash activity %s.", splashActivity);
            splashActivity.L6();
        }
        if (size == 0) {
            d("WxSplash.Splash", "no splash activity found, so we terminate hacked activities manually.", new java.lang.Object[0]);
            java.util.Iterator it6 = f193642a.iterator();
            while (it6.hasNext()) {
                h((com.tencent.mm.splash.SplashHackActivity) it6.next());
            }
        }
        d("WxSplash.Splash", "resend all %s pending message. ", java.lang.Integer.valueOf(f193643b.size()));
        if (!f193651j) {
            g();
        }
        f193653l = null;
        d("WxSplash.Splash", "we need splash no more.", new java.lang.Object[0]);
        synchronized (com.tencent.mm.splash.j.class) {
            f193654m = false;
        }
        com.tencent.mm.splash.u uVar = f193660s;
        if (uVar.f193688c > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - uVar.f193688c;
            if (com.tencent.mm.splash.g.f193641a) {
                uVar.a(676L, 1L, 1L);
                uVar.a(676L, 3L, currentTimeMillis);
            } else {
                uVar.a(676L, 0L, 1L);
                uVar.a(676L, 2L, currentTimeMillis);
            }
        }
    }

    public static boolean b() {
        boolean z17 = true;
        if ((!java.lang.String.valueOf(android.os.Build.MANUFACTURER).equalsIgnoreCase("oneplus")) && ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Ri()) {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.sdk.platformtools.o4.L().putInt("battery-accproclife-last-non-splash", android.os.Process.myPid());
        }
        return z17;
    }

    public static boolean c(android.app.Instrumentation instrumentation) {
        if (java.lang.Object.class != instrumentation.getClass().getSuperclass()) {
            java.lang.String canonicalName = instrumentation.getClass().getCanonicalName();
            if (canonicalName.startsWith("android.support.test") || canonicalName.startsWith("android.test")) {
                d("WxSplash.Splash", "android instrument test is running, do not need splash.", new java.lang.Object[0]);
                return true;
            }
        }
        return false;
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mm.splash.b bVar = f193655n;
        if (bVar != null) {
            ((com.tencent.mm.legacy.app.z) bVar).getClass();
            com.tencent.mars.xlog.Log.i(str, str2, objArr);
        }
    }

    public static void e(java.lang.Throwable th6, java.lang.String str) {
        com.tencent.mm.splash.b bVar = f193655n;
        if (bVar != null) {
            ((com.tencent.mm.legacy.app.z) bVar).getClass();
            com.tencent.mars.xlog.Log.printErrStackTrace("WxSplash.WeChatSplash", th6, str, new java.lang.Object[0]);
            if (str == null) {
                str = "";
            }
            f193660s.f193687b.add(str + "  " + android.util.Log.getStackTraceString(th6));
        }
    }

    public static java.lang.Object f(android.content.Context context) {
        java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        if (invoke != null) {
            return invoke;
        }
        java.lang.reflect.Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        java.lang.Object obj = field.get(context);
        java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static void g() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.AssertionError("replayPendingMessages() must be run in main thread. current thread: " + android.os.Looper.myLooper() + "(tid:" + android.os.Process.myTid() + ")");
        }
        java.util.ArrayList arrayList = f193643b;
        d("WxSplash.Splash", "Gonna replay %s pending message(s).", java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.splash.q.f193674b.handleMessage((android.os.Message) it.next());
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r3.exported == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.tencent.mm.splash.SplashHackActivity r7) {
        /*
            java.lang.String r0 = r7.f193635d
            com.tencent.mm.splash.c r1 = com.tencent.mm.splash.j.f193647f
            r2 = 0
            if (r1 == 0) goto L7b
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r3 = "eatActivity %s"
            java.lang.String r4 = "MicroMsg.PreventAccountNotReady"
            com.tencent.mars.xlog.Log.i(r4, r3, r1)
            r1 = 1
            boolean r3 = com.tencent.mm.legacy.app.w.a(r1)
            if (r3 == 0) goto L1a
            goto L7b
        L1a:
            if (r0 == 0) goto L7b
            java.util.HashSet r3 = com.tencent.mm.legacy.app.w.f68527b
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L2f
            java.lang.String r2 = "protect this activity %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.w(r4, r2, r0)
            goto L71
        L2f:
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            gm0.a0 r5 = gm0.j1.p()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            km0.b r5 = r5.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            km0.c r5 = (km0.c) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r5.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.x2.f193072b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r3.<init>(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            gm0.a0 r5 = gm0.j1.p()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            km0.b r5 = r5.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            km0.c r5 = (km0.c) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.app.Application r5 = r5.f308989c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r3 = r5.getActivityInfo(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r3 == 0) goto L7b
            java.lang.String r5 = "%s info.exported = %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r6[r2] = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            boolean r0 = r3.exported     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r6[r1] = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            com.tencent.mars.xlog.Log.i(r4, r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            boolean r0 = r3.exported     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r0 != 0) goto L7b
        L71:
            r2 = r1
            goto L7b
        L73:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r0, r1, r3)
        L7b:
            java.lang.String r0 = "WxSplash.Splash"
            if (r2 != 0) goto L8e
            r7.recreate()
            java.lang.String r7 = r7.f193635d
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "do recreate for %s"
            d(r0, r1, r7)
            goto L9c
        L8e:
            r7.finish()
            java.lang.String r7 = r7.f193635d
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "eat activity, %s"
            d(r0, r1, r7)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.splash.j.h(com.tencent.mm.splash.SplashHackActivity):void");
    }

    public static void i() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityManagerNative");
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("getDefault", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(cls, new java.lang.Object[0]);
            if (invoke != null) {
                d("WxSplash.Splash", "getDefault %s", invoke);
                if (invoke.getClass().getCanonicalName().startsWith("com.morgoo.droidplugin")) {
                    f193660s.a(675L, 33L, 1L);
                    d("WxSplash.Splash", "found using droidplugin", new java.lang.Object[0]);
                }
                if (java.lang.reflect.Proxy.isProxyClass(invoke.getClass())) {
                    d("WxSplash.Splash", "found ActivityManager is a Proxy class, " + invoke.getClass(), new java.lang.Object[0]);
                }
            }
        } catch (java.lang.Exception e17) {
            e(e17, "validateEnvironment found some thing.");
        }
    }

    public static boolean j() {
        android.os.Handler.Callback callback;
        java.lang.Throwable th6;
        boolean z17 = false;
        android.os.Message message = null;
        try {
            callback = (android.os.Handler.Callback) com.tencent.mm.splash.q.f193678f.get(com.tencent.mm.splash.q.f193674b);
            try {
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                e(th6, "validate hack exception.");
                d("WxSplash.Splash", "double check, result: %s, last callback %s", java.lang.Boolean.valueOf(z17), callback);
                return z17;
            }
        } catch (java.lang.Throwable th8) {
            callback = null;
            th6 = th8;
        }
        if (callback != com.tencent.mm.splash.q.f193677e) {
            if (callback != null) {
                try {
                    message = android.os.Message.obtain(com.tencent.mm.splash.q.f193674b, 987654321);
                    message.obj = com.tencent.mm.splash.q.f193677e;
                    callback.handleMessage(message);
                    if (message.arg2 == 1) {
                        message.recycle();
                    } else {
                        message.recycle();
                    }
                } catch (java.lang.Throwable th9) {
                    message.recycle();
                    throw th9;
                }
            }
            d("WxSplash.Splash", "double check, result: %s, last callback %s", java.lang.Boolean.valueOf(z17), callback);
            return z17;
        }
        z17 = true;
        d("WxSplash.Splash", "double check, result: %s, last callback %s", java.lang.Boolean.valueOf(z17), callback);
        return z17;
    }

    public static void k(android.app.Instrumentation instrumentation) {
        if (instrumentation == null) {
            throw new java.lang.NullPointerException("Instrumentation original should not be null.");
        }
        if (java.lang.Object.class != instrumentation.getClass().getSuperclass()) {
            com.tencent.mm.splash.u uVar = f193660s;
            uVar.a(675L, 7L, 1L);
            d("WxSplash.Splash", "Instrumentation original's super class is not Object, maybe hacked by others. orig: %s, super: %s.", instrumentation.getClass(), instrumentation.getClass().getSuperclass());
            java.lang.String canonicalName = instrumentation.getClass().getCanonicalName();
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("invalid environment for hack, " + instrumentation.getClass());
            if (canonicalName.startsWith(new java.lang.String[]{"com.excelliance", "com.lbe", "com.beike", "com.lody", "com.doubleagent", "com.svm", "com.morgoo"}[0])) {
                uVar.a(675L, 30L, 1L);
                d("WxSplash.Splash", "invalid environment for hack, dual open.", new java.lang.Object[0]);
            }
            uVar.a(675L, 0, 1L);
            throw runtimeException;
        }
    }
}
