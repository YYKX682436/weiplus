package qe4;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {
    public e(qe4.f fVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SOTER_REPORT_TIMESTAMP_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue <= 86400000 || !cu5.b.c()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1034, 1);
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
    }
}
