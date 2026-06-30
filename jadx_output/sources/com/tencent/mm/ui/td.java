package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class td {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.ui.md f209893c = new com.tencent.mm.ui.md(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f209894d = new java.util.concurrent.ConcurrentHashMap(16);

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f209895e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.Executor f209896f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f209897a = new java.util.concurrent.ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f209898b = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        boolean z17;
        try {
            java.lang.reflect.Field declaredField = android.os.Looper.class.getDeclaredField("sThreadLocal");
            f209895e = declaredField;
            z17 = true;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            java.lang.reflect.Field field = f209895e;
            if (field != null) {
                field.get(null);
            }
        } catch (java.lang.Throwable th6) {
            z17 = false;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMLayoutPrefetcher", th6, "[-] Fail to init Looper injection, ignore preload requests.", new java.lang.Object[0]);
            f209895e = null;
        }
        if (!z17) {
            f209896f = null;
            return;
        }
        qo.m mVar = (qo.m) i95.n0.c(qo.m.class);
        com.tencent.mm.ui.ld ldVar = com.tencent.mm.ui.ld.f209077d;
        ((qo.c) mVar).getClass();
        f209896f = qo.q.f365321a.a("MicroMsg.MMLayoutPrefetcher", ldVar);
    }

    public td(kotlin.jvm.internal.i iVar) {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigLayoutPreload()) == 1 && com.tencent.mm.ui.bk.F()) {
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources() == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMLayoutPrefetcher", "[!] Fail to update configuration for night mode, which may cause white block in preloaded layouts.");
                return;
            }
            android.content.res.Configuration configuration = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration();
            j65.m.c(configuration, com.tencent.mm.ui.bk.C());
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            if (resources instanceof j65.j) {
                ((j65.j) resources).i(configuration);
            }
        }
    }

    public final android.view.View a(android.view.LayoutInflater inflater, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        com.tencent.mm.ui.nd status;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mm.ui.od odVar = (com.tencent.mm.ui.od) this.f209897a.remove(java.lang.Integer.valueOf(i17));
        if (odVar == null) {
            return b(inflater, i17, viewGroup, z17);
        }
        synchronized (odVar.f209469a) {
            status = odVar.f209470b;
            kotlin.jvm.internal.o.g(status, "status");
            odVar.f209470b = status == com.tencent.mm.ui.nd.f209412d ? com.tencent.mm.ui.nd.f209414f : status;
            odVar.f209469a.notifyAll();
        }
        if (status == com.tencent.mm.ui.nd.f209412d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMLayoutPrefetcher", "[+] resource 0x%x is still in queue, inflate it directly.", java.lang.Integer.valueOf(i17));
            return b(inflater, i17, viewGroup, z17);
        }
        if (status == com.tencent.mm.ui.nd.f209413e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLayoutPrefetcher", "[+] resource 0x%x is still preloading, wait until finished.", java.lang.Integer.valueOf(i17));
            com.tencent.mm.ui.nd ndVar = com.tencent.mm.ui.nd.f209414f;
            synchronized (odVar.f209469a) {
                while (odVar.f209470b != ndVar) {
                    odVar.f209469a.wait();
                }
            }
        } else if (status != com.tencent.mm.ui.nd.f209414f) {
            throw new java.lang.IllegalStateException("Should not be here.");
        }
        android.view.View view = odVar.f209471c;
        if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMLayoutPrefetcher", "[+] resource 0x%x preloads failed, inflate it directly.", java.lang.Integer.valueOf(i17));
            return b(inflater, i17, viewGroup, z17);
        }
        if (viewGroup == null || !z17) {
            return view;
        }
        viewGroup.addView(view);
        return view;
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        com.tencent.mm.ui.qd qdVar = new com.tencent.mm.ui.qd(layoutInflater, i17, viewGroup, z17);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (android.os.Process.myPid() == android.os.Process.myTid()) {
            h0Var.f310123d = qdVar.invoke();
        } else {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            this.f209898b.post(new com.tencent.mm.ui.pd(h0Var, qdVar, countDownLatch));
            countDownLatch.await();
        }
        return (android.view.View) h0Var.f310123d;
    }
}
