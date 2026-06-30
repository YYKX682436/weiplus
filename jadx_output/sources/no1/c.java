package no1;

/* loaded from: classes5.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        if (((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            pm0.v.X(no1.a.f338734d);
        } else {
            com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", "Skip to start foreground service, roam is not enable");
        }
    }

    public final void b() {
        if (!((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", "Skip to stop foreground service, roam is not enable");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop: ");
        sb6.append(com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92725g != null);
        com.tencent.mars.xlog.Log.i("MircoMsg.RoamForegroundService", sb6.toString());
        pm0.v.X(no1.b.f338735d);
    }
}
