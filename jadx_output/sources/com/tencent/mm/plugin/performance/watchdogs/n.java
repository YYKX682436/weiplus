package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.n f153103d = new com.tencent.mm.plugin.performance.watchdogs.n();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.util.StatusInfo a17 = com.tencent.matrix.util.StatusInfo.f53126o.a(android.os.Process.myPid());
        if (com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.active()) {
            int i17 = a17.f53134n;
            int i18 = a17.f53133m;
            if ((i18 == 0 || i18 == Integer.MAX_VALUE) && (i17 == 0 || i17 == Integer.MAX_VALUE)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ForegroundOomAdjWatchDog", "foreground oom_adj/oom_score_adj error: " + i18 + ", " + i17);
            ri.i0 i0Var = ri.k0.f395920a;
            org.json.JSONObject a18 = ri.l0.a(kz5.c1.k(new jz5.l("oom_adj", java.lang.Integer.valueOf(i18)), new jz5.l("oom_score_adj", java.lang.Integer.valueOf(i17))));
            i0Var.a(new ri.j0(7, null, 0, 0, 0L, 0L, 0L, 0, null, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, a18 != null ? ri.l0.b(a18) : null, 0, 0, null, null, 0, 0, -67108866, 1, null));
        }
    }
}
