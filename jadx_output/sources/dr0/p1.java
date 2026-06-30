package dr0;

/* loaded from: classes12.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.h1 f242489d = new dr0.h1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f242490e = jz5.h.a(jz5.i.f302829d, dr0.g1.f242427d);

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f242491a = jz5.h.b(dr0.j1.f242439d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f242492b = jz5.h.a(jz5.i.f302829d, dr0.l1.f242459d);

    /* renamed from: c, reason: collision with root package name */
    public boolean f242493c = true;

    public p1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String procName) {
        kotlin.jvm.internal.o.g(procName, "procName");
        if (!kotlin.jvm.internal.o.b(bm5.f1.a(), procName)) {
            com.tencent.mm.ipcinvoker.p pVar = (com.tencent.mm.ipcinvoker.p) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.ipcinvoker.q.b().f68390c).get(procName);
            if (pVar != null && pVar.f68383c) {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.Manager", "wait for connecting");
                try {
                    java.lang.Thread.sleep(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Manager", "ipc disconnect, proc=" + procName + ", from=" + bm5.f1.a());
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        b17.getClass();
        if (!((com.tencent.mm.ipcinvoker.y.b(procName) || ((java.util.concurrent.ConcurrentHashMap) b17.f68390c).get(procName) == null) ? false : true)) {
            com.tencent.mm.ipcinvoker.q.b().c(procName);
        }
        synchronized (l85.s0.f317208d) {
            com.tencent.mars.xlog.Log.w("MicoMsg.proc.ServiceConnection", "detach all service conn to proc: ".concat(procName));
            java.util.List list = (java.util.List) ((java.util.HashMap) l85.s0.f317209e.getValue()).get(procName);
            if (list != null) {
                kz5.h0.B(list, l85.p0.f317203d);
            }
        }
        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w9.f193053a, procName)) {
            j45.l.D(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.NotifyService.class));
            j45.l.D(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.service.ProcessService$MMProcessService.class));
        }
        java.util.Map map = ri.a.f395832a;
        com.tencent.mars.xlog.Log.w("Matrix.battery.AmsInvokeListener", "#unbindProcess, proc=".concat(procName));
        java.util.Map map2 = ri.a.f395832a;
        synchronized (map2) {
            java.util.List<android.util.Pair> list2 = (java.util.List) ((java.util.LinkedHashMap) map2).get(procName);
            if (list2 != null && !list2.isEmpty()) {
                synchronized (list2) {
                    try {
                        for (android.util.Pair pair : list2) {
                            android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) ((java.lang.ref.WeakReference) pair.second).get();
                            com.tencent.mars.xlog.Log.w("Matrix.battery.AmsInvokeListener", "unbind service conn: " + ((java.lang.String) pair.first) + "@" + serviceConnection + ", proc=" + procName);
                            if (serviceConnection != null) {
                                try {
                                    com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(serviceConnection);
                                } catch (java.lang.Throwable th6) {
                                    com.tencent.mars.xlog.Log.w("Matrix.battery.AmsInvokeListener", "unbindService failed: " + th6.getMessage());
                                }
                            }
                            try {
                                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.Class.forName((java.lang.String) pair.first)));
                            } catch (java.lang.Throwable th7) {
                                com.tencent.mars.xlog.Log.w("Matrix.battery.AmsInvokeListener", "stopService failed: " + th7.getMessage());
                            }
                        }
                        list2.clear();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("Matrix.battery.AmsInvokeListener", "modify err: " + e17.getMessage());
                    }
                }
            }
        }
    }

    public final android.app.ApplicationExitInfo b(java.lang.String procName, int i17) {
        kotlin.jvm.internal.o.g(procName, "procName");
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                return null;
            }
            java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(com.tencent.mm.sdk.platformtools.x2.f193072b, i17, 0);
            kotlin.jvm.internal.o.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
            for (android.app.ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                if (kotlin.jvm.internal.o.b(applicationExitInfo.getProcessName(), procName)) {
                    return applicationExitInfo;
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.util.List c() {
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(com.tencent.mm.sdk.platformtools.x2.f193072b, 0, 0);
                kotlin.jvm.internal.o.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
                return historicalProcessExitReasons;
            }
        } catch (java.lang.Exception unused) {
        }
        return kz5.p0.f313996d;
    }

    public final java.util.List d(java.lang.String procName) {
        kotlin.jvm.internal.o.g(procName, "procName");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.util.List c17 = c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : c17) {
                if (kotlin.jvm.internal.o.b(((android.app.ApplicationExitInfo) obj).getProcessName(), procName)) {
                    arrayList.add(obj);
                }
            }
            return kz5.n0.S0(arrayList);
        }
        java.util.List c18 = c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : c18) {
            android.app.ApplicationExitInfo applicationExitInfo = (android.app.ApplicationExitInfo) obj2;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                throw new java.lang.IllegalStateException("Stub!");
            }
            if (kotlin.jvm.internal.o.b(applicationExitInfo.getProcessName(), procName)) {
                arrayList2.add(obj2);
            }
        }
        return kz5.n0.S0(arrayList2);
    }

    public final int e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("usagestats");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            android.app.usage.UsageStatsManager usageStatsManager = (android.app.usage.UsageStatsManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return usageStatsManager.getAppStandbyBucket();
            }
            return -1;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public final java.util.List f() {
        return (java.util.List) ((jz5.n) this.f242491a).getValue();
    }

    public final java.util.List g(android.content.Context context) {
        kz5.p0 p0Var = kz5.p0.f313996d;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
            return runningAppProcesses == null ? p0Var : runningAppProcesses;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "getRunningTasks err: " + e17.getMessage());
            return p0Var;
        }
    }

    public final java.util.List h(android.content.Context context) {
        kz5.p0 p0Var = kz5.p0.f313996d;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) systemService).getRunningTasks(Integer.MAX_VALUE);
            return runningTasks == null ? p0Var : runningTasks;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "getRunningTasks err: " + e17.getMessage());
            return p0Var;
        }
    }

    public final boolean i(android.content.Context context) {
        int e17;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("usagestats");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            return ((android.app.usage.UsageStatsManager) systemService).isAppInactive(context.getPackageName());
        } catch (java.lang.Exception unused) {
            return android.os.Build.VERSION.SDK_INT >= 28 && (e17 = e(context)) >= 0 && e17 >= 40;
        }
    }

    public final boolean j(java.lang.String procName) {
        kotlin.jvm.internal.o.g(procName, "procName");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.d(context);
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(context)).iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(procName, ((m3.d) it.next()).f323093b)) {
                return true;
            }
        }
        return false;
    }

    public final void k(boolean z17) {
        if (z17) {
            cr0.k4 k4Var = cr0.k4.f221669a;
            if (((java.lang.Boolean) cr0.k4.f221670b.getValue()).booleanValue() && com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.sdk.platformtools.o4.L().putBoolean("key_process_track_starting", true);
            }
        } else {
            cr0.k4.f221669a.a();
        }
        l(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "notify other proc to update mainProcStandby: " + z17);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.List n17 = sh.c.n(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curr proc count=");
        java.util.ArrayList arrayList = (java.util.ArrayList) n17;
        sb6.append(arrayList.size());
        sb6.append(", list=");
        sb6.append(n17);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (!kotlin.jvm.internal.o.b(bm5.f1.a(), dVar.f323093b)) {
                com.tencent.mm.ipcinvoker.d0.d((java.lang.String) dVar.f323093b, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), dr0.c1.class, null);
            }
        }
    }

    public final void l(boolean z17) {
        if (!z17 || dr0.a3.f242403d.a().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "#updateMainProcStandbyLocal: " + z17);
            com.tencent.mm.sdk.platformtools.x2.f193077g = z17;
            synchronized (f()) {
                if (!f().isEmpty()) {
                    ((ku5.t0) ku5.t0.f312615d).g(new dr0.o1(this, z17));
                }
            }
        }
    }

    public final void m(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "#updateQuietLaunchingDirectly: " + z17);
            this.f242493c = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "notify other proc to update quietLaunch: " + z17);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.util.List n17 = sh.c.n(context);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curr proc count=");
            java.util.ArrayList arrayList = (java.util.ArrayList) n17;
            sb6.append(arrayList.size());
            sb6.append(", list=");
            sb6.append(n17);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", sb6.toString());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m3.d dVar = (m3.d) it.next();
                if (!kotlin.jvm.internal.o.b(bm5.f1.a(), dVar.f323093b)) {
                    com.tencent.mm.ipcinvoker.d0.d((java.lang.String) dVar.f323093b, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), dr0.f1.class, null);
                }
            }
        }
    }
}
