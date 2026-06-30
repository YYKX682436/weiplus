package dr0;

/* loaded from: classes11.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.n1 f242474d = new dr0.n1();

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
            try {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.Manager", "skip suicide: we're on foreground when suicide message was handled.");
                dr0.p1.f242489d.a().k(false);
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.proc.Manager", th6, "exception occurred.", new java.lang.Object[0]);
                return;
            }
        }
        ((bt.b1) k35.p.f303943a).getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAppMgr", "on kill proc: exitApplicationDirectly, pid=" + android.os.Process.myPid());
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMAppMgr", "exitApplicationDirectly", new java.lang.Object[0]);
        mm.g0.f328483a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        gm0.j1.i().f273208a.f273302g.e(false);
        com.tencent.mm.sdk.platformtools.MMNativeJpeg.Destroy();
        if (c01.d9.e() != null && c01.d9.e().f70764d != null) {
            c01.d9.e().f70764d.r1(false);
        }
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI != null) {
            launcherUI.finish();
        }
        com.tencent.mm.plugin.report.service.f0.e(8);
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 2;
        logoutEvent.e();
        com.tencent.mm.ui.vb.k();
        com.tencent.mars.xlog.Log.appenderClose();
        mm.k kVar = mm.k.N;
        if (kVar.h()) {
            if (kVar.h()) {
                java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.tencent.mm.sdk.platformtools.x2.f193071a)).iterator();
                while (it.hasNext()) {
                    m3.d dVar = (m3.d) it.next();
                    if (((java.lang.String) dVar.f323093b).contains(":")) {
                        java.lang.String str = (java.lang.String) dVar.f323093b;
                        if (!str.equals(com.tencent.mm.sdk.platformtools.w9.f193054b) && !str.equals(com.tencent.mm.sdk.platformtools.w9.f193056d)) {
                            int intValue = ((java.lang.Integer) dVar.f323092a).intValue();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(java.lang.Integer.valueOf(intValue));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        }
                    }
                }
            } else {
                m45.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193072b + ":recovery", com.tencent.mm.sdk.platformtools.x2.f193072b + ":support", com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand0", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand1", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand2", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand3", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand4");
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
