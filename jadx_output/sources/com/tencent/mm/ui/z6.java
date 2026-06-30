package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f212604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.d7 f212605e;

    public z6(com.tencent.mm.ui.d7 d7Var, com.tencent.mm.vfs.r6 r6Var) {
        this.f212605e = d7Var;
        this.f212604d = r6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "storageDisableAlertExpt on");
        com.tencent.mm.vfs.r6 r6Var = this.f212604d;
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.io.IOException unused) {
            }
        }
        boolean z17 = l75.d1.f316945a;
        boolean z18 = l75.d1.f316947c;
        com.tencent.mm.ui.d7 d7Var = this.f212605e;
        if (z18) {
            jx3.f.INSTANCE.d(25984, 400, "", "", "");
            l75.d1.f316948d = true;
            fp.r0.f265232a.f(d7Var.f208330d.f209450a);
            return;
        }
        fp.r0 r0Var = fp.r0.f265232a;
        long a17 = r0Var.a();
        fp.p0 b17 = r0Var.b(a17);
        if (b17 == fp.p0.f265227e) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.ui.o7 o7Var = d7Var.f208330d;
            if (currentTimeMillis - o7Var.f209460k > 10800000) {
                long a18 = com.tencent.mm.ui.o7.a(o7Var);
                d7Var.f208330d.f209460k = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "auto clean cache first, sizeCleaned = " + a18);
                jx3.f.INSTANCE.d(25984, 300, "", "", "", java.lang.Long.valueOf(a18));
                return;
            }
            return;
        }
        fp.p0 p0Var = fp.p0.f265228f;
        if (b17 == p0Var || lp.l.b(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            long a19 = com.tencent.mm.ui.o7.a(d7Var.f208330d);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "will show alert, auto clean cache first, sizeCleaned = " + a19);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(25984, 301, "", "", "", java.lang.Long.valueOf(a19));
            if (a19 < 0 || r0Var.b(a17 + a19) == p0Var || lp.l.b(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                r0Var.f(d7Var.f208330d.f209450a);
            } else {
                fVar.d(25984, 302, "", "", "", java.lang.Long.valueOf(a19));
            }
        }
    }
}
