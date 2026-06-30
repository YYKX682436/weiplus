package dr0;

/* loaded from: classes12.dex */
public final class r2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.t2 f242520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f242521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f242522f;

    public r2(dr0.t2 t2Var, java.util.List list, boolean z17) {
        this.f242520d = t2Var;
        this.f242521e = list;
        this.f242522f = z17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post to ipc disconnect, proc=");
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193054b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", sb6.toString());
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCString(bm5.f1.a()), dr0.b1.class, new dr0.q2(countDownLatch));
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "wait push proc to unbind");
        try {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "await: " + countDownLatch.await((this.f242520d.f242553b ? 3 : 5) * 1000, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.InterruptedException unused) {
        }
        dr0.t2 t2Var = this.f242520d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = dr0.t2.f242551f;
        if (t2Var.a()) {
            dr0.a3.c(dr0.a3.f242403d.a());
            this.f242520d.c();
            dr0.x0.f242571a.b("recycle-" + this.f242520d.f242552a, "abort", "5");
            return;
        }
        dr0.p1 a17 = dr0.p1.f242489d.a();
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        a17.a(PROCESS_MAIN);
        dr0.t0 t0Var = dr0.t0.f242540k;
        t0Var.i().collectRecycleCount(this.f242520d.f242552a);
        t0Var.i().collectRecycleCost(java.lang.System.currentTimeMillis() - this.f242520d.f242555d);
        this.f242520d.f242555d = 0L;
        t0Var.h();
        com.tencent.mm.feature.performance.f3.f67570a.a(true);
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
        com.tencent.mm.booter.notification.l0.f63501a.c(-1, null);
        dr0.w1 w1Var = dr0.a3.f242403d;
        w1Var.a().getClass();
        if (this.f242520d.a()) {
            dr0.a3.c(w1Var.a());
            this.f242520d.c();
            dr0.x0.f242571a.b("recycle-" + this.f242520d.f242552a, "abort", "6");
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "No way to abort any more");
        dr0.x0.f242571a.b("recycle-" + this.f242520d.f242552a, "finish");
        if (this.f242520d.f242553b) {
            w1Var.a().q("完成回收... 1s");
            try {
                java.util.List<m3.d> procList = this.f242521e;
                kotlin.jvm.internal.o.f(procList, "$procList");
                for (m3.d dVar : procList) {
                    if (!kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w9.f193053a, dVar.f323093b) && !kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w9.f193054b, dVar.f323093b)) {
                        java.lang.Object obj2 = dVar.f323092a;
                        kotlin.jvm.internal.o.d(obj2);
                        int intValue = ((java.lang.Number) obj2).intValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(intValue));
                        java.lang.Object obj3 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/matrix/battery/accumulate/ProcLifeRecycler$RecycleTask$recycle$2$1", "onCallback", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(obj3, "com/tencent/mm/matrix/battery/accumulate/ProcLifeRecycler$RecycleTask$recycle$2$1", "onCallback", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    }
                }
                java.lang.Thread.sleep(1000L);
            } catch (java.lang.Exception unused2) {
            }
            com.tencent.mm.sdk.platformtools.o4.L().putInt("battery-accproclife-lastpid-recycle-test", android.os.Process.myPid());
        }
        com.tencent.mm.sdk.platformtools.o4.L().putInt("battery-accproclife-lastpid-recycle", android.os.Process.myPid());
        com.tencent.mm.sdk.platformtools.o4.L().putLong("battery-accproclife-suicide-last-ms", java.lang.System.currentTimeMillis());
        dr0.p1 a18 = dr0.p1.f242489d.a();
        int n17 = dr0.a3.f242403d.a().n();
        boolean z17 = this.f242522f;
        a18.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "#recycleMainPoc");
        if (z17 && !a18.f242493c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Manager", "skip recycle: non-quiet launching");
            return;
        }
        cr0.k4 k4Var = cr0.k4.f221669a;
        if (((java.lang.Boolean) cr0.k4.f221670b.getValue()).booleanValue() && com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("key_process_track_starting", true);
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.AppTask> appTasks = ((android.app.ActivityManager) systemService).getAppTasks();
        kotlin.jvm.internal.o.f(appTasks, "getAppTasks(...)");
        for (android.app.ActivityManager.AppTask appTask : appTasks) {
            android.content.ComponentName componentName = appTask.getTaskInfo().topActivity;
            if (kotlin.jvm.internal.o.b(componentName != null ? componentName.getClassName() : null, "com.tencent.mm.ui.LauncherUI")) {
                appTask.setExcludeFromRecents(true);
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Manager", "bye! mode=" + n17);
        if (n17 == 1) {
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj4 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj4, arrayList2.toArray(), "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(obj4, "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            return;
        }
        if (n17 != 2) {
            if (n17 == 3) {
                java.lang.Runtime.getRuntime().exit(0);
                return;
            } else if (n17 != 4) {
                java.lang.Runtime.getRuntime().exit(0);
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(dr0.n1.f242474d);
                return;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.lang.Object obj5 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj5, arrayList3.toArray(), "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(obj5, "com/tencent/mm/matrix/battery/accumulate/ProcLifeManager", "suicide", "(I)V", "java/lang/System_EXEC_", "exit", "(I)V");
        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
