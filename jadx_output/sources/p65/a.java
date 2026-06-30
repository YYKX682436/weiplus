package p65;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f352439a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public km0.c f352440b = null;

    public static void c(android.content.Context context) {
        fp.d0.o("stlport_shared");
        fp.d0.o("c++_shared");
        fp.d0.o("cxxstl.200");
    }

    public final com.tencent.mm.booter.s a(android.app.Application application) {
        com.tencent.mm.booter.s b17 = com.tencent.mm.booter.s.b(application);
        this.f352440b.f308992f = b17;
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            if (application instanceof com.tencent.mm.app.Application) {
                ((com.tencent.mm.app.Application) application).markDisallowToCallGetBaseContextInAttachBaseContext();
            } else if (application instanceof com.tencent.mm.app.GPApplication) {
                ((com.tencent.mm.app.GPApplication) application).markDisallowToCallGetBaseContextInAttachBaseContext();
            }
        }
        return b17;
    }

    public final void b(android.app.Application application) {
        java.lang.Object invoke;
        android.content.Context baseContext;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.content.Context _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking = application instanceof com.tencent.mm.app.Application ? ((com.tencent.mm.app.Application) application)._doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking() : application instanceof com.tencent.mm.app.GPApplication ? ((com.tencent.mm.app.GPApplication) application)._doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking() : application.getBaseContext();
        while ((_doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking).getBaseContext()) != null) {
            _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking = baseContext;
        }
        try {
            try {
                java.lang.reflect.Field declaredField = _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking.getClass().getDeclaredField("mPackageInfo");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(_doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking);
                java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod("getResources", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mApplication");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, application);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseStartupRoutine", "[+] Inject app instance into LoadedApk done.");
            } finally {
                try {
                    java.lang.reflect.Field declaredField3 = _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking.getClass().getDeclaredField("mMainThread");
                    declaredField3.setAccessible(true);
                    invoke = declaredField3.get(_doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking);
                } catch (java.lang.Throwable unused) {
                    java.lang.reflect.Method declaredMethod2 = java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new java.lang.Class[0]);
                    declaredMethod2.setAccessible(true);
                    invoke = declaredMethod2.invoke(null, new java.lang.Object[0]);
                }
                java.lang.reflect.Field declaredField4 = invoke.getClass().getDeclaredField("mInitialApplication");
                declaredField4.setAccessible(true);
                declaredField4.set(invoke, application);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseStartupRoutine", "[+] Inject app instance into ActivityThread done.");
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseStartupRoutine", "[+] injectAppInstanceForEarlyFetching() costs %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            try {
                java.lang.reflect.Field declaredField32 = _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking.getClass().getDeclaredField("mMainThread");
                declaredField32.setAccessible(true);
                invoke = declaredField32.get(_doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking);
                java.lang.reflect.Field declaredField42 = invoke.getClass().getDeclaredField("mInitialApplication");
                declaredField42.setAccessible(true);
                declaredField42.set(invoke, application);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseStartupRoutine", "[+] Inject app instance into ActivityThread done.");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseStartupRoutine", th6, "[-] Fail to inject app instance into ActivityThread.", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseStartupRoutine", "[+] injectAppInstanceForEarlyFetching() costs %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseStartupRoutine", "[+] injectAppInstanceForEarlyFetching() costs %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void d() {
        android.app.Application a17 = com.tencent.mm.sdk.platformtools.i.a();
        if (com.tencent.mm.app.v5.a(a17).f53869f) {
            if (android.os.Build.MANUFACTURER.equals("samsung") && android.os.Build.VERSION.SDK_INT <= 24) {
                a17.registerActivityLifecycleCallbacks(new um0.d(a17));
            }
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        }
        boolean z17 = com.tencent.mm.matrix.l.f68722a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixDelegate", "onAppCreate");
        try {
            com.tencent.matrix.lifecycle.g0.a(a17, ir0.f.f293927a);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MatrixDelegate", th6, "init Matrix-lifecycle failed", new java.lang.Object[0]);
            ((java.util.ArrayList) com.tencent.mm.matrix.l.f68723b).add(new com.tencent.mm.matrix.n(24556, 110, bm5.f1.a() + " - " + android.util.Log.getStackTraceString(th6)));
        }
    }

    public abstract void e(android.app.Application application);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x077d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0820 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0470 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList f(final android.app.Application r15) {
        /*
            Method dump skipped, instructions count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p65.a.f(android.app.Application):java.util.ArrayList");
    }

    public void g(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((wu5.c) it.next()).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseStartupRoutine", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
